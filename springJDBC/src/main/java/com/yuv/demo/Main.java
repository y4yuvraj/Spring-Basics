package com.yuv.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class Main {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/yuv/demo/config.xml");
		Main obj= (Main)context.getBean("main");
		EmployeeRowMapper empRowMapper= new EmployeeRowMapper();
		Employee emp1 = obj.jdbcTemplate.queryForObject("select * from Employee where id=?", empRowMapper,1);
		System.out.println(emp1);
	}

}
