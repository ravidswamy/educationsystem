package com.sitename.education.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sitename.education.dao.CourseDao;
import com.sitename.education.entity.CourseEntity;


public interface CourseService {
	
	public List<CourseEntity> getAllCourses() ;
	public CourseEntity getCourseById( long id ) ;
	
}
