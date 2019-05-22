package web.action;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.AdminService;

public class Admin_addStartClassAction extends ActionSupport{
	private Integer addCourseId;
	private String addTeacherNo;
	private String addLocation;
	private String addTime;
	private Integer teaId = null;
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	public void validate(){
		if(addTeacherNo.length()<=0 || addTeacherNo.length()>5)
			this.addFieldError("addTeacherNo", "请输入正确的教师工号");
		else if(addCourseId==null)
			this.addFieldError("addCourseId", "请输入课程id号");
		else if(addLocation.length()<=0 || addLocation.length()>50)
			this.addFieldError("addLocation", "请输入上课地点，且地点长度不超过50");
		else if(addTime.length()<=0 || addTime.length()>50)
			this.addFieldError("addTime", "请输入上课时间，且长度不超过50");
		else{
			//接下来判断是否含有该课程
			if(adminService.admin_findCourseById(addCourseId)==false)
				this.addFieldError("addCourseId", "不存在该课程，请重新确认课程id");
			//接下来安顿是否含有该教师
			teaId = adminService.admin_findTeacherByNo(addTeacherNo);
			if(teaId==null)
				this.addFieldError("addTeacherNo", "不存在该教师，请重新确认教师工号");
		}
	}
	
	public String execute() throws Exception{
		//向数据库添加开课班
		if(adminService.admin_addStartClass(addCourseId, teaId, addLocation, addTime))
			return SUCCESS;
		else
			return INPUT;
	}

	public Integer getAddCourseId() {
		return addCourseId;
	}

	public void setAddCourseId(Integer addCourseId) {
		this.addCourseId = addCourseId;
	}

	public String getAddTeacherNo() {
		return addTeacherNo;
	}

	public void setAddTeacherNo(String addTeacherNo) {
		this.addTeacherNo = addTeacherNo;
	}

	public String getAddLocation() {
		return addLocation;
	}

	public void setAddLocation(String addLocation) {
		this.addLocation = addLocation;
	}

	public String getAddTime() {
		return addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}
	
	
}
