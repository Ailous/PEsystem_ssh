package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Profession entity. @author MyEclipse Persistence Tools
 */

public class Profession implements java.io.Serializable {

	// Fields

	private Integer id;
	private College college;
	private String proName;
	private Set students = new HashSet(0);

	// Constructors

	/** default constructor */
	public Profession() {
	}

	/** minimal constructor */
	public Profession(Integer id, String proName) {
		this.id = id;
		this.proName = proName;
	}

	/** full constructor */
	public Profession(Integer id, College college, String proName, Set students) {
		this.id = id;
		this.college = college;
		this.proName = proName;
		this.students = students;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public College getCollege() {
		return this.college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

}