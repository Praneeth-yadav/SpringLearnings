package com.ep.properties.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ep/properties/dao/Config.xml");
		PropertiesDAO dao=(PropertiesDAO)ctx.getBean("myDao");
		System.out.println(dao);
		
		
	}

}
