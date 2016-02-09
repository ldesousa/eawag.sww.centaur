package centaur.db;
// Generated Feb 9, 2016 1:48:42 PM by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

/**
 * LinkCoordinatesId generated by hbm2java
 */
public class LinkCoordinatesId implements java.io.Serializable {

	private int id;
	private Integer idLink;
	private BigDecimal x;
	private BigDecimal y;

	public LinkCoordinatesId() {
	}

	public LinkCoordinatesId(int id) {
		this.id = id;
	}

	public LinkCoordinatesId(int id, Integer idLink, BigDecimal x, BigDecimal y) {
		this.id = id;
		this.idLink = idLink;
		this.x = x;
		this.y = y;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getIdLink() {
		return this.idLink;
	}

	public void setIdLink(Integer idLink) {
		this.idLink = idLink;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LinkCoordinatesId))
			return false;
		LinkCoordinatesId castOther = (LinkCoordinatesId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getIdLink() == castOther.getIdLink()) || (this.getIdLink() != null
						&& castOther.getIdLink() != null && this.getIdLink().equals(castOther.getIdLink())))
				&& ((this.getX() == castOther.getX())
						|| (this.getX() != null && castOther.getX() != null && this.getX().equals(castOther.getX())))
				&& ((this.getY() == castOther.getY())
						|| (this.getY() != null && castOther.getY() != null && this.getY().equals(castOther.getY())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getIdLink() == null ? 0 : this.getIdLink().hashCode());
		result = 37 * result + (getX() == null ? 0 : this.getX().hashCode());
		result = 37 * result + (getY() == null ? 0 : this.getY().hashCode());
		return result;
	}

}
