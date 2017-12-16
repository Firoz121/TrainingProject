package com.practice.scms.testapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.configuration.SpringRootConfig;
import com.versal.coursemgmtsystem.dao.CourseDAO;
import com.versal.coursemgmtsystem.dao.UserDAO;

public class TestDeleteByIdCourse {
	
	public static void main(String[] args) {
		


		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
	 
		CourseDAO courseDAO= ctx.getBean(CourseDAO.class);
		
		
	
	
      courseDAO.deleteCourseById(3);
      ctx.close();
	 
}
	
	
}