package service;

public interface UserService {  //User接口
	public boolean checkLogin(String loginName, String loginPassword, String type);  //用户登陆验证
	public boolean changePhone(String userNo, String newPhone, String type);  //sutdent or teacher更新电话号码
	public boolean checkPwd(String userNo, String oldPwd, String type);  //sutdent or teacher修改密码前的验证
	public boolean changePwd(String userNo, String newPwd, String type);  //sutdent or teacher更新登陆密码
}
