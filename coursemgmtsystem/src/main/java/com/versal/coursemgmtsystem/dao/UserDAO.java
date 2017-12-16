package com.versal.coursemgmtsystem.dao;

import java.util.List;

import com.practice.coursemgmtsystem.model.User;

;

public interface UserDAO {
	
	
public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(User user);
	
	public void deleteUserById(Integer id);
	
	public User find(Integer id);
	
	public List<User> findaAll();
	
	public List<User> findbyProparty(String propartyName, Object propartyValue);
	
	
	

	

}
