package com.vesit.springbootTest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.dao.DataAccessException;
@RestController
public class TestController {
@Autowired
JdbcTemplate template;
@GetMapping("/display")
public List<Employee> getAllRecords(){
	return template.query("select * from Employee_Siddhartha;",new
			ResultSetExtractor<List<Employee>>() {
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException,
			DataAccessException {
			List<Employee> emp_list = new ArrayList<Employee>();
			while(rs.next()) {
			Employee emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			
			emp.setSalary(rs.getInt(3));
			emp_list.add(emp);
			}
			return emp_list;
			}
			});
			}
			}
