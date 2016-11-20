package com.spring.schoolapp.dao;

import org.springframework.stereotype.Repository;

import com.spring.schoolapp.model.Classe;

@Repository("classDao")
public class ClassDaoImpl extends AbstractDao<Integer,Classe> implements ClassDao{
	
	public Classe findClassById(int id) {
		return getByKey(id);
	}

	public void setNewClass(Classe classe) {
		persist(classe);
	}

}
