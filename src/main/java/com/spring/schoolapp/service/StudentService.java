package com.spring.schoolapp.service;

import com.spring.schoolapp.model.Student;

public interface StudentService {
	Student findStudentByIdService(int id);
	void setNewStudentService(Student student);
}
