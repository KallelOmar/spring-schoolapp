package com.spring.schoolapp.dao;

import java.util.List;

import com.spring.schoolapp.model.Teacher;

public interface TeacherDao {
	Teacher findTeacherById(int id);
	void setNewTeacher(Teacher teacher);
	List<Teacher> getListTeachers();
}
