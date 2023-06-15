package com.ep.jdbcspring.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ep.jdbcspring.Dao.EmployeeDao;
import com.ep.jdbcspring.Dto.Employee;

public class test {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ep/jdbcspring/employee/test/Config.xml");
		EmployeeDao dao=(EmployeeDao) ctx.getBean("dao");
		Employee employee = new Employee();
		employee.setId(2);
		employee.setFirstname("john");
		employee.setLastname("deer");
		//int res=dao.create(employee);
		Employee emp=dao.read(1);
		System.out.println("result="+emp);
		
	}
}
