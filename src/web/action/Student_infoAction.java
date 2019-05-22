package web.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.Student;
import service.StudentService;

public class Student_infoAction extends ActionSupport implements ModelDriven<Student>{
	private Student student = new Student();
	List<Object[]> studentInfo = null;
	
	@Resource(name="studentService")
	private StudentService studentService;
	
	@Override
	public Student getModel() {
		return student;
	}
	
	public void validate(){}
	
	public String execute() throws Exception{
		studentInfo = studentService.studentInfo();
//		System.out.println("****\n");
//		for (Object[] objects : studentInfo) {
//			for (Object object : objects) {
//				System.out.print(object+"\t");
//			}
//			System.out.println();
//		}
//		System.out.println("****\n");
		return SUCCESS;
	}

	public List<Object[]> getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(List<Object[]> studentInfo) {
		this.studentInfo = studentInfo;
	}
	
	
}
