package com.sitename.education.service;

import java.util.List;

import com.sitename.education.entity.SyllabusEntity;


public interface SyllabusService {

	public List<SyllabusEntity> getAllSyllabus() ;
	public SyllabusEntity getSyllabusById( long id ) ;
	public List<SyllabusEntity> getSyllabusByCourseId( long id ) ;

}
