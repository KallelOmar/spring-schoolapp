package com.spring.schoolapp.service;

import java.util.List;

import com.spring.schoolapp.model.Teacher;

public interface TeacherService {
	Teacher findTeacherByIdService(int id);
	void setNewTeacherService(Teacher teacher);
	List<Teacher> getAllTeachersServic();
}
