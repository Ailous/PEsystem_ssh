package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.AdminDao;
import dao.StudentDao;
import domain.Course;
import domain.StartClass;
import domain.Student;
import domain.Teacher;
import service.AdminService;

@Service("adminService")
public class AdminServiceBean implements AdminService {
	
	@Resource(name="adminDao")
	private AdminDao adminDao;
	
	@Override
	public List<Student> allStuInfo() {
		return adminDao.allStuInfo();
	}

	@Override
	public boolean admin_deleteThisStu(Integer stuId) {
		return adminDao.admin_deleteThisStu(stuId);
	}

	@Override
	public boolean admin_addStu(Student student, String stuYear) {
		return adminDao.admin_addStu(student, stuYear);
	}

	@Override
	public Integer admin_findProfession(String findGoal) {
		return adminDao.admin_findProfession(findGoal);
	}

	@Override
	public List<Teacher> admin_allTeacherInfo() {
		return adminDao.admin_allTeacherInfo();
	}

	@Override
	public boolean admin_deleteThisTea(Integer teaId) {
		return adminDao.admin_deleteThisTea(teaId);
	}

	@Override
	public boolean admin_addTeacher(Teacher teacher) {
		return adminDao.admin_addTeacher(teacher);
	}

	@Override
	public List<Course> admin_allCourseInfo() {
		return adminDao.admin_allCourseInfo();
	}

	@Override
	public boolean admin_deleteThisCourse(Integer couId) {
		if(adminDao.admin_deleteThisCourse(couId))
			return true;
		else
			return false;
	}

	@Override
	public boolean admin_existingThisCourse(String couName) {
		if(adminDao.admin_existingThisCourse(couName))
			return true;
		else
			return false;
	}

	@Override
	public boolean admin_addCourse(String couName, int couHour, int couCredit) {
		if(adminDao.admin_addCourse(couName, couHour, couCredit))
			return true;
		else
			return false;
	}

	@Override
	public List<StartClass> admin_allStartClassInfo() {
		return adminDao.admin_allStartClassInfo();
	}

	@Override
	public boolean admin_deleteThisStartClassAction(Integer id) {
		if(adminDao.admin_deleteThisStartClassAction(id))
			return true;
		else
			return false;
	}

	@Override
	public boolean admin_findCourseById(Integer couId) {
		if(adminDao.admin_findCourseById(couId))
			return true;
		else
			return false;
	}

	@Override
	public Integer admin_findTeacherByNo(String teaNo) {
		return adminDao.admin_findTeacherByNo(teaNo);
	}

	@Override
	public boolean admin_addStartClass(Integer couId, Integer teaId, String claLocation, String claTime) {
		if(adminDao.admin_addStartClass(couId, teaId, claLocation, claTime))
			return true;
		else
			return false;
	}
}
