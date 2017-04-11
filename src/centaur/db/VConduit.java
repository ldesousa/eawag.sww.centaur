package centaur.db;
// Generated 06-Apr-2017 15:50:29 by Hibernate Tools 5.2.0.CR1

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * VConduit generated by hbm2java
 */
public class VConduit implements java.io.Serializable {

	private int id;
	private String name;
	private Integer idNodeFrom;
	private Integer idNodeTo;
	//private Serializable geom;
	private BigDecimal length;
	private BigDecimal roughness;
	private BigDecimal inOffset;
	private BigDecimal outOffset;
	private BigDecimal initFlow;
	private BigDecimal maxFlow;
	private Double slope;
	private Double area;
	private Double perimeter;
	private Double volume;
	private Double QMax;

	public VConduit() {
	}

	public VConduit(int id) {
		this.id = id;
	}

	public VConduit(int id, String name, Integer idNodeFrom, Integer idNodeTo, /*Serializable geom,*/ BigDecimal length,
			BigDecimal roughness, BigDecimal inOffset, BigDecimal outOffset, BigDecimal initFlow, BigDecimal maxFlow,
			Double slope, Double area, Double perimeter, Double volume, Double QMax) {
		this.id = id;
		this.name = name;
		this.idNodeFrom = idNodeFrom;
		this.idNodeTo = idNodeTo;
		//this.geom = geom;
		this.length = length;
		this.roughness = roughness;
		this.inOffset = inOffset;
		this.outOffset = outOffset;
		this.initFlow = initFlow;
		this.maxFlow = maxFlow;
		this.slope = slope;
		this.area = area;
		this.perimeter = perimeter;
		this.volume = volume;
		this.QMax = QMax;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdNodeFrom() {
		return this.idNodeFrom;
	}

	public void setIdNodeFrom(Integer idNodeFrom) {
		this.idNodeFrom = idNodeFrom;
	}

	public Integer getIdNodeTo() {
		return this.idNodeTo;
	}

	public void setIdNodeTo(Integer idNodeTo) {
		this.idNodeTo = idNodeTo;
	}

	/*public Serializable getGeom() {
		return this.geom;
	}

	public void setGeom(Serializable geom) {
		this.geom = geom;
	}*/

	public BigDecimal getLength() {
		return this.length;
	}

	public void setLength(BigDecimal length) {
		this.length = length;
	}

	public BigDecimal getRoughness() {
		return this.roughness;
	}

	public void setRoughness(BigDecimal roughness) {
		this.roughness = roughness;
	}

	public BigDecimal getInOffset() {
		return this.inOffset;
	}

	public void setInOffset(BigDecimal inOffset) {
		this.inOffset = inOffset;
	}

	public BigDecimal getOutOffset() {
		return this.outOffset;
	}

	public void setOutOffset(BigDecimal outOffset) {
		this.outOffset = outOffset;
	}

	public BigDecimal getInitFlow() {
		return this.initFlow;
	}

	public void setInitFlow(BigDecimal initFlow) {
		this.initFlow = initFlow;
	}

	public BigDecimal getMaxFlow() {
		return this.maxFlow;
	}

	public void setMaxFlow(BigDecimal maxFlow) {
		this.maxFlow = maxFlow;
	}

	public Double getSlope() {
		return this.slope;
	}

	public void setSlope(Double slope) {
		this.slope = slope;
	}

	public Double getArea() {
		return this.area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getPerimeter() {
		return this.perimeter;
	}

	public void setPerimeter(Double perimeter) {
		this.perimeter = perimeter;
	}

	public Double getVolume() {
		return this.volume;
	}

	public void setVolume(Double volume) {
		this.volume = volume;
	}

	public Double getQMax() {
		return this.QMax;
	}

	public void setQMax(Double QMax) {
		this.QMax = QMax;
	}

}
