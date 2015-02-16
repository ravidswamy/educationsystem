package com.sitename.education.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sitename.education.dao.SubjectDao;
import com.sitename.education.entity.SubjectEntity;

@Component
@Transactional
public class SubjectServiceImpl implements SubjectService {

	@Autowired
	SubjectDao subjectDao ;
	
	public List<SubjectEntity> getAllSubjects() {
		
		return subjectDao.getAllSubjects() ;
	}

	public SubjectEntity getSubjectById(long id) {
		
		return subjectDao.getSubjectById( id );
	}

	public List<SubjectEntity> getSubjectsBySyllabusId(long id) {
		return subjectDao.getSubjectsBySyllabusId(id) ;
	}

}
