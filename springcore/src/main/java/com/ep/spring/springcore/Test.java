package com.ep.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.spring.springcore.Emplyee;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ep/spring/springcore/Config.xml");
		Emplyee emp=(Emplyee)ctx.getBean("emp");
		System.out.println("id="+emp.getId());
		System.out.println("name="+emp.getName());
		
		
	}

}
