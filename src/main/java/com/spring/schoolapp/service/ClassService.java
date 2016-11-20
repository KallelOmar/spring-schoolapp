package com.spring.schoolapp.service;

import com.spring.schoolapp.model.Classe;

public interface ClassService {
	Classe findById(int id);
	void setNewClassService(Classe classe);
}
