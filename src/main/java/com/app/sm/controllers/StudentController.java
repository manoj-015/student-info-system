package com.app.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.sm.dao.StudentDAO;
import com.app.sm.dto.StudentDTO;
import com.app.sm.entity.Student;

@Controller
public class StudentController {
	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping(value="/showStudent",method=RequestMethod.GET)
	public String showStudentList(Model model) {
		
		List<Student> students = studentDAO.findStudents();
		
		for(Student student : students) {
			System.out.println(student);
		}
		
		model.addAttribute("students", students);
		
		return "student-list";
	}
	
	@RequestMapping(value="/addStudent",method=RequestMethod.GET)
	public String addStudent(Model model) {
		StudentDTO dto = new StudentDTO();
		model.addAttribute("studentDTO", dto);
		return "add-student-form";
	}
	
	
	@RequestMapping(value="/submit-success",method=RequestMethod.GET)
	@ResponseBody
	public String addStudent(StudentDTO studentDTO) {
		System.out.println(studentDTO);
		return "Record Added";
	}
}	
