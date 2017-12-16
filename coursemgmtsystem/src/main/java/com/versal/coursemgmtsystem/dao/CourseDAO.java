package com.versal.coursemgmtsystem.dao;

import java.util.List;

import com.practice.coursemgmtsystem.model.Course;;


public interface CourseDAO {

	
	public void saveCourse(Course course);
	
	public void updateCourse(Course course);
	
	public void deleteCourse(Course course);
	
	public void deleteCourseById(Integer id);
	
	public Course find(Integer id);
	
	public List<Course> findaAll();
	
	public List<Course> findbyProparty(String propartyName, Object propartyValue);
	
	
	
	
	

}
