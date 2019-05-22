package web.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import domain.Student;
import service.AdminService;
import service.TeacherService;

public class Admin_allStuAction extends ActionSupport{  //admin ��ʾ����ѧ����Ϣ
	private List<Student> allStu = null;
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	private Student student;
	private int id; //������ʾ���ݵ�����
	private final int pageSize=50; //ÿҳ��ʾ��¼�ĸ���
	private int pageNo=1; //������,�ӵ�1ҳ��ʼ��ʾ
	private int currentPage; //��ǰҳ
	private int totalPage; //��ҳ��
	
	public Admin_allStuAction(){}
	
	public String execute() throws Exception{
		allStu=adminService.allStuInfo();
		//������ҳ��
//		if(allStu.size()%pageSize==0){
//			totalPage=allStu.size()/pageSize;
//		}else{
//			totalPage=allStu.size()/pageSize+1;
//		}
//		if(pageNo<=0){
//			pageNo=1;
//		}else if(pageNo>totalPage){
//			pageNo=totalPage;
//		}
//		//���ݵ�ǰҳ��ѯҪ�ڸ�ҳ����ʾ��5������
//		allStu = ab.queryStuByPage(pageNo,pageSize);
//		//���õ�ǰҳ
//		currentPage=pageNo;
		if(allStu!=null)
			return SUCCESS;
		else
			return INPUT;
	}

	public List<Student> getAllStu() {
		return allStu;
	}

	public void setAllStu(List<Student> allStu) {
		this.allStu = allStu;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
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
