package interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/*
 * Ê¶±ðÓÃ»§µÇÂ½µÄÀ¹½ØÆ÷
 */
public class LoginInterceptor implements Interceptor{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		HttpSession session = ServletActionContext.getRequest().getSession(); 
        String type = (String) session.getAttribute("TYPE");
        if (type != null) {
        	String who = null;
        	if(type.equals("1"))
        		who = (String) session.getAttribute("STUDENT_NO");
        	else if(type.equals("2"))
        		who = (String) session.getAttribute("TEACHER_NO");
        	else if(type.equals("3"))
        		who = (String) session.getAttribute("ADMIN_NO");
        	else{}
        	
            if(who!=null){
            	System.out.println("ÒÑµÇÂ¼");  
                return arg0.invoke();
            }
            else{
            	System.out.println("Î´µÇÂ¼");
            	return "error";
            }
        }
        else{
        	System.out.println("Î´µÇÂ¼");
        	return "error";
        }
	}

}
