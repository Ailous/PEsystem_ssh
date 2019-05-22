package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private Profession profession;
	private String stuNo;
	private String stuName;
	private String stuSex;
	private String stuPhone;
	private String stuPassword;
	private Set scores = new HashSet(0);

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer id, String stuName, String stuSex, String stuPassword) {
		this.id = id;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuPassword = stuPassword;
	}

	/** full constructor */
	public Student(Integer id, Profession profession, String stuNo, String stuName, String stuSex, String stuPhone,
			String stuPassword, Set scores) {
		this.id = id;
		this.profession = profession;
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuSex = stuSex;
		this.stuPhone = stuPhone;
		this.stuPassword = stuPassword;
		this.scores = scores;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Profession getProfession() {
		return this.profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public String getStuNo() {
		return this.stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	public String getStuPhone() {
		return this.stuPhone;
	}

	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}

	public String getStuPassword() {
		return this.stuPassword;
	}

	public void setStuPassword(String stuPassword) {
		this.stuPassword = stuPassword;
	}

	public Set getScores() {
		return this.scores;
	}

	public void setScores(Set scores) {
		this.scores = scores;
	}

}