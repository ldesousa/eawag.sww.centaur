package centaur.db;
// Generated 25-Jan-2017 14:43:53 by Hibernate Tools 5.2.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * VJunction generated by hbm2java
 */
public class VJunction implements java.io.Serializable {

	private int idNode;
	private BigDecimal elevation;
	private String name;
	//private Serializable geom;
	private BigDecimal maxDepth;
	private BigDecimal initDepth;
	private BigDecimal surDepth;
	private BigDecimal aponded;
	private Double energySlope;

	public VJunction() {
	}

	public VJunction(int idNode) {
		this.idNode = idNode;
	}

	public VJunction(int idNode, BigDecimal elevation, String name, /*Serializable geom,*/ BigDecimal maxDepth,
			BigDecimal initDepth, BigDecimal surDepth, BigDecimal aponded, Double energySlope) {
		this.idNode = idNode;
		this.elevation = elevation;
		this.name = name;
		//this.geom = geom;
		this.maxDepth = maxDepth;
		this.initDepth = initDepth;
		this.surDepth = surDepth;
		this.aponded = aponded;
		this.energySlope = energySlope;
	}

	public int getIdNode() {
		return this.idNode;
	}

	public void setIdNode(int idNode) {
		this.idNode = idNode;
	}

	public BigDecimal getElevation() {
		return this.elevation;
	}

	public void setElevation(BigDecimal elevation) {
		this.elevation = elevation;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public Serializable getGeom() {
		return this.geom;
	}

	public void setGeom(Serializable geom) {
		this.geom = geom;
	}*/

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

	public Double getEnergySlope() {
		return this.energySlope;
	}

	public void setEnergySlope(Double energySlope) {
		this.energySlope = energySlope;
	}

}