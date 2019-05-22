package service;

import java.util.List;

import domain.Course;
import domain.StartClass;
import domain.Student;
import domain.Teacher;

public interface AdminService {
	public List<Student> allStuInfo();  //admin ��ʾ����ѧ������Ϣ
	public boolean admin_deleteThisStu(Integer stuId);  //ɾ��ĳһ��ѧ��
	public boolean admin_addStu(Student student, String stuYear);  //���һ��ѧ��
	public Integer admin_findProfession(String findGoal);  //�����Ƿ��и�רҵ
	public List<Teacher> admin_allTeacherInfo();  //��ѯ���н�ʦ��Ϣ
	public boolean admin_deleteThisTea(Integer teaId);  //ɾ��ָ����ʦ
	public boolean admin_addTeacher(Teacher teacher);  //��ӽ�ʦ
	public List<Course> admin_allCourseInfo();  //��ѯ���пγ���Ϣ
	public boolean admin_deleteThisCourse(Integer couId);  //ɾ��ĳһ�ſγ�
	public boolean admin_existingThisCourse(String couName);  //��ӿγ�ǰ�鿴�Ƿ���ڸ��ſγ�
	public boolean admin_addCourse(String couName, int couHour, int couCredit);  //��ӿγ�
	public List<StartClass> admin_allStartClassInfo();  //��ѯ���еĿ��ΰ���Ϣ
	public boolean admin_deleteThisStartClassAction(Integer id);  //ɾ��ĳһ�ſ��ΰ�
	public boolean admin_findCourseById(Integer couId);  //���ݿγ�id����
	public Integer admin_findTeacherByNo(String teaNo);  //���ݹ��Ų��ҽ�ʦ
	public boolean admin_addStartClass(Integer couId, Integer teaId, String claLocation, String claTime);  //��ӿ��ΰ�
	
}
