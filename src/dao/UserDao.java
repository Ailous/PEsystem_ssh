package dao;

import java.util.List;

import domain.Student;

public interface UserDao {
	public boolean exitLoginUser(String loginName, String loginPassword, String type);  //验证该用户在数据库是否存在
	public boolean changePhone(String userNo, String newPhone, String type);  //sutdent or teacher更新电话号码
	public boolean checkPwd(String userNo, String oldPwd, String type);  //sutdent or teacher修改密码前的验证
	public boolean changePwd(String userNo, String newPwd, String type);  //sutdent or teacher更新登陆密码
}
