package com.jkxy.service.impl;

import java.util.List;

import com.jkxy.dao.IUserDAO;
import com.jkxy.model.User;
import com.jkxy.service.IUserService;

public class UserService implements IUserService {

	private IUserDAO userDAO;
	
	
	public IUserDAO getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(IUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public User checkUser(User user) throws Exception{
		return userDAO.checkUser(user);
	}


	@Override
	public boolean grantUser(String username) {
		return userDAO.grantUser(username);
	}


	@Override
	public boolean removeUser(String username) {
		return userDAO.removeUser(username);
	}


	@Override
	public User getUserByName(String username) {
		return userDAO.getUserByName(username);
	}

}
