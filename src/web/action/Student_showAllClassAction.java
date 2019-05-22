package web.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.StudentService;

public class Student_showAllClassAction extends ActionSupport{
	List<Object[]> allClass = null;
	
	@Resource(name="studentService")
	private StudentService studentService;
	
	private int id; //界面显示数据的索引
	private final int pageSize=2; //每页显示记录的个数
	private int pageNo=1; //计数器,从第1页开始显示
	private int currentPage; //当前页
	private int totalPage; //总页数
	
	public Student_showAllClassAction(){}  //无参数构造方法
	
	public String execute() throws Exception{
		allClass = studentService.queryAllStartClass();  //获得所有数据，得到数据的总个数
		//计算总页数
//		if(allClass.size()%pageSize==0){
//			totalPage=allClass.size()/pageSize;
//		}else{
//			totalPage=allClass.size()/pageSize+1;
//		}
//		if(pageNo<=0){
//			pageNo=1;
//		}else if(pageNo>totalPage){
//			pageNo=totalPage;
//		}
//		//根据当前页查询要在该页上显示的5条数据
//		allClass = studentService.queryAllStartClassByPage(pageNo,pageSize);
//		//设置当前页
//		currentPage=pageNo;
		if(allClass!=null)
			return SUCCESS;
		else
			return INPUT;
	}

	public List<Object[]> getAllClass() {
		return allClass;
	}

	public void setAllClass(List<Object[]> allClass) {
		this.allClass = allClass;
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
