package com.ep.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.spring.springorm.entity.Product;
import com.ep.spring.springorm.product.dao.ProductDao;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ep/spring/springorm/product/test/Config.xml");
		ProductDao productdaoimpl = (ProductDao) ctx.getBean("productdaoimpl");
		Product product=new Product();
		product.setId(5);
		product.setDescription("sdfsd");
		product.setPrice(13);
		product.setName("ram");
		productdaoimpl.create(product);
	}
	

}
