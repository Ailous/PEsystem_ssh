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
			this.addFieldError("addTeacherNo", "��������ȷ�Ľ�ʦ����");
		else if(addCourseId==null)
			this.addFieldError("addCourseId", "������γ�id��");
		else if(addLocation.length()<=0 || addLocation.length()>50)
			this.addFieldError("addLocation", "�������Ͽεص㣬�ҵص㳤�Ȳ�����50");
		else if(addTime.length()<=0 || addTime.length()>50)
			this.addFieldError("addTime", "�������Ͽ�ʱ�䣬�ҳ��Ȳ�����50");
		else{
			//�������ж��Ƿ��иÿγ�
			if(adminService.admin_findCourseById(addCourseId)==false)
				this.addFieldError("addCourseId", "�����ڸÿγ̣�������ȷ�Ͽγ�id");
			//�����������Ƿ��иý�ʦ
			teaId = adminService.admin_findTeacherByNo(addTeacherNo);
			if(teaId==null)
				this.addFieldError("addTeacherNo", "�����ڸý�ʦ��������ȷ�Ͻ�ʦ����");
		}
	}
	
	public String execute() throws Exception{
		//�����ݿ���ӿ��ΰ�
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
