package centaur.db;
// Generated 28-Feb-2017 15:38:29 by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;

/**
 * Polygon generated by hbm2java
 */
public class Polygon implements java.io.Serializable {

	private Integer id;
	private Subcatchment subcatchment;
	private BigDecimal x;
	private BigDecimal y;

	public Polygon() {
	}

	public Polygon(Subcatchment subcatchment, BigDecimal x, BigDecimal y) {
		this.subcatchment = subcatchment;
		this.x = x;
		this.y = y;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Subcatchment getSubcatchment() {
		return this.subcatchment;
	}

	public void setSubcatchment(Subcatchment subcatchment) {
		this.subcatchment = subcatchment;
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
