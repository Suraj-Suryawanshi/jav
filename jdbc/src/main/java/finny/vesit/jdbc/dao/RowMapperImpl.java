package finny.vesit.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import finny.vesit.jdbc.enities.student;

public class RowMapperImpl implements RowMapper<student>{

	public student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		student stud = new student();
		stud.setId(rs.getInt(1));
		stud.setName(rs.getString(2));
		stud.setCity(rs.getString(3));
		return stud;
	}

}
