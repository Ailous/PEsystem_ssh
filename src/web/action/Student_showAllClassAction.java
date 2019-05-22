package web.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;

import service.StudentService;

public class Student_showAllClassAction extends ActionSupport{
	List<Object[]> allClass = null;
	
	@Resource(name="studentService")
	private StudentService studentService;
	
	private int id; //������ʾ���ݵ�����
	private final int pageSize=2; //ÿҳ��ʾ��¼�ĸ���
	private int pageNo=1; //������,�ӵ�1ҳ��ʼ��ʾ
	private int currentPage; //��ǰҳ
	private int totalPage; //��ҳ��
	
	public Student_showAllClassAction(){}  //�޲������췽��
	
	public String execute() throws Exception{
		allClass = studentService.queryAllStartClass();  //����������ݣ��õ����ݵ��ܸ���
		//������ҳ��
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
//		//���ݵ�ǰҳ��ѯҪ�ڸ�ҳ����ʾ��5������
//		allClass = studentService.queryAllStartClassByPage(pageNo,pageSize);
//		//���õ�ǰҳ
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
