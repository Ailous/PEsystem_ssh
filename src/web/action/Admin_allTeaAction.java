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
	
	private int id; //界面显示数据的索引
	private final int pageSize=50; //每页显示记录的个数
	private int pageNo=1; //计数器,从第1页开始显示
	private int currentPage; //当前页
	private int totalPage; //总页数
	
	public Admin_allTeaAction(){}
	
	public void validate(){}
	
	public String execute() throws Exception{
		System.out.println("Admin_allTeaAction execute() ok");
		allTeacherInfo = adminService.admin_allTeacherInfo();  //获得所有数据，得到数据的总个数
		//计算总页数
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
//		//根据当前页查询要在该页上显示的5条数据
//		allTeacherInfo = ab.allTeacherInfoByPage(pageNo,pageSize);
//		//设置当前页
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
