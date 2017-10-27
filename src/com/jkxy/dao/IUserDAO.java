package com.jkxy.dao;

import java.util.List;

import com.jkxy.model.User;
import com.jkxy.model.Vip;

public interface IUserDAO {

	public User checkUser(User user) throws Exception;
	public boolean grantUser(String username);
	public boolean removeUser(String username);
	User getUserByName(String username);
}
