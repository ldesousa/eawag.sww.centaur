package centaur.db;
// Generated 01-Feb-2017 16:59:01 by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;

/**
 * Junction generated by hbm2java
 */
public class Junction implements java.io.Serializable {

	private int idNode;
	private Node node;
	private BigDecimal maxDepth;
	private BigDecimal initDepth;
	private BigDecimal surDepth;
	private BigDecimal aponded;

	public Junction() {
	}

	public Junction(Node node) {
		this.node = node;
	}

	public Junction(Node node, BigDecimal maxDepth, BigDecimal initDepth, BigDecimal surDepth, BigDecimal aponded) {
		this.node = node;
		this.maxDepth = maxDepth;
		this.initDepth = initDepth;
		this.surDepth = surDepth;
		this.aponded = aponded;
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

	public BigDecimal getMaxDepth() {
		return this.maxDepth;
	}

	public void setMaxDepth(BigDecimal maxDepth) {
		this.maxDepth = maxDepth;
	}

	public BigDecimal getInitDepth() {
		return this.initDepth;
	}

	public void setInitDepth(BigDecimal initDepth) {
		this.initDepth = initDepth;
	}

	public BigDecimal getSurDepth() {
		return this.surDepth;
	}

	public void setSurDepth(BigDecimal surDepth) {
		this.surDepth = surDepth;
	}

	public BigDecimal getAponded() {
		return this.aponded;
	}

	public void setAponded(BigDecimal aponded) {
		this.aponded = aponded;
	}

}
