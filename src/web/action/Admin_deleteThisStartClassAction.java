package web.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.AdminService;

public class Admin_deleteThisStartClassAction extends ActionSupport{
	private Integer startClassId;
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	public String execute() throws Exception{
		System.out.println("将要删除的课程id为"+startClassId);
		if(adminService.admin_deleteThisStartClassAction(startClassId))
			return SUCCESS;
		else
			return INPUT;
	}

	

	public Integer getStartClassId() {
		return startClassId;
	}



	public void setStartClassId(Integer startClassId) {
		this.startClassId = startClassId;
	}



	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	
}
