package com.onlineportal.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.onlineportal.dao.UserDAO;
import com.onlineportal.vo.UserVO;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<UserVO> getAllUserDetails() {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		String sql = "select * from user";
		List<UserVO> ls = new ArrayList<UserVO>();
		try {
			PreparedStatement st=con.prepareStatement(sql);
			ResultSet rs =st.executeQuery();
			while(rs.next()) {
				UserVO vo = new UserVO(rs.getInt("id"), rs.getString("FirstName"), rs.getString("LastName"));		
				ls.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ls;
	}
	
	public int addNewUser(UserVO vo) {
		Connection con = getConnection();
		String sql_insert = "INSERT INTO USER (id, LastName, FirstName) VALUES (?,?,?)";
		int rows = 0;
		try {
			PreparedStatement st=con.prepareStatement(sql_insert);
			st.setInt(1, vo.getId());
			st.setString(2, vo.getLastName());
			st.setString(3, vo.getFirstName());
	        rows= st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
	}
	@Override
	public int deleteUser(int id){
		// TODO Auto-generated method stub
		Connection con = getConnection();
		String sql_delete= " delete from user where id = ?";
		int rows = 0;
		try {
			PreparedStatement st = con.prepareStatement(sql_delete);
			st.setInt(1, id);
			rows= st.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rows;
	}

	 public Connection getConnection() {
		 
		 String url = "jdbc:mysql://127.0.0.1:3306/testing"; 
		 Connection	con = null;
	     //Step2 - get connection
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "Gopalam@14");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return con;
	 }


}
