package web.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import domain.Score;
import service.TeacherService;

public class RefreshStuScoreAction extends ActionSupport{
	
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	private String stuNo;
	private String startClassId;
	
	private Score thisStu = null;
	
	public RefreshStuScoreAction(){}
	
	public String execute() throws Exception{
		System.out.println(stuNo+" ** "+startClassId);
		HttpServletRequest request = ServletActionContext.getRequest();
		ServletActionContext.getRequest().getSession().setAttribute("STU_NO", stuNo);
		request = ServletActionContext.getRequest();
		ServletActionContext.getRequest().getSession().setAttribute("STARTCLASSS_ID", startClassId);
		thisStu=teacherService.thisStudent(stuNo);
		
//		HttpServletRequest request = ServletActionContext.getRequest();
//		ServletActionContext.getRequest().getSession().setAttribute("SCORE_ID", thisStu.getId());
		
		return SUCCESS;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getStartClassId() {
		return startClassId;
	}

	public void setStartClassId(String startClassId) {
		this.startClassId = startClassId;
	}

	public Score getThisStu() {
		return thisStu;
	}

	public void setThisStu(Score thisStu) {
		this.thisStu = thisStu;
	}

	
}
