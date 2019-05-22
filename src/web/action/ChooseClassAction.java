package web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import service.StudentService;
import service.UserService;

public class ChooseClassAction extends ActionSupport{  //选课Action
	
	@Resource(name="studentService")
	private StudentService studentService;
	
	private int startClassId;
	
	public ChooseClassAction(){}
	
	public String execute() throws Exception{
		HttpSession mySession = ServletActionContext.getRequest().getSession(); 
        String stuNo = (String) mySession.getAttribute("STUDENT_NO");  //学生的学号
        if(studentService.chooseClass(stuNo, startClassId))
        	return SUCCESS;
        else
        	return INPUT;
	}

	public int getStartClassId() {
		return startClassId;
	}

	public void setStartClassId(int startClassId) {
		this.startClassId = startClassId;
	}
	
}
