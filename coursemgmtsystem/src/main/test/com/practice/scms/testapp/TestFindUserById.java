package com.practice.scms.testapp;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.configuration.SpringRootConfig;
import com.versal.coursemgmtsystem.dao.UserDAO;

public class TestFindUserById {
	
	public static void main(String[] args) {
		

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
 
	UserDAO userDAO= ctx.getBean(UserDAO.class);
	
	
   User user= userDAO.find(4);
  
		System.out.println(user.getName()+"-"+user.getContact()+"-"+user.getEmail()+"-"+user.getAddress()+"-"+user.getLoginname());
		   
		

	 
}
	
	
}