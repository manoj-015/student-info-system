package com.app.sm.dao;

import java.util.List;

import com.app.sm.entity.Student;


public interface StudentDAO {
	List<Student> findStudents();
}
