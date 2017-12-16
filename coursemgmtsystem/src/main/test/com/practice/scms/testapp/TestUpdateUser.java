package com.practice.scms.testapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.configuration.SpringRootConfig;
import com.versal.coursemgmtsystem.dao.UserDAO;

public class TestUpdateUser {
	
	public static void main(String[] args) {
		

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
 
	UserDAO userDAO= ctx.getBean(UserDAO.class);
	
	User user = new User();
	
	 user.setName("ram");
	user.setContact("1236");
    user.setEmail("ram@yahoo.com");
    user.setAddress("nagur");
    user.setLoginname("ram111");
    user.setPassword("222");
    user.setId(4);  
    userDAO.updateUser(user);
      ctx.close();
	 
}
	
	
}