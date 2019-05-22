package service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.UserDao;

@Service("userService")
public class UserServiceBean implements service.UserService {
	
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public boolean checkLogin(String loginName, String loginPassword, String type) {
		if(userDao.exitLoginUser(loginName, loginPassword, type))
			return true;
		else
			return false;
	}

	@Override
	public boolean changePhone(String userNo, String newPhone, String type) {
		if(userDao.changePhone(userNo, newPhone, type))
			return true;
		else
			return false;		
	}

	@Override
	public boolean checkPwd(String userNo, String oldPwd, String type) {
		if(userDao.checkPwd(userNo, oldPwd, type))
			return true;
		else
			return false;
	}
	
	@Override
	public boolean changePwd(String userNo, String newPwd, String type) {
		if(userDao.changePwd(userNo, newPwd, type))
			return true;
		else
			return false;
	}

}
