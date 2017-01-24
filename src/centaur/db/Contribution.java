package centaur.db;
// Generated 24-Jan-2017 16:06:00 by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;

/**
 * Contribution generated by hbm2java
 */
public class Contribution implements java.io.Serializable {

	private Integer id;
	private Candidate candidate;
	private Subcatchment subcatchment;
	private BigDecimal value;

	public Contribution() {
	}

	public Contribution(Candidate candidate, Subcatchment subcatchment, BigDecimal value) {
		this.candidate = candidate;
		this.subcatchment = subcatchment;
		this.value = value;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Subcatchment getSubcatchment() {
		return this.subcatchment;
	}

	public void setSubcatchment(Subcatchment subcatchment) {
		this.subcatchment = subcatchment;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

}
