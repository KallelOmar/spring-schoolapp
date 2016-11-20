package com.spring.schoolapp.dao;

import org.springframework.stereotype.Repository;

import com.spring.schoolapp.model.Matter;

@Repository("matterDao")
public class MatterDaoImpl extends AbstractDao<Integer,Matter> implements MatterDao{

	public Matter findMatterById(int id) {
		return getByKey(id);
	}

	public void setNewMatter(Matter matter) {
		persist(matter);
	}

}
