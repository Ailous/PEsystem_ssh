package web.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import domain.Score;
import service.TeacherService;

public class ClassDetailAction extends ActionSupport{
	
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	private List<Score> myClassStudent = null;
	
	private int classId;
	
	public ClassDetailAction(){}
	
	public String execute() throws Exception{
		myClassStudent = teacherService.classDetail(classId);
		return SUCCESS;
	}

	public List<Score> getMyClassStudent() {
		return myClassStudent;
	}

	public void setMyClassStudent(List<Score> myClassStudent) {
		this.myClassStudent = myClassStudent;
	}

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
	}
	
	
}
