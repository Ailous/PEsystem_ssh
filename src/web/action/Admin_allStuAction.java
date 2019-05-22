package web.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import domain.Student;
import service.AdminService;
import service.TeacherService;

public class Admin_allStuAction extends ActionSupport{  //admin 显示所有学生信息
	private List<Student> allStu = null;
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	private Student student;
	private int id; //界面显示数据的索引
	private final int pageSize=50; //每页显示记录的个数
	private int pageNo=1; //计数器,从第1页开始显示
	private int currentPage; //当前页
	private int totalPage; //总页数
	
	public Admin_allStuAction(){}
	
	public String execute() throws Exception{
		allStu=adminService.allStuInfo();
		//计算总页数
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
//		//根据当前页查询要在该页上显示的5条数据
//		allStu = ab.queryStuByPage(pageNo,pageSize);
//		//设置当前页
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
