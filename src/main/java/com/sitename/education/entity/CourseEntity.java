package com.sitename.education.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



/*create table courses (
		id		number,
		name		Varchar2(100),
		description	varchar2(500),
		introvideopath	varchar2(100),
		constraint courses_pk primary key (id )
	); */

@Entity
@Table(name="COURSES", uniqueConstraints={@UniqueConstraint(columnNames="ID")})

public class CourseEntity implements Serializable {

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
	
	@Column(name="DESCRIPTION")
	private String description ;
	
	@Column(name="INTROVIDEOPATH")
	private String introVideoPath ;

	@OneToMany(cascade=CascadeType.ALL, mappedBy="course",fetch=FetchType.EAGER)
    private Set<InstructorEntity> instructors;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="course", fetch=FetchType.EAGER)
	private Set<SyllabusEntity> syllabus ;

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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getIntroVideoPath() {
		return introVideoPath;
	}


	public void setIntroVideoPath(String introVideoPath) {
		this.introVideoPath = introVideoPath;
	}


	public Set<InstructorEntity> getInstructors() {
		return instructors;
	}


	public void setInstructors(Set<InstructorEntity> instructors) {
		this.instructors = instructors;
	}


	public Set<SyllabusEntity> getSyllabus() {
		return syllabus;
	}


	public void setSyllabus(Set<SyllabusEntity> syllabus) {
		this.syllabus = syllabus;
	}
}
