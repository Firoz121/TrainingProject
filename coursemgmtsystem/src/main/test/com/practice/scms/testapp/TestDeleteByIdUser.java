package com.practice.scms.testapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.configuration.SpringRootConfig;
import com.versal.coursemgmtsystem.dao.UserDAO;

public class TestDeleteByIdUser {
	
	public static void main(String[] args) {
		

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
 
	UserDAO userDAO= ctx.getBean(UserDAO.class);
	
	
      userDAO.deleteUserById(1);
      ctx.close();
	 
}
	
	
}