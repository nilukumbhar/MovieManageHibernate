package com.techdenovo.moviemanagehibernate.dao;

import com.techdenovo.moviemanagehibernate.model.User;

public interface UserDAO {
	public void saveUser(User user);
	public User findUserByUserName(String username);

}
