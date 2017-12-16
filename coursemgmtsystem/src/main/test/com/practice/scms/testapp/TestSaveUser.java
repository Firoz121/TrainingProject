package com.practice.scms.testapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.configuration.SpringRootConfig;
import com.versal.coursemgmtsystem.dao.UserDAO;

public class TestSaveUser {
	
	public static void main(String[] args) {
		

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
 
	UserDAO userDAO= ctx.getBean(UserDAO.class);
	
	User user = new User();
	
	user.setName("ajay");
	user.setContact("2636");
   user.setEmail("jaty@yahoo.com");
   user.setAddress("pune");
   user.setLoginname("raj111");
    user.setPassword("111");
      
      userDAO.saveUser(user);
      ctx.close();
	 
}
	
	
}