package service;

import java.util.List;

import domain.Score;

public interface StudentService {
	public List<Object[]> studentInfo();  //student��ʾѧ��������Ϣ
	public List<Object[]> queryAllStartClass();  //��ʾ���п��ΰ���ѡ��
	public List<Object[]> queryAllStartClassByPage(int pageNo,int pageSize);  //ѡ����Ϣ��ҳ
	public boolean chooseClass(String stuNo, Integer startClassId);  //ѧ�����ѡ��ĳһ�ſ��ΰ�
	public List<Score> student_scoreInfo(String stuNo);  //ѧ��������ѡ����Ϣ���ɼ�
}
