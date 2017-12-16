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

import com.practice.coursemgmtsystem.model.User;
import com.versal.coursemgmtsystem.dao.BaseDAO;
import com.versal.coursemgmtsystem.dao.UserDAO;

@Repository
public class UserDAOImpl  extends BaseDAO implements UserDAO {

	private static final String String = null;

	public void saveUser(User user) {
	
		String sql="insert into users(name, contact, email, address ,loginname ,password) values(:name, :contact, :email, :address ,:loginname ,:password)";
		
		Map<String,Object> map= new HashMap();
		map.put("name", user.getName());
		map.put("contact", user.getContact());
		map.put("email", user.getEmail());
		map.put("address", user.getAddress());
		map.put("loginname", user.getLoginname());
		map.put("password", user.getPassword());
		KeyHolder kh= new GeneratedKeyHolder();
		
		SqlParameterSource ps= new MapSqlParameterSource(map);
		
		getNamedParameterJdbcTemplate().update(sql,ps,kh);
		
		Integer userid=kh.getKey().intValue();
		user.setId(userid);
		
		
		
	}
	
	
		public void updateUser(User user) {
			
    String sql="update users set name=:name, contact=:contact, email=:email, address=:address ,loginname=:loginname ,password=:password where id=:id";
			
			Map<String,Object> map= new HashMap();
			map.put("name", user.getName());
			map.put("contact", user.getContact());
			map.put("email", user.getEmail());
			map.put("address", user.getAddress());
			map.put("loginname", user.getLoginname());
			map.put("password", user.getPassword());
			map.put("id", user.getId());
			
			KeyHolder kh= new GeneratedKeyHolder();
			
			SqlParameterSource ps= new MapSqlParameterSource(map);
			
			getNamedParameterJdbcTemplate().update(sql,ps,kh);
			
			
		
		
	}

	public void deleteUser(User user) {
		
	getJdbcTemplate().update("DELETE FROM users WHERE id = ?",
				new Object[] {user.getId() });
	
		
	
	}

	public void deleteUserById(Integer id) {
		
		String sql="delete from  users where id= :id";
		Map<String,Object> map= new HashMap();
		map.put("id",id );
        KeyHolder kh= new GeneratedKeyHolder();
		
		SqlParameterSource ps= new MapSqlParameterSource(map);
		
		getNamedParameterJdbcTemplate().update(sql,ps,kh);
		
		
		
	}

	public User find(Integer id) {
		
		
		
		String sql = "SELECT * FROM users WHERE id = ?";

	  User user = (User)getJdbcTemplate().queryForObject(
			  
				sql, new Object[] {id },
				new BeanPropertyRowMapper(User.class));

		return user;
		
	
	}

	public List<User> findaAll() {
		String sql = "SELECT * FROM users";

		/*List<User> users= new ArrayList();

		List<Map<java.lang.String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		for (Map row : rows) {
			User user = new User();
			user.setName((String)(row.get("name")));
			user.setContact((String)(row.get("contact")));
			user.setEmail((String)(row.get("email")));
			user.setAddress((String)(row.get("address")));
			user.setLoginname((String)(row.get("loginname")));
			user.setPassword((String)(row.get("password")));
			users.add(user);*/

		List<User> users  = getJdbcTemplate().query(sql,
				new BeanPropertyRowMapper(User.class));

		return users;
	
		
		
		
	}
		

	public List<User> findbyProparty(String propartyName, Object propartyValue) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
