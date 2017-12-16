package com.versal.coursemgmtsystem.service;


import java.util.List;

import com.practice.coursemgmtsystem.model.User;

public interface UserService {
	
	
	public void registerUser(User user);
	
	
	public void deleteUser(User user);
	
	
	public void registerUserById(User user);
	
	
     public User findUser(Integer id);
	
	public List<User> findaAllUser();
	

}
