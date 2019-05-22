package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import dao.TeacherDao;
import domain.Score;
import domain.StartClass;
import domain.Student;
import domain.Teacher;

@Repository("teacherDao")
public class TeacherDaoBean implements TeacherDao {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	@Override
	public List<Teacher> teacher_info(String teaNo) {
		String queryString="from Teacher where teaNo=:teaNo";
		return sessionFactory.getCurrentSession().createQuery(queryString).setParameter("teaNo", teaNo).list();
	}

	@Override
	public List<StartClass> allClassInfo(String teaNo) {
		String queryString="from StartClass sc inner join fetch sc.course inner join fetch sc.teacher where sc.teacher.teaNo=:teaNo";
		return sessionFactory.getCurrentSession().createQuery(queryString).setParameter("teaNo", teaNo).list();
	}

	@Override
	public List<Score> classDetail(Integer classId) {
		String queryString="from Score s inner join fetch s.student inner join fetch s.startClass where s.startClass.id=:classId";
		return sessionFactory.getCurrentSession().createQuery(queryString).setParameter("classId", classId).list();
	}

	@Override
	public Score thisStudent(String stuNo) {
		String queryString="from Score s inner join fetch s.student inner join fetch s.startClass where s.student.stuNo=:stuNo";
		return (Score) sessionFactory.getCurrentSession().createQuery(queryString).setParameter("stuNo", stuNo).list().get(0);
	}

	@Override
	public boolean refreshScore(String stuNo, Integer startClassNo, Integer score1, Integer score2, Integer score3) {
//		String queryString ="from Student s inner join fetch s.profession where stuNo=:stuNo";
//		Student student = (Student)sessionFactory.getCurrentSession().createQuery(queryString).setParameter("stuNo", stuNo).list().get(0);
		String queryString ="from Score s inner join fetch s.student inner join fetch s.startClass where s.student.stuNo=:stuNo and s.startClass.id=:startClassNo";
		Score temp = (Score)sessionFactory.getCurrentSession().createQuery(queryString).setParameter("stuNo", stuNo).setParameter("startClassNo", startClassNo).list().get(0);
		temp.setScore1(score1);
		temp.setScore2(score2);
		temp.setScore3(score3);
		//30% 30% 40%
		temp.setTotal(Integer.valueOf((int)(score1.intValue()*0.3+score2.intValue()*0.3+score3.intValue()*0.4)));
		sessionFactory.getCurrentSession().update(temp);
		sessionFactory.getCurrentSession().flush();
		return true;
	}

}
