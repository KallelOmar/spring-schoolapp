package com.spring.schoolapp.dao;

import com.spring.schoolapp.model.Matter;

public interface MatterDao {
	
	Matter findMatterById(int id);
	void setNewMatter(Matter matter);
	
}
