package com.versal.coursemgmtsystem.configuration;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.practice.scms.daoimpl"})
public class SpringRootConfig {

	@Bean
	public BasicDataSource getDatasource(){

		 BasicDataSource bds= new BasicDataSource();
		 
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3306/cmsmgmtdb");
		bds.setUsername("root");
		bds.setPassword("root");
		bds.setMaxTotal(2);
		bds.setInitialSize(1);
		bds.setTestOnBorrow(true);
		bds.setValidationQuery("SELECT 1");
		bds.setDefaultAutoCommit(true);
		
		return bds;
		 
		
	}
	
	

	
}
