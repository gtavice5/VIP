package com.jkxy.service;

import java.util.List;

import com.jkxy.model.Commodity;
import com.jkxy.model.User;

public interface IUserService {

	public User checkUser(User user) throws Exception;
	public boolean grantUser(String username);
	public boolean removeUser(String username);
	User getUserByName(String username);
}
