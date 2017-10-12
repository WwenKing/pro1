package com.etc.model;

import java.util.List;

import com.etc.dao.LoginDao;

public class LoginService {
	public boolean login(String custname, String pwd) {
		//LoginDao dao = new LoginDao();
		//User user = dao.getUserByCustName(custname);
		//if(null!=user){
		//if (custname.equals(user.getCustname()) && pwd.equals(user.getPwd())) {
			if (custname.equals("ETC") && pwd.equals("123")) {
			return true;
		} else {
			return false;
		}
		//}else{
		//	return false;
		//}
	}
	
	public List getUsers(){
		LoginDao dao = new LoginDao();
		List users = dao.getUsers();
		return users;
	}
}
