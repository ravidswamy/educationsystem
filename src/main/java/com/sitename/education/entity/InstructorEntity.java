package com.sitename.education.entity;

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

@Entity
@Table(name="INSTRUCTORS", uniqueConstraints={@UniqueConstraint(columnNames="ID")})
public class InstructorEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="education_Seq")
	@SequenceGenerator(name="education_Seq", sequenceName="education_Seq")
    @Column(name="ID")	
	private long id ;
	
	@Column(name="NAME")
	private String name ;
	
	@Column(name="SHORTBIO")
	private String shortBio ;
	
	@ManyToOne
	@JoinColumn(name="COURSEID")
    private CourseEntity course;
	
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
	

	public CourseEntity getCourse() {
		return course;
	}

	public void setCourse(CourseEntity course) {
		this.course = course;
	}

}
