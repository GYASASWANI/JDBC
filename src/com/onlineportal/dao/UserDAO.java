package com.onlineportal.dao;

import java.util.List;

import com.onlineportal.vo.UserVO;

public interface UserDAO {

	public abstract List<UserVO> getAllUserDetails();
	public int addNewUser(UserVO vo);
	public int deleteUser(int id);
}
