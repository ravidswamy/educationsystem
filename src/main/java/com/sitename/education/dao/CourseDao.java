package com.sitename.education.dao;

import java.util.List;

import com.sitename.education.entity.CourseEntity;

public interface CourseDao {
	
	public List<CourseEntity> getAllCourses() ;
	public CourseEntity getCourseById ( long  id ) ;
	
}
