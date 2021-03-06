package com.apap.tutorial8.service;

import com.apap.tutorial8.model.UserRoleModel;

public interface UserRoleService {
	UserRoleModel addUser(UserRoleModel user);
	public String encrypt(String password);
	void changePassword(UserRoleModel user, String password);
	UserRoleModel findUserByUsername(String username);
	
}