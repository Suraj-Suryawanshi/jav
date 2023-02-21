package vesit.questions.practicalexam.jdbc;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import vesit.questions.practicalexam.entity.Student;

public class StudentDao {

	JdbcTemplate jdbctemplate;
	

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	public void insert(Student stud)
	{
		String query ="insert into student(rollno,name,age) values(?,?,?)";
		this.jdbctemplate.update(query,stud.getRollno(),stud.getName(),stud.getAge());
		System.out.println("Data inserted");
	}
	
	public void delete(int student) {
		String query = "delete from student where rollno = ?";
		this.jdbctemplate.update(query,student);
		System.out.println("Data deleted");
	}
	
	public Student getstudent(int student)
	{
		
		String query = "select * from student where rollno = ?";
		RowMapper<Student> r = new RowMapperImpl();
		Student st = jdbctemplate.queryForObject(query, r,student);
		return st;
	}
	
	public List<Student> getstudents()
	{
		String query = "Select * from student";
		List<Student> std = this.jdbctemplate.query(query, new RowMapperImpl());
		return std;
	}
	
}
