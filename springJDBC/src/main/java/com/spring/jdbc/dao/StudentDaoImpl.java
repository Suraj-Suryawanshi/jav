package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entity.Student;

public class StudentDaoImpl implements StudentDao {
	
	private JdbcTemplate jdbcTemplate;

//	@Override
	public int insert(Student student) {
		//insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}
	
//	@Override
	public int delete(Student student) {
		String query = "delete from student where id=?";
		int result = this.jdbcTemplate.update(query,student.getId());
		return result;
	}
	

//	@Override
	public int change(Student student) {
		//update query
		String query = "update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return result;
	}

//	@Override
	//fetch student row by the id using RowMapper
	public Student getStudent(int studentId) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();			//can also do via anonymous clas well but the code will get bit complicate
		Student student= this.jdbcTemplate.queryForObject(query,rowMapper,studentId );
		return student;
	}

	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Student> getAllStudents() {
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
		return students;
	}

	
	
	
}
