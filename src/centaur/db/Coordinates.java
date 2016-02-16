package centaur.db;
// Generated Feb 15, 2016 11:31:22 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

/**
 * Coordinates generated by hbm2java
 */
public class Coordinates implements java.io.Serializable {

	private int idNode;
	private Node node;
	private BigDecimal x;
	private BigDecimal y;

	public Coordinates() {
	}

	public Coordinates(Node node) {
		this.node = node;
	}

	public Coordinates(Node node, BigDecimal x, BigDecimal y) {
		this.node = node;
		this.x = x;
		this.y = y;
	}

	public int getIdNode() {
		return this.idNode;
	}

	public void setIdNode(int idNode) {
		this.idNode = idNode;
	}

	public Node getNode() {
		return this.node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public BigDecimal getX() {
		return this.x;
	}

	public void setX(BigDecimal x) {
		this.x = x;
	}

	public BigDecimal getY() {
		return this.y;
	}

	public void setY(BigDecimal y) {
		this.y = y;
	}

}