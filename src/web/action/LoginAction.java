package web.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import domain.TUser;
import service.UserService;


public class LoginAction extends ActionSupport implements ModelDriven<TUser>{
	@Resource(name="userService")
	private UserService userService;
	
	private TUser user = new TUser();
	
	@Override
	public TUser getModel() {
		return user;
	}
	
	public void validate(){
		System.out.println("***\n�û�����"+user.getLoginName()+"  ���룺"+user.getLoginPassword()+"\n***");

		if(user.getLoginName().length()>12 || user.getLoginName().length()<=0)
			this.addFieldError("loginName", "��������ȷ���û���");
		else if(user.getLoginPassword().length()>20 || user.getLoginPassword().length()<=0)
			this.addFieldError("loginPassword", "��������ȷ������");
		else{}
	}
	
	public String execute() throws Exception{
		//���ݿ��ѯ��֤
		HttpServletRequest request = ServletActionContext.getRequest();
		String type=request.getParameter("type");  
		System.out.println("***\ntype:"+type+"\n***");
		if(userService.checkLogin(user.getLoginName(), user.getLoginPassword(), type)){
			if(type.equals("1")){
				ServletActionContext.getRequest().getSession().setAttribute("STUDENT_NO", user.getLoginName());
				ServletActionContext.getRequest().getSession().setAttribute("TYPE", "1");
				return "student";
			}
			else if(type.equals("2")){
				ServletActionContext.getRequest().getSession().setAttribute("TEACHER_NO", user.getLoginName());
				ServletActionContext.getRequest().getSession().setAttribute("TYPE", "2");
				return "teacher";
			}
			else if(type.equals("3")){
				ServletActionContext.getRequest().getSession().setAttribute("ADMIN_NO", user.getLoginName());
				ServletActionContext.getRequest().getSession().setAttribute("TYPE", "3");
				return "admin";
			}
			else
				return INPUT;
		}
		else
			return INPUT;
	}

	public TUser getUser() {
		return user;
	}

	public void setUser(TUser user) {
		this.user = user;
	}
}
