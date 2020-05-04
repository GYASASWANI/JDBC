package com.onlineportal.service.impl;

import java.util.List;

import com.onlineportal.dao.UserDAO;
import com.onlineportal.dao.impl.UserDAOImpl;
import com.onlineportal.service.UserService;
import com.onlineportal.vo.UserVO;

public class UserServiceImpl implements UserService{

	//private UserDAO userdao;

	@Override
	public List<UserVO> getAllUserDetails() {
		// TODO Auto-generated method stub
		UserDAO userdao = new UserDAOImpl();
		return userdao.getAllUserDetails();

	}

	@Override
	public int addNewUser(UserVO vo) {
		// TODO Auto-generated method stub
		UserDAO userdao = new UserDAOImpl();
		return userdao.addNewUser(vo);
	}

	@Override
	public int deleteUser(int id) {
		// TODO Auto-generated method stub
		UserDAO userdao = new UserDAOImpl();
		return userdao.deleteUser(id);
	}	
}
