package centaur.db;
// Generated Feb 25, 2016 10:04:09 AM by Hibernate Tools 4.3.1.Final

/**
 * Flooded generated by hbm2java
 */
public class Flooded implements java.io.Serializable {

	private Integer idFlooded;
	private Candidate candidate;
	private Link link;

	public Flooded() {
	}

	public Flooded(Candidate candidate, Link link) {
		this.candidate = candidate;
		this.link = link;
	}

	public Integer getIdFlooded() {
		return this.idFlooded;
	}

	public void setIdFlooded(Integer idFlooded) {
		this.idFlooded = idFlooded;
	}

	public Candidate getCandidate() {
		return this.candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Link getLink() {
		return this.link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

}
