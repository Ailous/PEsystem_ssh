package web.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.AdminService;

public class Admin_deleteThisStuAction extends ActionSupport{
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	private String stuId;
	
	public Admin_deleteThisStuAction(){}
	
	public String execute() throws Exception{
		if(adminService.admin_deleteThisStu(Integer.parseInt(stuId)))
			return SUCCESS;
		else
			return INPUT;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	
}
