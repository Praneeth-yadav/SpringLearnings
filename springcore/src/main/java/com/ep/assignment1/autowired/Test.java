package com.ep.assignment1.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ep/assignment1/autowired/Config.xml");
		ShoppingCart cart=(ShoppingCart)ctx.getBean("Cart");
		System.out.println(cart);
	}

}
