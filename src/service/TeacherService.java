package service;

import java.util.List;

import domain.Score;
import domain.StartClass;
import domain.Teacher;

public interface TeacherService {
	public List<Teacher> teacher_info(String teaNo);  //��ʦ������Ϣ
	public List<StartClass> allClassInfo(String teaNo);  //��ʦ��½�鿴�ڿΰ༶��Ϣ
	public List<Score> classDetail(Integer classId);  //�鿴ĳ���༶�������ѧ��
	public Score thisStudent(String stuNo);  //�ҵ�ָ��ѧ���ĳɼ�
	public boolean refreshScore(String stuNo, Integer startClassNo, Integer score1, Integer score2, Integer score3);  //��ָ��ѧ����ӳɼ�
}
