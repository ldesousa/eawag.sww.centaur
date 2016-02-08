package centaur.db;
// Generated Feb 8, 2016 11:39:21 AM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

/**
 * Subcatchment generated by hbm2java
 */
public class Subcatchment implements java.io.Serializable {

	private String id;
	private Node node;
	private Raingage raingage;
	private BigDecimal area;
	private BigDecimal imperv;
	private BigDecimal width;
	private BigDecimal slope;
	private BigDecimal curbLen;
	private String snowPack;
	private Subarea subarea;

	public Subcatchment() {
	}

	public Subcatchment(String id) {
		this.id = id;
	}

	public Subcatchment(String id, Node node, Raingage raingage, BigDecimal area, BigDecimal imperv, BigDecimal width,
			BigDecimal slope, BigDecimal curbLen, String snowPack, Subarea subarea) {
		this.id = id;
		this.node = node;
		this.raingage = raingage;
		this.area = area;
		this.imperv = imperv;
		this.width = width;
		this.slope = slope;
		this.curbLen = curbLen;
		this.snowPack = snowPack;
		this.subarea = subarea;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Node getNode() {
		return this.node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public Raingage getRaingage() {
		return this.raingage;
	}

	public void setRaingage(Raingage raingage) {
		this.raingage = raingage;
	}

	public BigDecimal getArea() {
		return this.area;
	}

	public void setArea(BigDecimal area) {
		this.area = area;
	}

	public BigDecimal getImperv() {
		return this.imperv;
	}

	public void setImperv(BigDecimal imperv) {
		this.imperv = imperv;
	}

	public BigDecimal getWidth() {
		return this.width;
	}

	public void setWidth(BigDecimal width) {
		this.width = width;
	}

	public BigDecimal getSlope() {
		return this.slope;
	}

	public void setSlope(BigDecimal slope) {
		this.slope = slope;
	}

	public BigDecimal getCurbLen() {
		return this.curbLen;
	}

	public void setCurbLen(BigDecimal curbLen) {
		this.curbLen = curbLen;
	}

	public String getSnowPack() {
		return this.snowPack;
	}

	public void setSnowPack(String snowPack) {
		this.snowPack = snowPack;
	}

	public Subarea getSubarea() {
		return this.subarea;
	}

	public void setSubarea(Subarea subarea) {
		this.subarea = subarea;
	}

}
