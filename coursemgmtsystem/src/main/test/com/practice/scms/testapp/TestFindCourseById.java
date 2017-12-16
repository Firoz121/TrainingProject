package com.practice.scms.testapp;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.coursemgmtsystem.model.Course;
import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.configuration.SpringRootConfig;
import com.versal.coursemgmtsystem.dao.CourseDAO;
import com.versal.coursemgmtsystem.dao.UserDAO;

public class TestFindCourseById {
	
	public static void main(String[] args) {
		

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
 
	CourseDAO courseDAO= ctx.getBean(CourseDAO.class);
	
	
   Course course= courseDAO.find(3);
  
		   
	System.out.println(course.getUserid()+"-"+course.getTitle()+"-"+course.getDuration()+"-"+course.getDesecription());

	 
}
	
	
}