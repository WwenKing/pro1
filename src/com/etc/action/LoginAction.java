package com.etc.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.etc.model.LoginService;

public class LoginAction {
	private String custname;
	private String pwd;
	private List users;
	private String ipAddr;
	
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		ipAddr = request.getRemoteAddr();
		LoginService ls=new LoginService();
		boolean flag=ls.login(custname, pwd);
		if(flag){
			return "success";
		}else{
			return "fail";
		}
	}
	public List getUsers() {
		return users;
	}
	public void setUsers(List users) {
		this.users = users;
	}
	
	public String userlist(){
		LoginService ls=new LoginService();
		users = ls.getUsers();
		return "list";
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
}
