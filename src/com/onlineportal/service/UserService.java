package com.onlineportal.service;

import java.util.List;

import com.onlineportal.vo.UserVO;

public interface UserService {

	public List<UserVO> getAllUserDetails();
	public int addNewUser(UserVO vo);
	public int deleteUser(int id);
}
