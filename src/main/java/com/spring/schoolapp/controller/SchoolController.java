package com.spring.schoolapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.schoolapp.model.Classe;
import com.spring.schoolapp.model.Matter;
import com.spring.schoolapp.model.Student;
import com.spring.schoolapp.model.Teacher;
import com.spring.schoolapp.service.ClassService;
import com.spring.schoolapp.service.MatterService;
import com.spring.schoolapp.service.StudentService;
import com.spring.schoolapp.service.TeacherService;

@Controller
public class SchoolController {
	
	@Autowired
	ClassService classService;
	
	@Autowired
	TeacherService teacherService;
	
	@Autowired
	MatterService matterService;
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {

		Student student1 =new Student();
		Student student2 = new Student();
		Classe classe1 = classService.findById(3);
		Classe classe2 = classService.findById(2); 
		student1.setClasse(classe1);
		student1.setStudentName("Amin");
		student2.setClasse(classe1);
		student2.setStudentName("OmarK");
		studentService.setNewStudentService(student1);
		studentService.setNewStudentService(student2);
		List<Teacher> teacher = teacherService.getAllTeachersServic();
		return "welcome";
	}
}
