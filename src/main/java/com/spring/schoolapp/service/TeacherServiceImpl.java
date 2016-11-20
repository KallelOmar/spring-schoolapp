package com.spring.schoolapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.schoolapp.dao.TeacherDao;
import com.spring.schoolapp.model.Teacher;

@Service("teacherService")
@Transactional
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherDao teacherDao;
	
	public Teacher findTeacherByIdService(int id) {
		return teacherDao.findTeacherById(id);
	}

	public void setNewTeacherService(Teacher teacher) {
		teacherDao.setNewTeacher(teacher);
	}

	public List<Teacher> getAllTeachersServic() {
		return teacherDao.getListTeachers();
	}

}
