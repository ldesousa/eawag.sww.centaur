package centaur.db;
// Generated 06-Apr-2017 10:49:34 by Hibernate Tools 5.2.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Candidate generated by hbm2java
 */
public class Candidate implements java.io.Serializable {

	private int idNode;
	private Node node;
	private BigDecimal outflowElevation;
	private BigDecimal volume;
	private Set floodeds = new HashSet(0);

	public Candidate() {
	}

	public Candidate(Node node, BigDecimal outflowElevation) {
		this.node = node;
		this.outflowElevation = outflowElevation;
	}

	public Candidate(Node node, BigDecimal outflowElevation, BigDecimal volume, Set floodeds) {
		this.node = node;
		this.outflowElevation = outflowElevation;
		this.volume = volume;
		this.floodeds = floodeds;
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

	public BigDecimal getOutflowElevation() {
		return this.outflowElevation;
	}

	public void setOutflowElevation(BigDecimal outflowElevation) {
		this.outflowElevation = outflowElevation;
	}

	public BigDecimal getVolume() {
		return this.volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	public Set getFloodeds() {
		return this.floodeds;
	}

	public void setFloodeds(Set floodeds) {
		this.floodeds = floodeds;
	}

}
