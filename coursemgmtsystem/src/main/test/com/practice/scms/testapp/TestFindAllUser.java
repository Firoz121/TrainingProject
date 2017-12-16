package com.practice.scms.testapp;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.configuration.SpringRootConfig;
import com.versal.coursemgmtsystem.dao.UserDAO;

public class TestFindAllUser {
	
	public static void main(String[] args) {
		

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
 
	UserDAO userDAO= ctx.getBean(UserDAO.class);
	
	
    List<User> users= userDAO.findaAll();
    for (User user : users) {
		System.out.println(user.getName()+"-"+user.getContact()+"-"+user.getEmail()+"-"+user.getAddress()+"-"+user.getLoginname());
		   
		
	}
	 
}
	
	
}