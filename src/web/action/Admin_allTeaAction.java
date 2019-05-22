package web.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import domain.Teacher;
import service.AdminService;

public class Admin_allTeaAction extends ActionSupport{
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	private List<Teacher> allTeacherInfo;
	
	private int id; //������ʾ���ݵ�����
	private final int pageSize=50; //ÿҳ��ʾ��¼�ĸ���
	private int pageNo=1; //������,�ӵ�1ҳ��ʼ��ʾ
	private int currentPage; //��ǰҳ
	private int totalPage; //��ҳ��
	
	public Admin_allTeaAction(){}
	
	public void validate(){}
	
	public String execute() throws Exception{
		System.out.println("Admin_allTeaAction execute() ok");
		allTeacherInfo = adminService.admin_allTeacherInfo();  //����������ݣ��õ����ݵ��ܸ���
		//������ҳ��
//		if(allTeacherInfo.size()%pageSize==0){
//			totalPage=allTeacherInfo.size()/pageSize;
//		}else{
//			totalPage=allTeacherInfo.size()/pageSize+1;
//		}
//		if(pageNo<=0){
//			pageNo=1;
//		}else if(pageNo>totalPage){
//			pageNo=totalPage;
//		}
//		//���ݵ�ǰҳ��ѯҪ�ڸ�ҳ����ʾ��5������
//		allTeacherInfo = ab.allTeacherInfoByPage(pageNo,pageSize);
//		//���õ�ǰҳ
//		currentPage=pageNo;
		if(allTeacherInfo!=null)
			return SUCCESS;
		else
			return INPUT;
	}

	public List<Teacher> getAllTeacherInfo() {
		return allTeacherInfo;
	}

	public void setAllTeacherInfo(List<Teacher> allTeacherInfo) {
		this.allTeacherInfo = allTeacherInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	
}
