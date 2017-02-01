package centaur.db;
// Generated 01-Feb-2017 16:59:01 by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;

/**
 * Conduit generated by hbm2java
 */
public class Conduit implements java.io.Serializable {

	private int idLink;
	private Link link;
	private BigDecimal length;
	private BigDecimal roughness;
	private BigDecimal inOffset;
	private BigDecimal outOffset;
	private BigDecimal initFlow;
	private BigDecimal maxFlow;

	public Conduit() {
	}

	public Conduit(Link link) {
		this.link = link;
	}

	public Conduit(Link link, BigDecimal length, BigDecimal roughness, BigDecimal inOffset, BigDecimal outOffset,
			BigDecimal initFlow, BigDecimal maxFlow) {
		this.link = link;
		this.length = length;
		this.roughness = roughness;
		this.inOffset = inOffset;
		this.outOffset = outOffset;
		this.initFlow = initFlow;
		this.maxFlow = maxFlow;
	}

	public int getIdLink() {
		return this.idLink;
	}

	public void setIdLink(int idLink) {
		this.idLink = idLink;
	}

	public Link getLink() {
		return this.link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

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

}
