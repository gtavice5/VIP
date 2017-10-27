package com.jkxy.action;

import java.util.Map;

import com.jkxy.model.User;
import com.jkxy.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private User user;
	private IUserService userService;
	private String password;
	private String username;
	private boolean rememberme;  
	
	
    
	public boolean isRememberme() {
		return rememberme;
	}
	public void setRememberme(boolean rememberme) {
		this.rememberme = rememberme;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	public String checkUser() throws Exception{
		Map session=(Map)ActionContext.getContext().getSession();
		if(user.getUsername().equals("admin")){
			user.setQuanxian(1);
		}
		User user1=userService.checkUser(user);
		if (user1!=null&&(user1.getQuanxian()==1||user1.getQuanxian()==0)) {
			session.put("user", user1);
			session.put("quanxian", user1.getQuanxian());
			return SUCCESS;
		}else{
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("msg", "用户名或密码输入错误！");
			if (user1!=null) {
				if (!(user1.getQuanxian()==1||user1.getQuanxian()==0)) {
					request.put("msg", "您所使用的用户无权访问本系统！");
				}
			}
			
			return ERROR;
		}
		
	}
	
	public String logOut() throws Exception{
		Map session=(Map)ActionContext.getContext().getSession();
		
		session.remove("user");
		return SUCCESS;
	}
	
	public String grantUser() throws Exception{
		Map request=(Map) ActionContext.getContext().get("request");
		if (userService.getUserByName(username)==null) {
			request.put("tipMessage", username+"不存在！请检查！");
			return SUCCESS;
		}
		if (userService.grantUser(username)) {
			request.put("tipMessage", "授予"+username+"登录权限成功！");
		}else{
			request.put("tipMessage", "授予"+username+"登录权限失败！");
		}
		return SUCCESS;
	}
	
	public String removeUser() throws Exception{
		Map request=(Map) ActionContext.getContext().get("request");
		if (userService.getUserByName(username)==null) {
			request.put("tipMessage", username+"不存在！请检查！");
			return SUCCESS;
		}
		if (userService.removeUser(username)) {
			request.put("tipMessage", "解除"+username+"登录权限成功！");
		}else{
			request.put("tipMessage", "解除"+username+"登录权限失败！");
		}
		return SUCCESS;
	}
	
	
	
	
	
	
	
	
	
	
	
}
