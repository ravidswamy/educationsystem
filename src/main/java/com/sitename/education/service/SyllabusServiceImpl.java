package com.sitename.education.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sitename.education.dao.SyllabusDao;
import com.sitename.education.entity.SyllabusEntity;

@Component
@Transactional
public class SyllabusServiceImpl implements SyllabusService {

	@Autowired
	private SyllabusDao syllabusDao ;
	
	public List<SyllabusEntity> getAllSyllabus() {
		
		return syllabusDao.getAllSyllabus() ;
	}

	public SyllabusEntity getSyllabusById(long id) {
		
		return syllabusDao.getSyllabusById(id) ;
		
	}

	public List<SyllabusEntity> getSyllabusByCourseId(long id) {
		return syllabusDao.getSyllabusByCourseId(id) ;
	}

}
