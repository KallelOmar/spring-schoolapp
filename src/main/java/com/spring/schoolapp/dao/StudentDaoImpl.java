package com.spring.schoolapp.dao;

import org.springframework.stereotype.Repository;

import com.spring.schoolapp.model.Student;

@Repository("studentDao")
public class StudentDaoImpl extends AbstractDao<Integer,Student> implements StudentDao {

	public Student findStudentById(int id) {
		return getByKey(id);
	}

	public void setNewStudent(Student student) {
		persist(student);
	}

}
