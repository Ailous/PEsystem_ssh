package web.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import domain.StartClass;
import service.TeacherService;

public class Teacher_allClassInfoAction extends ActionSupport{
	private List<StartClass> allClass = null;
	
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	public String execute() throws Exception{
		HttpSession mySession = ServletActionContext.getRequest().getSession(); 
        String teaNo = (String) mySession.getAttribute("TEACHER_NO");
        allClass = teacherService.allClassInfo(teaNo);
		return SUCCESS;
	}

	public List<StartClass> getAllClass() {
		return allClass;
	}

	public void setAllClass(List<StartClass> allClass) {
		this.allClass = allClass;
	}
	
	
}
