package com.sitename.education.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sitename.education.dao.CourseDao;
import com.sitename.education.dao.InstructorDao;
import com.sitename.education.entity.CourseEntity;
import com.sitename.education.entity.InstructorEntity;

@Component
@Transactional
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	private InstructorDao instructorDao ;
	
	public List<InstructorEntity> getAllInstructors() {
		
		System.out.println("Made it  in the service method getAllInstructors" ) ;
		return  instructorDao.getAllInstructors() ;
		
	}

	public InstructorEntity getInstructorById(long id) {
		return instructorDao.getInstructorById(id) ;
	}

	public List<InstructorEntity> getInstructorsByCourseId(long id) {
		return instructorDao.getInstructorsByCourseId(id) ;
	}
}
