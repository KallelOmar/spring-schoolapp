package com.spring.schoolapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.schoolapp.model.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl extends AbstractDao<Integer,Teacher> implements TeacherDao 
{

	public Teacher findTeacherById(int id) {
		return getByKey(id);
	}

	public void setNewTeacher(Teacher teacher) {
		persist(teacher);
	}

	public List<Teacher> getListTeachers() {
		return this.executeHqlQueryList("list.all.teachers");
	}
	
}
