package com.spring.schoolapp.dao;

import com.spring.schoolapp.model.Classe;

public interface ClassDao {

		Classe findClassById(int id);
		void setNewClass(Classe classe);
}
