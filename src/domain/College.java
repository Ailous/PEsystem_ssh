package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * College entity. @author MyEclipse Persistence Tools
 */

public class College implements java.io.Serializable {

	// Fields

	private Integer id;
	private String colName;
	private Set professions = new HashSet(0);

	// Constructors

	/** default constructor */
	public College() {
	}

	/** minimal constructor */
	public College(Integer id, String colName) {
		this.id = id;
		this.colName = colName;
	}

	/** full constructor */
	public College(Integer id, String colName, Set professions) {
		this.id = id;
		this.colName = colName;
		this.professions = professions;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColName() {
		return this.colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public Set getProfessions() {
		return this.professions;
	}

	public void setProfessions(Set professions) {
		this.professions = professions;
	}

}