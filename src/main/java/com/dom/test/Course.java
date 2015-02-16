package com.dom.test ;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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

public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id ;
	
	private String name ;
	
	private String description ;
	
	private String introVideoPath ;

    private Set<Instructor> instructors;
	

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


	public Set<Instructor> getInstructors() {
		return instructors;
	}


	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
	}
}
