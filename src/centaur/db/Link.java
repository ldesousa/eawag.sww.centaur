package centaur.db;
// Generated Feb 15, 2016 9:54:40 AM by Hibernate Tools 4.3.1.Final

/**
 * Link generated by hbm2java
 */
public class Link implements java.io.Serializable {

	private int id;
	private Node nodeByIdNodeTo;
	private Node nodeByIdNodeFrom;
	private String name;
	private Weir weir;
	private Conduit conduit;
	private Pump pump;
	private Xsection xsection;

	public Link() {
	}

	public Link(int id) {
		this.id = id;
	}

	public Link(int id, Node nodeByIdNodeTo, Node nodeByIdNodeFrom, String name, Weir weir, Conduit conduit, Pump pump,
			Xsection xsection) {
		this.id = id;
		this.nodeByIdNodeTo = nodeByIdNodeTo;
		this.nodeByIdNodeFrom = nodeByIdNodeFrom;
		this.name = name;
		this.weir = weir;
		this.conduit = conduit;
		this.pump = pump;
		this.xsection = xsection;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Node getNodeByIdNodeTo() {
		return this.nodeByIdNodeTo;
	}

	public void setNodeByIdNodeTo(Node nodeByIdNodeTo) {
		this.nodeByIdNodeTo = nodeByIdNodeTo;
	}

	public Node getNodeByIdNodeFrom() {
		return this.nodeByIdNodeFrom;
	}

	public void setNodeByIdNodeFrom(Node nodeByIdNodeFrom) {
		this.nodeByIdNodeFrom = nodeByIdNodeFrom;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weir getWeir() {
		return this.weir;
	}

	public void setWeir(Weir weir) {
		this.weir = weir;
	}

	public Conduit getConduit() {
		return this.conduit;
	}

	public void setConduit(Conduit conduit) {
		this.conduit = conduit;
	}

	public Pump getPump() {
		return this.pump;
	}

	public void setPump(Pump pump) {
		this.pump = pump;
	}

	public Xsection getXsection() {
		return this.xsection;
	}

	public void setXsection(Xsection xsection) {
		this.xsection = xsection;
	}

}
