package web.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.AdminService;

public class Admin_deleteThisTeaAction extends ActionSupport{
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	private Integer teaId;
	
	public String execute() throws Exception{
		if(adminService.admin_deleteThisTea(teaId))
			return SUCCESS;
		else
			return INPUT;
		
	}

	public Integer getTeaId() {
		return teaId;
	}

	public void setTeaId(Integer teaId) {
		this.teaId = teaId;
	}
	
	
}
