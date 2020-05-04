package com.onlineportal.controller;

import java.util.List;

import com.onlineportal.service.UserService;
import com.onlineportal.service.impl.UserServiceImpl;
import com.onlineportal.vo.UserVO;

public class UserController {

	public List<UserVO> getAllUserDetails() {
		UserService user = new UserServiceImpl();
	return user.getAllUserDetails();
	}
	
	public int addNewUser(UserVO vo) {
		UserService user = new UserServiceImpl();
		return user.addNewUser(vo);
	}
	
	public int deleteUser(int id) {
		UserService user = new UserServiceImpl();
		return user.deleteUser(id);
	}
}
