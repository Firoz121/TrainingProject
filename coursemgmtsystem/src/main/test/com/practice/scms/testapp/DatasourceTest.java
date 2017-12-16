package com.practice.scms.testapp;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.versal.coursemgmtsystem.configuration.SpringRootConfig;

public class DatasourceTest {

	public static void main(String[] args) {
		
	ApplicationContext ctx	= new AnnotationConfigApplicationContext(SpringRootConfig.class);
	
	DataSource ds=ctx.getBean(DataSource.class);
	
	
	JdbcTemplate jt = new JdbcTemplate(ds);
	
	String sql="insert into users(name, contact, email, address ,loginname ,password) values(?,?,?,?,?,?)";
	
	Object[] param= new Object[]{"sam","237","sam@yahoo.com","pune","sam123","123"};
	
	
	jt.update(sql, param);
	
	System.out.println("sql executed");
	
	
		
	}

}
