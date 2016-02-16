package centaur.db;
// Generated Feb 15, 2016 11:31:22 AM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Curve generated by hbm2java
 */
public class Curve implements java.io.Serializable {

	private int id;
	private String name;
	private String type;
	private Set curveParameters = new HashSet(0);
	private Set pumps = new HashSet(0);
	private Set storages = new HashSet(0);

	public Curve() {
	}

	public Curve(int id) {
		this.id = id;
	}

	public Curve(int id, String name, String type, Set curveParameters, Set pumps, Set storages) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.curveParameters = curveParameters;
		this.pumps = pumps;
		this.storages = storages;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set getCurveParameters() {
		return this.curveParameters;
	}

	public void setCurveParameters(Set curveParameters) {
		this.curveParameters = curveParameters;
	}

	public Set getPumps() {
		return this.pumps;
	}

	public void setPumps(Set pumps) {
		this.pumps = pumps;
	}

	public Set getStorages() {
		return this.storages;
	}

	public void setStorages(Set storages) {
		this.storages = storages;
	}

}
