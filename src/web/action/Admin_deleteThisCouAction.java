package web.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.AdminService;

public class Admin_deleteThisCouAction extends ActionSupport{
	private Integer couId;
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	public String execute() throws Exception{
		if(adminService.admin_deleteThisCourse(couId))
			return SUCCESS;
		else
			return INPUT;
	}

	public Integer getCouId() {
		return couId;
	}

	public void setCouId(Integer couId) {
		this.couId = couId;
	}
	
	
}
