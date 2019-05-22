package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import dao.AdminDao;
import domain.Course;
import domain.Profession;
import domain.StartClass;
import domain.Student;
import domain.Teacher;
import service.AdminService;

@Repository("adminDao")
public class AdminDaoBean implements AdminDao {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> allStuInfo() {
		String queryString="from Student s inner join fetch s.profession inner join fetch s.profession.college";
		return sessionFactory.getCurrentSession().createQuery(queryString).list();
	}

	@Override
	public boolean admin_deleteThisStu(Integer stuId) {
		try{
			sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Student.class, stuId));
			sessionFactory.getCurrentSession().flush();
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean admin_addStu(Student student, String stuYear) {
		sessionFactory.getCurrentSession().save(student);
		sessionFactory.getCurrentSession().flush();
		//更新学号
		String queryString ="from Student where stuNo=:stuNo";
		Student s = (Student) sessionFactory.getCurrentSession().createQuery(queryString).setParameter("stuNo", "NULL").list().get(0);
		Integer stuId = s.getId();
		if(stuId.intValue()>=10000)
			student.setStuNo(stuYear+stuId.toString());
		else if(stuId.intValue()>=1000)
			student.setStuNo(stuYear+"0"+stuId.toString());
		else if(stuId.intValue()>=100)
			student.setStuNo(stuYear+"00"+stuId.toString());
		else if(stuId.intValue()>=10)
			student.setStuNo(stuYear+"000"+stuId.toString());
		else
			student.setStuNo(stuYear+"0000"+stuId.toString());
		sessionFactory.getCurrentSession().update(student);
		sessionFactory.getCurrentSession().flush();
		return true;
	}

	@Override
	public Integer admin_findProfession(String findGoal) {
		String queryString = "from Profession where proName=:proName";
		List<Profession> list = sessionFactory.getCurrentSession().createQuery(queryString).setParameter("proName", findGoal).list();
		if(list.size()==1)
			return list.get(0).getId();
		else
			return null;
	}

	@Override
	public List<Teacher> admin_allTeacherInfo() {
		String queryString="from Teacher";
		return sessionFactory.getCurrentSession().createQuery(queryString).list();
	}

	@Override
	public boolean admin_deleteThisTea(Integer teaId) {
		try{
			sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Teacher.class, teaId));
			sessionFactory.getCurrentSession().flush();
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean admin_addTeacher(Teacher teacher) {
		sessionFactory.getCurrentSession().save(teacher);
		sessionFactory.getCurrentSession().flush();
		//更新学号
		String queryString ="from Teacher where teaNo=:teaNo";
		Teacher s = (Teacher) sessionFactory.getCurrentSession().createQuery(queryString).setParameter("teaNo", "NULL").list().get(0);
		Integer teaId = s.getId();
		if(teaId.intValue()>=10000)
			teacher.setTeaNo(teaId.toString());
		else if(teaId.intValue()>=1000)
			teacher.setTeaNo("0"+teaId.toString());
		else if(teaId.intValue()>=100)
			teacher.setTeaNo("00"+teaId.toString());
		else if(teaId.intValue()>=10)
			teacher.setTeaNo("000"+teaId.toString());
		else
			teacher.setTeaNo("0000"+teaId.toString());
		sessionFactory.getCurrentSession().update(teacher);
		sessionFactory.getCurrentSession().flush();
		return true;
	}

	@Override
	public List<Course> admin_allCourseInfo() {
		String queryString="from Course";
		return sessionFactory.getCurrentSession().createQuery(queryString).list();
	}

	@Override
	public boolean admin_deleteThisCourse(Integer couId) {
		try{
			sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Course.class, couId));
			sessionFactory.getCurrentSession().flush();
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean admin_existingThisCourse(String couName) {
		String queryString ="from Course where couName=:couName";
		return sessionFactory.getCurrentSession().createQuery(queryString).setParameter("couName", couName).list().size()==1?true:false;
	}

	@Override
	public boolean admin_addCourse(String couName, int couHour, int couCredit) {
		Course course = new Course();
		course.setCouName(couName);
		course.setCouHour(couHour);
		course.setCouCredit(couCredit);
		sessionFactory.getCurrentSession().save(course);
		sessionFactory.getCurrentSession().flush();
		return true;
	}

	@Override
	public List<StartClass> admin_allStartClassInfo() {
		String queryString ="from StartClass sc inner join fetch sc.course inner join fetch sc.teacher";
		return sessionFactory.getCurrentSession().createQuery(queryString).list();
	}

	@Override
	public boolean admin_deleteThisStartClassAction(Integer id) {
		try{
			sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(StartClass.class, id));
			sessionFactory.getCurrentSession().flush();
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean admin_findCourseById(Integer couId) {
		String queryString ="from Course where id=:couId";
		return sessionFactory.getCurrentSession().createQuery(queryString).setParameter("couId", couId).list().size()==1?true:false;
	}

	@Override
	public Integer admin_findTeacherByNo(String teaNo) {
		String queryString ="from Teacher where teaNo=:teaNo";
		List<Teacher> list = sessionFactory.getCurrentSession().createQuery(queryString).setParameter("teaNo", teaNo).list();
		if(list.size()==1)
			return list.get(0).getId();
		else
			return null;

	}

	@Override
	public boolean admin_addStartClass(Integer couId, Integer teaId, String claLocation, String claTime) {
		StartClass startClass = new StartClass();
		String queryString ="from Course where id=:couId";
		Course course = (Course)sessionFactory.getCurrentSession().createQuery(queryString).setParameter("couId", couId).list().get(0);
		queryString ="from Teacher where id=:teaId";
		Teacher teacher  = (Teacher)sessionFactory.getCurrentSession().createQuery(queryString).setParameter("teaId", teaId).list().get(0);
		startClass.setCourse(course);
		startClass.setTeacher(teacher);
		startClass.setClaLocation(claLocation);
		startClass.setClaTime(claTime);
		sessionFactory.getCurrentSession().save(startClass);
		sessionFactory.getCurrentSession().flush();
		return true;
	}
	
	
}
