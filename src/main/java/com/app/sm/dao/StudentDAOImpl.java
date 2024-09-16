package com.app.sm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.app.sm.entity.Student;
import com.app.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> findStudents() {
		final String SELECT_STUDENTS = "select * from student;";
		List<Student> students = jdbcTemplate.query(SELECT_STUDENTS, new StudentRowMapper());
		
		return students;
	}

}
