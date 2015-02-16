package com.sitename.education.service;

import java.util.List;

import com.sitename.education.entity.SubjectEntity;

public interface SubjectService {

	public List<SubjectEntity> getAllSubjects() ;
	public SubjectEntity getSubjectById( long id ) ;
	public List<SubjectEntity> getSubjectsBySyllabusId( long id ) ;
	
}
