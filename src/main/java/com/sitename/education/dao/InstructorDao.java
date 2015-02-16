package com.sitename.education.dao;

import java.util.List;

import com.sitename.education.entity.CourseEntity;
import com.sitename.education.entity.InstructorEntity;

public interface InstructorDao {
	
	public List<InstructorEntity> getAllInstructors() ;
	public InstructorEntity getInstructorById( long id ) ;
	public List<InstructorEntity> getInstructorsByCourseId( long id ) ;
}
