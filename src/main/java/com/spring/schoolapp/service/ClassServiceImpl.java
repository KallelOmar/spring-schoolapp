package com.spring.schoolapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.schoolapp.dao.ClassDao;
import com.spring.schoolapp.model.Classe;

@Service("classService")
@Transactional
public class ClassServiceImpl implements ClassService{

	@Autowired
	ClassDao dao;
	
	public Classe findById(int id) {
		return dao.findClassById(id);
	}

	public void setNewClassService(Classe classe) {
		dao.setNewClass(classe);
	}

}
