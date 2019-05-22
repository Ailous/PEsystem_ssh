package domain;

/**
 * Score entity. @author MyEclipse Persistence Tools
 */

public class Score implements java.io.Serializable {

	// Fields

	private Integer id;
	private StartClass startClass;
	private Student student;
	private Integer score1;
	private Integer score2;
	private Integer score3;
	private Integer total;

	// Constructors

	/** default constructor */
	public Score() {
	}

	/** minimal constructor */
	public Score(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Score(Integer id, StartClass startClass, Student student, Integer score1, Integer score2, Integer score3,
			Integer total) {
		this.id = id;
		this.startClass = startClass;
		this.student = student;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.total = total;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public StartClass getStartClass() {
		return this.startClass;
	}

	public void setStartClass(StartClass startClass) {
		this.startClass = startClass;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getScore1() {
		return this.score1;
	}

	public void setScore1(Integer score1) {
		this.score1 = score1;
	}

	public Integer getScore2() {
		return this.score2;
	}

	public void setScore2(Integer score2) {
		this.score2 = score2;
	}

	public Integer getScore3() {
		return this.score3;
	}

	public void setScore3(Integer score3) {
		this.score3 = score3;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

}