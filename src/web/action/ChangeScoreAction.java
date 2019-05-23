package web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.refreshScore;
import service.TeacherService;


public class ChangeScoreAction extends ActionSupport implements ModelDriven<refreshScore>{
	
	@Resource(name="teacherService")
	private TeacherService teacherService;
	
	private refreshScore rs = new refreshScore();
	
	@Override
	public refreshScore getModel() {
		return rs;
	}
	
	public boolean isNumeric(String str){  
		for (int i = str.length();--i>=0;){    
			if (!Character.isDigit(str.charAt(i))){  
				return false;  
			}  
		}  
		return true;  
	}  
	
	public void validate(){
		if(isNumeric(rs.getScore1())==false || isNumeric(rs.getScore2())==false || isNumeric(rs.getScore3())==false)
			this.addFieldError("score1", "请输入整数分数");
		else if(rs.getScore1().length()<=0 || rs.getScore1().length()>3)
			this.addFieldError("score1", "请输入平时成绩，并且分数为0-100分");
		else if(rs.getScore2().length()<=0 || rs.getScore2().length()>3)
			this.addFieldError("score2", "请输入理论成绩，并且分数为0-100分");
		else if(rs.getScore3().length()<=0 || rs.getScore3().length()>3)
			this.addFieldError("score3", "请输入期末考核成绩，并且分数为0-100分");
		else if(rs.getScore1().length()==3 && !rs.getScore1().equals("100"))
			this.addFieldError("score1", "分数不能超过100分");
		else if(rs.getScore2().length()==3 && !rs.getScore2().equals("100"))
			this.addFieldError("score2", "分数不能超过100分");
		else if(rs.getScore3().length()==3 && !rs.getScore3().equals("100"))
			this.addFieldError("score3", "分数不能超过100分");
		else{}
	}
	
	public String execute() throws Exception{
//		System.out.println(rs.getScore1()+" "+rs.getScore2()+" "+rs.getScore3());
		HttpSession mySession = ServletActionContext.getRequest().getSession(); 
//        Integer scoreId = (Integer) mySession.getAttribute("SCORE_ID");
		String stuNo = (String) mySession.getAttribute("STU_NO");
		String startClassNo =  (String) mySession.getAttribute("STARTCLASSS_ID");
//        System.out.println("ChangeScoreAction:"+scoreId);
        if(teacherService.refreshScore(stuNo, Integer.valueOf(startClassNo), Integer.valueOf(rs.getScore1()), Integer.valueOf(rs.getScore2()),Integer.valueOf(rs.getScore3())))
        	return SUCCESS;
        else
        	return INPUT;
	}
	
}
