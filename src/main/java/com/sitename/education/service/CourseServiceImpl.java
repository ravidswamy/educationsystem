package com.sitename.education.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sitename.education.dao.CourseDao;
import com.sitename.education.entity.CourseEntity;

@Component
@Transactional
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao ;
	
	public List<CourseEntity> getAllCourses() {
		
		System.out.println("Made it  in the service method") ;
		return  courseDao.getAllCourses() ;
		
	}

	public CourseEntity getCourseById(long id) {

		return courseDao.getCourseById(id) ;
	}
}
