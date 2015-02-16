package com.dom.test ;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/* create table instructors (
		id 		number,
		name		varchar2(100),
		picturepath	varchar2(100),
		shortbio	varchar2(500),
		courseid	number,
		constraint	instructors_pk primary key(id),
		constraint	course_instructor_fk foreign key (courseid) references courses(id)
	) ; */

public class Instructor implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id ;
	
	private String name ;
	
	private String picturePath ;
	
	private String shortBio ;
	
    private Course course;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortBio() {
		return shortBio;
	}
	
	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}
	

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}
	
}
