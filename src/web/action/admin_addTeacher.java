package web.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import domain.Teacher;
import service.AdminService;

public class admin_addTeacher extends ActionSupport{
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	private String addName;
	private String addSex;
	
	public admin_addTeacher(){}
	
	public void validate(){
		if(addName.length()<=0 || addName.length()>30)
			this.addFieldError("addName", "请输入正确的用户名，长度不大于30");
	}
	
	public String execute() throws Exception{
		System.out.println(addName+" "+addSex);
		Teacher teacher = new Teacher();
		teacher.setTeaName(addName);
		teacher.setTeaSex(addSex);
		teacher.setTeaNo("NULL");
		teacher.setTeaPhone("NULL");
		teacher.setTeaPassword("1234");
		if(adminService.admin_addTeacher(teacher))
			return SUCCESS;
		else
			return INPUT;
	}

	public String getAddName() {
		return addName;
	}

	public void setAddName(String addName) {
		this.addName = addName;
	}

	public String getAddSex() {
		return addSex;
	}

	public void setAddSex(String addSex) {
		this.addSex = addSex;
	}
	
	
}
