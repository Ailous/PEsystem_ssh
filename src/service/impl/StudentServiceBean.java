package service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import dao.StudentDao;
import domain.Score;
import domain.Student;
import service.StudentService;

@Service("studentService")
public class StudentServiceBean implements StudentService {
	
	@Resource(name="studentDao")
	private StudentDao studentDao;
	
	@Override
	public List<Object[]> studentInfo() {
		HttpSession mySession = ServletActionContext.getRequest().getSession(); 
        String stuNo = (String) mySession.getAttribute("STUDENT_NO");
		return studentDao.getStudentByNo(stuNo);
	}

	@Override
	public List<Object[]> queryAllStartClass() {
		return studentDao.queryAllStartClass();
	}

	@Override
	public List<Object[]> queryAllStartClassByPage(int pageNo, int pageSize) {
		return studentDao.queryAllStartClassByPage(pageNo, pageSize);
	}

	@Override
	public boolean chooseClass(String stuNo, Integer startClassId) {
		return studentDao.chooseClass(stuNo, startClassId)==true?true:false;
	}

	@Override
	public List<Score> student_scoreInfo(String stuNo) {
		return studentDao.student_scoreInfo(stuNo);
	}

}
