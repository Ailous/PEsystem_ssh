package web.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.AdminService;

public class Admin_addCourseAction extends ActionSupport{
	private String addName;
	private int addHour;
	private int addCredit;
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	public void validate(){
		if(addName.length()<=0 || addName.length()>30)
			this.addFieldError("addName", "请输入正确的课程名，并且长度小于30");
		else if(adminService.admin_existingThisCourse(addName))
			this.addFieldError("addName", "已存在该门课程");
		else{}
	}
	
	public String execute() throws Exception{
		if(adminService.admin_addCourse(addName, addHour, addCredit))
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

	public int getAddHour() {
		return addHour;
	}

	public void setAddHour(int addHour) {
		this.addHour = addHour;
	}

	public int getAddCredit() {
		return addCredit;
	}

	public void setAddCredit(int addCredit) {
		this.addCredit = addCredit;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	
}
