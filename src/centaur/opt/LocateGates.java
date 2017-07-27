/* ****************************************************************************
 * Copyright (c) 2017 EAWAG - Swiss Federal Institute for Aquatic Research 
 *                            and Technology
 *
 * Author: Luís de Sousa [luis.desousa@eawag.ch]
 * Date: 26-07-2016
 * Description: 
 * Main class for the optimisation package. Contains utilitary methods managing
 * the database connection.
 * 
 * This software is licenced under the European Union Public Licence V. 1.1,
 * please check the LICENCE file for details or the web page:
 * https://joinup.ec.europa.eu/community/eupl/og_page/eupl
 * ***************************************************************************/
package centaur.opt;

import java.io.IOException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.Option;


// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public class LocateGates
{
	@Option(name="-s",usage="the database schema", required=true)
	protected  String schema;
	
	@Option(name="-n",usage="number of gates to locate", required=true)
	protected int numGates;
	
	@Option(name="-i",usage="identifier of a node of interest")
	protected int identifier;
	
	@Option(name="-st",usage="compute flooded segments with Static assumption")
	private boolean assumeStatic = false;
	
	@Option(name="-sd",usage="compute flooded segments with Dynamic assumption")
	private boolean assumeDynamic = false;
	
	@Option(name="-a",usage="use Area in search function", forbids={"-oa"})
	private boolean useArea = false;
	
	@Option(name="-c",usage="use number of Catchments in search function", forbids={"-oa"})
	private boolean useCatchments = false;
	
	@Option(name="-oa",usage="use search function over Area", forbids={"-a", "-c"})
	private boolean overArea = false;
	
	@Option(name = "-h", aliases = "--help", required = false, usage = "Print help text")
    private boolean printHelp = false;
	
	/** The database session factory. */
	protected  SessionFactory factory;
	
	/** The database session. */
	protected  Session session;
	
	/** The database transaction. */
	protected  Transaction tx;
	
	/**
	 * Sets the up the connection to the database, creating a new session and 
	 * initiating a transaction.
	 */
	protected  void setUpConnection(String schema)
	{
		try
		{
	         factory = new Configuration()
	        		 .configure(schema + ".cfg.xml").buildSessionFactory();	         
	         session = factory.openSession();
	         tx = session.beginTransaction();
	    }
		catch (Throwable e) 
		{ 
	         System.err.println("Failed to initialise database session: " + e);
	         e.printStackTrace();
	         return;
	    }
	}
	
	/**
	 * Commits to the database any data modified or created during the present 
	 * session. If successful, initiates a new transaction.
	 *
	 * @param session the database session.
	 * @param tx the database transaction.
	 */
	protected  void commitData(Session session, Transaction tx)
	{
		try
		{
	         tx.commit();
	         tx = session.beginTransaction();
	    }
		catch (HibernateException e) 
		{
	         System.err.println("Failed to commit objects to database: " + e);
	         e.printStackTrace();
	         session.close();  
	         System.exit(-1); 
	    }
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public void doMain(final String[] args) 
	{
		CmdLineParser parser = new CmdLineParser(this);
		if(!processArgs(parser, args)) System.exit(-1);
		
		setUpConnection(schema);
		
		if(assumeStatic)
		{
			FloodedSegmentsStatic staticSegments = new FloodedSegmentsStatic();
			staticSegments.compute(session, schema);
			commitData(session, tx);
		}
		
		if(assumeDynamic)
		{
			FloodedSegmentsDynamic dynamicSegments = new FloodedSegmentsDynamic();
			dynamicSegments.compute(session, schema);
			commitData(session, tx);
		}
		
		if(overArea)
			OptimalLocation.computeOverArea(session, numGates, identifier, schema);
		else
			OptimalLocation.computeByVolume(session, numGates, identifier, useArea, useCatchments, schema);
		
		session.close();		
    }
	
	/**
	 * The main method.
	 *
	 * @param parser CmdLineParser object with argument definitions
	 * @param args the command line arguments
	 */
	protected boolean processArgs(CmdLineParser parser, String[] args)
	{
        try 
        {
            // parse the arguments.
            parser.parseArgument(args);
        } 
        catch( CmdLineException e ) 
        {
            // if there's a problem in the command line,
            // you'll get this exception. this will report
            // an error message.
        	if(printHelp) System.err.println("Usage:");
        	else System.err.println(e.getMessage());
            System.err.println("java OptimalLocation [options...] arguments...");
            // print the list of available options
            parser.printUsage(System.err);
            System.err.println();
            
            // Print out the different operating modes
            System.err.println("Examples to obtain each of the 5 different heuristics:");
            System.err.println("           V : java OptimalLocation -s VAL -i N -n N");
            System.err.println("       V * A : java OptimalLocation -s VAL -i N -n N -a");
            System.err.println("       V / C : java OptimalLocation -s VAL -i N -n N -c");
            System.err.println("   V * A / C : java OptimalLocation -s VAL -i N -n N -a -c");
            System.err.println("       V / A : java OptimalLocation -s VAL -i N -n N -oa");
            System.err.println("Add to any of these -sd or -st to pre-compute flooded segments");
            System.err.println();
            System.err.println("Variables in the heuristics:");
            System.err.println("           V : flooded volume upstream the gate");
            System.err.println("           A : total area of sub-catchments contributing to the gate");
            System.err.println("           C : number of sub-catchments contributing to the gate");
            
            return false;
        }
        return true;
	}
	
	/**
	 * The required static main method. Only a stub to the real thing.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) throws IOException 
	{
        new LocateGates().doMain(args);
	}

}
