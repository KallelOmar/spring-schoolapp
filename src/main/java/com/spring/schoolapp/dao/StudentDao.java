package com.spring.schoolapp.dao;

import com.spring.schoolapp.model.Student;

public interface StudentDao {
	Student findStudentById(int id);
	void setNewStudent(Student student);
}
