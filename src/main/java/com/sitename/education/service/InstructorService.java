package com.sitename.education.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sitename.education.dao.CourseDao;
import com.sitename.education.entity.CourseEntity;
import com.sitename.education.entity.InstructorEntity;


public interface InstructorService {
	
	public List<InstructorEntity> getAllInstructors() ;
	public InstructorEntity getInstructorById( long id ) ;
	public List<InstructorEntity> getInstructorsByCourseId( long id ) ;
	
}
