package dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import dao.StudentDao;
import domain.Score;
import domain.StartClass;
import domain.Student;
import other.HibernateSessionFactory;

@Repository("studentDao")
public class StudentDaoBean implements StudentDao {
	
//	@Resource(name="hibernateTemplate")
//	private HibernateTemplate hibernateTemplate;
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<Object[]> getStudentByNo(String stuNo) {
		String queryString="select s.stuNo, s.stuName, s.stuSex, s.stuPhone, c.colName, p.proName from Student s left join s.profession p left join p.college c where s.stuNo=:stuNo";
		return sessionFactory.getCurrentSession().createQuery(queryString).setParameter("stuNo", stuNo).list();
	}

	@Override
	public List<Object[]> queryAllStartClass() {
		String queryString="select sc.id, c.couName, t.teaName, sc.claLocation, sc.claTime from StartClass sc left join sc.course c left join sc.teacher t";
		return sessionFactory.getCurrentSession().createQuery(queryString).list();
	}

	@Override
	public List<Object[]> queryAllStartClassByPage(int pageNo, int pageSize) {
//		List<Object[]> entitylist=null;
//        try{
//            Query query = (Query) this.hibernateTemplate.find("from StartClass");
//            query.setFirstResult(pageNo);
//            query.setMaxResults(pageSize);
//            entitylist = query.list();
//            
//        }catch(RuntimeException re){
//            throw re;
//        }
//        
//        return entitylist;
		
		/*
		 * unfinish
		 */
		return null;
	}

	@Override
	public boolean chooseClass(String stuNo, Integer startClassId) {
		String queryString="from Student s where stuNo=:stuNo";
		Student student = (Student)sessionFactory.getCurrentSession().createQuery(queryString).setParameter("stuNo", stuNo).list().get(0);
		queryString="from StartClass where id=:startClassId";
		StartClass startClass = (StartClass)sessionFactory.getCurrentSession().createQuery(queryString).setParameter("startClassId", startClassId).list().get(0);
		Score score = new Score();
		score.setStudent(student);
		score.setStartClass(startClass);
		System.out.println("学生name="+student.getStuName()+"课程id为："+startClass.getId());
		sessionFactory.getCurrentSession().save(score);
		return true;
	}

	@Override
	public List<Score> student_scoreInfo(String stuNo) {
		String queryString="from Score s inner join fetch s.startClass inner join fetch s.student where s.student.stuNo=:stuNo";
		return sessionFactory.getCurrentSession().createQuery(queryString).setParameter("stuNo", stuNo).list();
	}
	

}
