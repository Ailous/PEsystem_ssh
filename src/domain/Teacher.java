package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer id;
	private String teaNo;
	private String teaName;
	private String teaSex;
	private String teaPhone;
	private String teaPassword;
	private Set startClasses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Integer id, String teaName, String teaSex, String teaPassword) {
		this.id = id;
		this.teaName = teaName;
		this.teaSex = teaSex;
		this.teaPassword = teaPassword;
	}

	/** full constructor */
	public Teacher(Integer id, String teaNo, String teaName, String teaSex, String teaPhone, String teaPassword,
			Set startClasses) {
		this.id = id;
		this.teaNo = teaNo;
		this.teaName = teaName;
		this.teaSex = teaSex;
		this.teaPhone = teaPhone;
		this.teaPassword = teaPassword;
		this.startClasses = startClasses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTeaNo() {
		return this.teaNo;
	}

	public void setTeaNo(String teaNo) {
		this.teaNo = teaNo;
	}

	public String getTeaName() {
		return this.teaName;
	}

	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}

	public String getTeaSex() {
		return this.teaSex;
	}

	public void setTeaSex(String teaSex) {
		this.teaSex = teaSex;
	}

	public String getTeaPhone() {
		return this.teaPhone;
	}

	public void setTeaPhone(String teaPhone) {
		this.teaPhone = teaPhone;
	}

	public String getTeaPassword() {
		return this.teaPassword;
	}

	public void setTeaPassword(String teaPassword) {
		this.teaPassword = teaPassword;
	}

	public Set getStartClasses() {
		return this.startClasses;
	}

	public void setStartClasses(Set startClasses) {
		this.startClasses = startClasses;
	}

}