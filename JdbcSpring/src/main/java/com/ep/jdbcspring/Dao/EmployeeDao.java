package com.ep.jdbcspring.Dao;

import com.ep.jdbcspring.Dto.Employee;

public interface EmployeeDao {
	public int create(Employee employee);
	public Employee read(int id);

}
