package com.ep.interfaceimpl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ep/interfaceimpl/Config.xml");
		Bo bo = (Bo) ctx.getBean("bo");
		bo.createorder();
		
	}

}
