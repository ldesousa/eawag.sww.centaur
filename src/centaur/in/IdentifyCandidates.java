package centaur.in;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import centaur.db.Node;
import centaur.db.Link;


public class IdentifyCandidates {

	static SessionFactory factory;
	
	static LinkedList<Node> candidates;
	static ArrayList<Node> gates = new ArrayList<Node>();
	static ArrayList<Node> visited = new ArrayList<Node>();
	static ArrayList<Link> floodedLinks = new ArrayList<Link>();
	
	static BigDecimal currentOverflow = BigDecimal.valueOf(Double.MAX_VALUE);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session;
		Transaction tx;
		
		// => This code is common to ImportSWMM - must be refactored
		// Initialise database session
		try
		{
	         factory = new Configuration()
	        		 .configure("centaur.cfg.xml").buildSessionFactory();
	         session = factory.openSession();
	         tx = session.beginTransaction();
	    }
		catch (Throwable e) 
		{ 
	         System.err.println("Failed to initialise database session: " + e);
	         e.printStackTrace();
	         return;
	    }
			
		Query query = session.createSQLQuery(String.format(
				"SELECT id, elevation, name" +
				"  FROM centaur.node " +
				" WHERE id NOT IN (" +
				"       SELECT id_node_from" +
                "         FROM centaur.link)")).addEntity(Node.class);
	
		candidates = new LinkedList<Node>(query.list());
		
		while(candidates.size() > 0)
		{
			System.out.println("Candidates: " + candidates.size());
			Node n = candidates.pop();
			if(!visited.contains(n))
			{
				visited.add(n);		
				
				currentOverflow = BigDecimal.valueOf(Double.MAX_VALUE);
				floodedLinks = new ArrayList<Link>();
				
				Set<Link> links = n.getLinksForIdNodeTo();
				if(links.size() > 0)
				{
					System.out.println("--------\nId: " + n.getId() + " arrivals: " + links.size());
					gates.add(n);
					searchLinks(links);
					System.out.println("Calculated overflow: " + currentOverflow);
					System.out.println("Number of links: " + floodedLinks.size());
					prune();
					System.out.println("Number of links after pruning: " + floodedLinks.size());
					searchFollowingCandidates();
					save();
					System.out.println("Gates: " + gates.size());
					System.out.println("Visited: " + visited.size());
				}
			}
			
		}
		
		System.out.println("\nProposed gates: ");
		for (Node g : gates) System.out.println(g.getId());
	}

	protected static void analyseNode(Node n)
	{
		Set<Link> links = n.getLinksForIdNodeTo();
		
		// Search stops if:
		// 1. No links arrive at this node;
		// 2. This node is an outfall or a storage.
		if((links.size() <= 0) || (n.getOutfall() != null) || (n.getStorage() != null))
			updateCurrentOverflow(n.getElevation());
		else searchLinks(links);
	}
	
	protected static void searchLinks(Set<Link> links)
	{
		for (Link l : links)
		{
			//if it is a weir
			if (l.getWeir() != null) 
			{
				updateCurrentOverflow(l.getWeir().getCrestHeight());
				// Keep searching if the previous node is below the crest height.
				if (l.getNodeByIdNodeFrom().getElevation().compareTo(currentOverflow) < 0)
				{
					floodedLinks.add(l);
					analyseNode(l.getNodeByIdNodeFrom());
				}
			}
			//if it is a pump
			else if (l.getPump() != null) 
			{
				updateCurrentOverflow(l.getNodeByIdNodeTo().getElevation());
				return;
			}
			//if it is conduit
			else
			{
				floodedLinks.add(l);
				analyseNode(l.getNodeByIdNodeFrom());
			}
		}
	}
	
	protected static void updateCurrentOverflow(BigDecimal newLevel)
	{
		if(newLevel.compareTo(currentOverflow) < 0) currentOverflow = newLevel;
	}
	
	protected static void prune()
	{
		for (Iterator<Link> it = floodedLinks.iterator(); it.hasNext(); ) 
		{
		    Link l = it.next();
		    Node arrivalNode = l.getNodeByIdNodeTo();
		    if (arrivalNode.getElevation().compareTo(currentOverflow) > 0)
				it.remove();
		}
	}
	
	// Searches for the tips of the flooded sub-network.
	// Adds to candidates nodes in the following conditions
	// 1. node elevation > gate overflow
	// 2. node is an out fall
	// 3. node is a storage
	protected static void searchFollowingCandidates()
	{
		for(Link l : floodedLinks)
		{
			Node startNode =  l.getNodeByIdNodeFrom();
			if(!visited.contains(startNode) && 
			   (startNode.getElevation().compareTo(currentOverflow) > 0 ||
				startNode.getOutfall() != null || 
				startNode.getStorage() != null)
			  )
				candidates.push(startNode);
		}
	}
	
	protected static void save()
	{
		for(Link l : floodedLinks)
		{
			
		}
	}

}