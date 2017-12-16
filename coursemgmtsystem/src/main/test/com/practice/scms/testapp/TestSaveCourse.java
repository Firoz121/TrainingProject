package com.practice.scms.testapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.coursemgmtsystem.model.Course;
import com.versal.coursemgmtsystem.configuration.SpringRootConfig;
import com.versal.coursemgmtsystem.dao.CourseDAO;


public class TestSaveCourse {
	
	public static void main(String[] args) {
		

	
	AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(SpringRootConfig.class);
 
CourseDAO courseDAO= ctx.getBean(CourseDAO.class);
	
	Course course= new Course();
	course.setUserid(2);
	course.setTitle("java");
	course.setDuration(1);
	course.setDesecription("Core");
      
    courseDAO.saveCourse(course);
      ctx.close();
	 
}
	
	
}