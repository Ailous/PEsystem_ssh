package service;

public interface UserService {  //User�ӿ�
	public boolean checkLogin(String loginName, String loginPassword, String type);  //�û���½��֤
	public boolean changePhone(String userNo, String newPhone, String type);  //sutdent or teacher���µ绰����
	public boolean checkPwd(String userNo, String oldPwd, String type);  //sutdent or teacher�޸�����ǰ����֤
	public boolean changePwd(String userNo, String newPwd, String type);  //sutdent or teacher���µ�½����
}
