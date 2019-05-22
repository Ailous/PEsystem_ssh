package web.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Score;
import service.StudentService;

public class Student_scoreInfo extends ActionSupport{
	private Score score = new Score();
	private List<Score> myScore = null;
	
	@Resource(name="studentService")
	private StudentService studentService;
	
	public void validate(){
		
	}
	
	public String execute() throws Exception{
		HttpSession mySession = ServletActionContext.getRequest().getSession(); 
        String stuNo = (String) mySession.getAttribute("STUDENT_NO");

		myScore=studentService.student_scoreInfo(stuNo);
		if(myScore==null)
			return INPUT;
		else
			return SUCCESS;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public List<Score> getMyScore() {
		return myScore;
	}

	public void setMyScore(List<Score> myScore) {
		this.myScore = myScore;
	}

	
}
