package dao;

import java.util.List;

import domain.Score;

public interface StudentDao {
	public List<Object[]> getStudentByNo(String stuNo);  //根据学生学号获取学生信息
	public List<Object[]> queryAllStartClass();  //显示所有开课班来选课
	public List<Object[]> queryAllStartClassByPage(int pageNo,int pageSize);  //选课信息分页
	public boolean chooseClass(String stuNo, Integer startClassId);  //学生点击选择某一门开课班
	public List<Score> student_scoreInfo(String stuNo);  //学生的所有选课信息及成绩
	
}
