package com.nag.dao;

import java.util.List;

import com.nag.model.User;

public interface UserDAO {

	public void saveUser(User user) ;
	public List<User> listUser() ;
}
