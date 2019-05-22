package service;

import java.util.List;

import domain.Score;
import domain.StartClass;
import domain.Teacher;

public interface TeacherService {
	public List<Teacher> teacher_info(String teaNo);  //教师个人信息
	public List<StartClass> allClassInfo(String teaNo);  //教师登陆查看授课班级信息
	public List<Score> classDetail(Integer classId);  //查看某个班级里的所有学生
	public Score thisStudent(String stuNo);  //找到指定学生的成绩
	public boolean refreshScore(String stuNo, Integer startClassNo, Integer score1, Integer score2, Integer score3);  //给指定学生添加成绩
}
