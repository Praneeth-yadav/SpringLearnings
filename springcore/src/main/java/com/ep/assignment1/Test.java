package com.ep.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ep/assignment1/Config.xml");
		ShoppingCart cart=(ShoppingCart)ctx.getBean("Cart");
		System.out.println(cart);
	}

}
