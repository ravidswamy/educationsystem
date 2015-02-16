package com.sitename.education.dao;

import java.util.List;

import com.sitename.education.entity.InstructorEntity;
import com.sitename.education.entity.SyllabusEntity;

public interface SyllabusDao {

	public List<SyllabusEntity> getAllSyllabus() ;
	public SyllabusEntity getSyllabusById( long id ) ;
	public List<SyllabusEntity> getSyllabusByCourseId( long id ) ;
	
}
