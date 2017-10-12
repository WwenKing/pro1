package com.etc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.etc.model.User;

public class LoginDao {

	public User getUserByCustName(String custname) {
		User user = null;
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		String dbUrl = "jdbc:mysql://localhost:3306/jee";
		String sql = "select custname,pwd from t_user where custname='"
				+ custname + "'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl,"root","root");
			stat = conn.createStatement();
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				user = new User();
				user.setCustname(rs.getString(1));
				user.setPwd(rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		user = new User();
		user.setCustname("test");
		user.setPwd("test");
		return user;
	}
	
	public List getUsers(){
		List users = new ArrayList();
		for(int i=0;i<5;i++){
			User user = new User();
			user.setCustname("user"+i);
			user.setPwd("user"+i);
			users.add(user);
		}
		return users;
	}
}
