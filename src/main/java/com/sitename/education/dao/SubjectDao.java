package com.sitename.education.dao;

import java.util.List;

import com.sitename.education.entity.SubjectEntity;

public interface SubjectDao {

	public List<SubjectEntity> getAllSubjects() ;
	public SubjectEntity getSubjectById( long id ) ;
	public List<SubjectEntity> getSubjectsBySyllabusId( long id ) ;
} 
