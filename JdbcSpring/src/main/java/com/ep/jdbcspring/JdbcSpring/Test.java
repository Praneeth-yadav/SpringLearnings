package com.ep.jdbcspring.JdbcSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ep/jdbcspring/JdbcSpring/Config.xml");
		JdbcTemplate jdbcTemplate=(JdbcTemplate) ctx.getBean("jdbcTemplete");
		String sql="insert into employee values(?,?,?)";
		int res=jdbcTemplate.update(sql,new Integer(1),"ram","sita");
		System.out.println("results updtaed"+res);
	}
}
