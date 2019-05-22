package web.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import domain.StartClass;
import service.AdminService;

public class Admin_allStartClassInfo extends ActionSupport{
	private List<StartClass> allStartClassInfo;
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	public String execute() throws Exception{
		allStartClassInfo = adminService.admin_allStartClassInfo();
		return SUCCESS;
	}

	public List<StartClass> getAllStartClassInfo() {
		return allStartClassInfo;
	}

	public void setAllStartClassInfo(List<StartClass> allStartClassInfo) {
		this.allStartClassInfo = allStartClassInfo;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	
}
