package com.versal.coursemgmtsystem.daoimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.practice.coursemgmtsystem.model.Course;
import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.dao.BaseDAO;
import com.versal.coursemgmtsystem.dao.CourseDAO;

@Repository
public class CourseDAOImpl  extends BaseDAO implements CourseDAO {

	public void saveCourse(Course course) {
		
		

		String sql="insert into courses(userid,title,duration,desecription) values(:userid, :title, :duration, :desecription)";
		
		Map<String,Object> map= new HashMap();
		map.put("userid", course.getUserid());
		map.put("title", course.getTitle());
		map.put("duration",course.getDuration());
		map.put("desecription", course.getDesecription());
		
		KeyHolder kh= new GeneratedKeyHolder();
		
		SqlParameterSource ps= new MapSqlParameterSource(map);
		
		getNamedParameterJdbcTemplate().update(sql,ps,kh);
		
		Integer userid=kh.getKey().intValue();
		course.setId(userid);
		
		
	}

	public void updateCourse(Course course) {
		
		
		 String sql="update users set title=:title, duration=:duration, desecription=: desecription where id=:id";
			
			Map<String,Object> map= new HashMap();
			
			map.put("title", course.getTitle());
			map.put("duration",course.getDuration());
			map.put("desecription", course.getDesecription());
			
			
			KeyHolder kh= new GeneratedKeyHolder();
			
			SqlParameterSource ps= new MapSqlParameterSource(map);
			
			getNamedParameterJdbcTemplate().update(sql,ps,kh);
			
			
		
		
	}

	public void deleteCourse(Course course) {
		getJdbcTemplate().update("DELETE FROM courses WHERE id = ?",
				new Object[] {course.getId() });
	
	}

	public void deleteCourseById(Integer id) {
		
		
		String sql="delete from  courses where id= :id";
		Map<String,Object> map= new HashMap();
		map.put("id",id );
        KeyHolder kh= new GeneratedKeyHolder();
		
		SqlParameterSource ps= new MapSqlParameterSource(map);
		
		getNamedParameterJdbcTemplate().update(sql,ps,kh);
	}

	public Course find(Integer id) {
	

		String sql = "SELECT * FROM courses WHERE id = ?";

	  Course course = (Course)getJdbcTemplate().queryForObject(
			  
				sql, new Object[] {id },
				new BeanPropertyRowMapper(Course.class));

		return course;
		
		
	}

	public List<Course> findaAll() {
		String sql = "SELECT * FROM courses";

		List<Course> courses= new ArrayList();

		List<Map<java.lang.String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		for (Map row : rows) {
			Course course = new Course();
			
			
			course.setTitle((String)(row.get("title")));
			course.setDuration((Integer)(row.get("duration")));
			course.setDesecription((String)(row.get("desecription")));

			courses.add(course);
		}
		
		return courses;
	}

	public List<Course> findbyProparty(String propartyName, Object propartyValue) {
		// TODO Auto-generated method stub
		return null;
	}

}
