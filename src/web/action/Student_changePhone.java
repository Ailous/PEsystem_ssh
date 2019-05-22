package web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import service.UserService;

public class Student_changePhone extends ActionSupport{
	
	@Resource(name="userService")
	private UserService userService;
	
	private String newPhoneNumber;
	
	public boolean isNumeric(String str){  
		for (int i = str.length();--i>=0;){    
			if (!Character.isDigit(str.charAt(i))){  
				return false;  
			}  
		}  
		return true;  
	}  
	
	public void validate(){
		if(newPhoneNumber.length()!=11 || !isNumeric(newPhoneNumber))
			this.addFieldError("newPhoneNumber", "请输入正确的11位数字的电话号码");
	}
	
	public String execute() throws Exception{
		HttpSession session = ServletActionContext.getRequest().getSession(); 
        String userNo = (String) session.getAttribute("STUDENT_NO");
        System.out.println("新的手机号码为："+newPhoneNumber);
        if(userService.changePhone(userNo, newPhoneNumber, "1"))
			return SUCCESS;
		else
			return INPUT;
	}

	public String getNewPhoneNumber() {
		return newPhoneNumber;
	}

	public void setNewPhoneNumber(String newPhoneNumber) {
		this.newPhoneNumber = newPhoneNumber;
	}
}
