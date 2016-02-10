package centaur.db;
// Generated Feb 10, 2016 11:02:20 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

/**
 * Storage generated by hbm2java
 */
public class Storage implements java.io.Serializable {

	private int idNode;
	private Curve curve;
	private Node node;
	private BigDecimal maxDepth;
	private BigDecimal initDepth;
	private String shape;
	private Integer nameParams;
	private BigDecimal fevap;
	private BigDecimal psi;
	private BigDecimal ksat;
	private BigDecimal imd;

	public Storage() {
	}

	public Storage(Node node) {
		this.node = node;
	}

	public Storage(Curve curve, Node node, BigDecimal maxDepth, BigDecimal initDepth, String shape, Integer nameParams,
			BigDecimal fevap, BigDecimal psi, BigDecimal ksat, BigDecimal imd) {
		this.curve = curve;
		this.node = node;
		this.maxDepth = maxDepth;
		this.initDepth = initDepth;
		this.shape = shape;
		this.nameParams = nameParams;
		this.fevap = fevap;
		this.psi = psi;
		this.ksat = ksat;
		this.imd = imd;
	}

	public int getIdNode() {
		return this.idNode;
	}

	public void setIdNode(int idNode) {
		this.idNode = idNode;
	}

	public Curve getCurve() {
		return this.curve;
	}

	public void setCurve(Curve curve) {
		this.curve = curve;
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

	public String getShape() {
		return this.shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public Integer getNameParams() {
		return this.nameParams;
	}

	public void setNameParams(Integer nameParams) {
		this.nameParams = nameParams;
	}

	public BigDecimal getFevap() {
		return this.fevap;
	}

	public void setFevap(BigDecimal fevap) {
		this.fevap = fevap;
	}

	public BigDecimal getPsi() {
		return this.psi;
	}

	public void setPsi(BigDecimal psi) {
		this.psi = psi;
	}

	public BigDecimal getKsat() {
		return this.ksat;
	}

	public void setKsat(BigDecimal ksat) {
		this.ksat = ksat;
	}

	public BigDecimal getImd() {
		return this.imd;
	}

	public void setImd(BigDecimal imd) {
		this.imd = imd;
	}

}
