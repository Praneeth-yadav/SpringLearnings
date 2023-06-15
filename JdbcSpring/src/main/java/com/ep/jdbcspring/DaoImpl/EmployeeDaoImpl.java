package com.ep.jdbcspring.DaoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.ep.jdbcspring.Dao.EmployeeDao;
import com.ep.jdbcspring.Dao.rowmapper.rowmapper;
import com.ep.jdbcspring.Dto.Employee;
@Component("dao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplete;

	@Override
	public int create(Employee employee) {

		String sql = "insert into employee values(?,?,?)";
		int res = jdbcTemplete.update(sql, employee.getId(), employee.getFirstname(), employee.getLastname());
		return res;
	}
	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		rowmapper rowmapper=new rowmapper();
		Employee emp=jdbcTemplete.queryForObject(sql, rowmapper, id);
		return emp;
	}

	public JdbcTemplate getJdbcTemplete() {
		return jdbcTemplete;
	}

	public void setJdbcTemplete(JdbcTemplate jdbcTemplete) {
		this.jdbcTemplete = jdbcTemplete;
	}


	

}
