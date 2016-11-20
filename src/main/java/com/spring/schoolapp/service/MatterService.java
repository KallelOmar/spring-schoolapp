package com.spring.schoolapp.service;

import com.spring.schoolapp.model.Matter;

public interface MatterService {
	Matter findMatterByIdService(int id);
	void setNewMatterService(Matter matter);
}
