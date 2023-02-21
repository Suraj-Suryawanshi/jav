package finny.vesit.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import finny.vesit.jdbc.enities.student;

public class studentDao {

	 JdbcTemplate jdbctemplate; 
	 
	 public int insert(student stud)
	 {
		 String query = "insert into student(id,name,city) values(?,?,?)";
		 int r = this .jdbctemplate.update(query, stud.getId(),stud.getName(),stud.getCity());
		 System.out.println("Data inserted");
		 return r;
	 }
	 
	 public int update(student stud)
	 {
		 return 0;
	 }
	 
	 public student getStudent(int studentId)
	 {
		 String query = "select * from student where id = ?";
		 RowMapper<student> rowMapper = new RowMapperImpl(); 
		 student stud = this.jdbctemplate.queryForObject(query, rowMapper,studentId);
		 return stud;
		 
		 }

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	 
}
