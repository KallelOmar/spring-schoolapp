package com.spring.schoolapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.schoolapp.dao.MatterDao;
import com.spring.schoolapp.model.Matter;

@Service("matterService")
@Transactional
public class MatterServiceImpl implements MatterService {
	
	@Autowired
	private MatterDao matterDao;
	
	public Matter findMatterByIdService(int id) {
		return matterDao.findMatterById(id);
	}

	public void setNewMatterService(Matter matter) {
		matterDao.setNewMatter(matter);
	}

}
