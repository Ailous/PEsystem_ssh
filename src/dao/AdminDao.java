package dao;

import java.util.List;

import domain.Course;
import domain.StartClass;
import domain.Student;
import domain.Teacher;

public interface AdminDao {
	public List<Student> allStuInfo();  //admin 显示所有学生的信息
	public boolean admin_deleteThisStu(Integer stuId);  //删除某一个学生
	public boolean admin_addStu(Student student, String stuYear);  //添加一个学生
	public Integer admin_findProfession(String findGoal);  //查找是否有该专业
	public List<Teacher> admin_allTeacherInfo();  //查询所有教师信息
	public boolean admin_deleteThisTea(Integer teaId);  //删除指定教师
	public boolean admin_addTeacher(Teacher teacher);  //添加教师
	public List<Course> admin_allCourseInfo();  //查询所有课程信息
	public boolean admin_deleteThisCourse(Integer couId);  //删除某一门课程
	public boolean admin_existingThisCourse(String couName);  //添加课程前查看是否存在该门课程
	public boolean admin_addCourse(String couName, int couHour, int couCredit);  //添加课程
	public List<StartClass> admin_allStartClassInfo();  //查询所有的开课班信息
	public boolean admin_deleteThisStartClassAction(Integer id);  //删除某一门开课班
	public boolean admin_findCourseById(Integer couId);  //根据课程id查找
	public Integer admin_findTeacherByNo(String teaNo);  //根据工号查找教师
	public boolean admin_addStartClass(Integer couId, Integer teaId, String claLocation, String claTime);  //添加开课班
	
}
