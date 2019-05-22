package web.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import domain.Teacher;
import service.StudentService;
import service.TeacherService;

public class Teacher_infoAction extends ActionSupport{
	private List<Teacher> teacherInfo;
	
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	public String execute() throws Exception{
		HttpSession session = ServletActionContext.getRequest().getSession(); 
        String teaNo = (String) session.getAttribute("TEACHER_NO");
        teacherInfo=teacherService.teacher_info(teaNo);
		return SUCCESS;
	}

	public List<Teacher> getTeacherInfo() {
		return teacherInfo;
	}

	public void setTeacherInfo(List<Teacher> teacherInfo) {
		this.teacherInfo = teacherInfo;
	}

	
}
