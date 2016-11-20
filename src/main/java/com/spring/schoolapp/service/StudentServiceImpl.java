package com.spring.schoolapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.schoolapp.dao.StudentDao;
import com.spring.schoolapp.model.Student;

@Service("studentService")
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	public Student findStudentByIdService(int id) {
		return studentDao.findStudentById(id);
	}

	public void setNewStudentService(Student student) {
		studentDao.setNewStudent(student);
	}

}
