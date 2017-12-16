package com.versal.coursemgmtsystem.serviceimpl;

import java.util.List;

import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.dao.BaseDAO;
import com.versal.coursemgmtsystem.dao.UserDAO;
import com.versal.coursemgmtsystem.service.UserService;

public
class userServiceImpl extends BaseDAO implements UserService  {

	
	UserDAO userDAO;
	
	public void registerUser(User user) {
		userDAO.saveUser(user);
		
	}

	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

	public void registerUserById(User user) {
		// TODO Auto-generated method stub
		
	}

	public User findUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findaAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
