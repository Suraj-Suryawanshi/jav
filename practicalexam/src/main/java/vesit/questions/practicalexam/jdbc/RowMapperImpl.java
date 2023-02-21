package vesit.questions.practicalexam.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vesit.questions.practicalexam.entity.Student;

public class RowMapperImpl implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student st = new Student();
		st.setRollno(rs.getInt(1));
		st.setName(rs.getString(2));
		st.setAge(rs.getInt(3));
		return st;
	}

}
