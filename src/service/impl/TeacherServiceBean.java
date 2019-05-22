package service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.StudentDao;
import dao.TeacherDao;
import domain.Score;
import domain.StartClass;
import domain.Teacher;
import service.TeacherService;

@Service("teacherService")
public class TeacherServiceBean implements TeacherService {
	
	@Resource(name="teacherDao")
	private TeacherDao teacherDao;
	
	@Override
	public List<Teacher> teacher_info(String teaNo) {
		return teacherDao.teacher_info(teaNo);
	}

	@Override
	public List<StartClass> allClassInfo(String teaNo) {
		return teacherDao.allClassInfo(teaNo);
	}

	@Override
	public List<Score> classDetail(Integer classId) {
		return teacherDao.classDetail(classId);
	}

	@Override
	public Score thisStudent(String stuNo) {
		return teacherDao.thisStudent(stuNo);
	}

	@Override
	public boolean refreshScore(String stuNo, Integer startClassNo, Integer score1, Integer score2, Integer score3) {
		return teacherDao.refreshScore(stuNo, startClassNo, score1, score2, score3);
	}

}
