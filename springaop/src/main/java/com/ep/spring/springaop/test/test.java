package com.ep.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.spring.springaop.ProductService;

public class test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ep/spring/springaop/test/Config.xml");
	ProductService productservice=(ProductService) ctx.getBean("productService");
	System.out.println(productservice.multiply(4,5));
	
	
	}

}
