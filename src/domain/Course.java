package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Course entity. @author MyEclipse Persistence Tools
 */

public class Course implements java.io.Serializable {

	// Fields

	private Integer id;
	private String couName;
	private Integer couHour;
	private Integer couCredit;
	private Set startClasses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Course() {
	}

	/** minimal constructor */
	public Course(Integer id, String couName, Integer couHour, Integer couCredit) {
		this.id = id;
		this.couName = couName;
		this.couHour = couHour;
		this.couCredit = couCredit;
	}

	/** full constructor */
	public Course(Integer id, String couName, Integer couHour, Integer couCredit, Set startClasses) {
		this.id = id;
		this.couName = couName;
		this.couHour = couHour;
		this.couCredit = couCredit;
		this.startClasses = startClasses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCouName() {
		return this.couName;
	}

	public void setCouName(String couName) {
		this.couName = couName;
	}

	public Integer getCouHour() {
		return this.couHour;
	}

	public void setCouHour(Integer couHour) {
		this.couHour = couHour;
	}

	public Integer getCouCredit() {
		return this.couCredit;
	}

	public void setCouCredit(Integer couCredit) {
		this.couCredit = couCredit;
	}

	public Set getStartClasses() {
		return this.startClasses;
	}

	public void setStartClasses(Set startClasses) {
		this.startClasses = startClasses;
	}

}