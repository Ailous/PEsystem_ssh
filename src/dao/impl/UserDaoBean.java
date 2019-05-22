package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import dao.UserDao;
import domain.Student;
import domain.Teacher;

@Repository("userDao")
public class UserDaoBean implements UserDao {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	public UserDaoBean(){}
	
	@Override
	public boolean exitLoginUser(String loginName, String loginPassword, String type) {
		String queryString="";
		if(type.equals("1"))
			queryString = "from Student where stuNo=:loginName and stuPassword=:loginPassword";  //学生
		else if(type.equals("2"))
			queryString = "from Teacher where teaNo=:loginName and teaPassword=:loginPassword";  //教师
		else if(type.equals("3"))
			queryString = "from TUser where loginName=:loginName and loginPassword=:loginPassword";  //管理员
		else{}
		List list = sessionFactory.getCurrentSession().createQuery(queryString).setParameter("loginName", loginName).setParameter("loginPassword", loginPassword).list();
		if(list.size()==1)
			return true;
		else
			return false;
	}

	@Override
	public boolean changePhone(String userNo, String newPhone, String type) {
		String queryString="";
		Integer userId = null;
		boolean flag=true;
		if(type.equals("1")){
			queryString="from Student where stuNo=:userNo";
			Student student = (Student) sessionFactory.getCurrentSession().createQuery(queryString).setParameter("userNo", userNo).list().get(0);
			System.out.println("需要更新手机号码的学生id为："+student.getId()+" 新年的号码为："+newPhone);
			student.setStuPhone(newPhone);
			sessionFactory.getCurrentSession().update(student);
			sessionFactory.getCurrentSession().flush();
			flag=true;
		}
		else if(type.equals("2")){
			queryString="from Teacher where teaNo=:userNo";
			Teacher teacher = (Teacher) sessionFactory.getCurrentSession().createQuery(queryString).setParameter("userNo", userNo).list().get(0);
			teacher.setTeaPhone(newPhone);
			sessionFactory.getCurrentSession().update(teacher);
			sessionFactory.getCurrentSession().flush();
			flag=true;
		}
		else{}
		return flag;
	}

	@Override
	public boolean checkPwd(String userNo, String oldPwd, String type) {
		String queryString="";
		if(type.equals("1"))
			queryString="from Student where stuNo=:userNo and stuPassword=:oldPwd";
		else if(type.equals("2"))
			queryString="from Teacher where teaNo=:userNo and teaPassword=:oldPwd";
		return sessionFactory.getCurrentSession().createQuery(queryString).setParameter("userNo", userNo).setParameter("oldPwd", oldPwd).list().size()==1?true:false;
	}

	@Override
	public boolean changePwd(String userNo, String newPwd, String type) {
		boolean flag = false;
		String queryString="";
		if(type.equals("1")){
			queryString="from Student where stuNo=:userNo";
			Student student = (Student)sessionFactory.getCurrentSession().createQuery(queryString).setParameter("userNo", userNo).list().get(0);
			student.setStuPassword(newPwd);
			System.out.println("学生修改的新密码为："+newPwd);
			sessionFactory.getCurrentSession().update(student);
			sessionFactory.getCurrentSession().flush();
			flag=true;
		}
		else if(type.equals("2")){
			queryString="from Teacher where teaNo=:userNo";
			Teacher teacher = (Teacher)sessionFactory.getCurrentSession().createQuery(queryString).setParameter("userNo", userNo).list().get(0);
			teacher.setTeaPassword(newPwd);
			sessionFactory.getCurrentSession().update(teacher);
			sessionFactory.getCurrentSession().flush();
			flag=true;
		}
		else{}
		return flag;
	}
	
	
}
