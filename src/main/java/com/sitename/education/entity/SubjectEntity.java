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


/*create table subjects (
		id		number,
		name		varchar2(100),
		description	varchar2(500),
		syllabusid	number,				
		constraint subjects_pk primary key (id),
		constraint course_subject_fk foreign key ( syllabusid ) references syllabus(id)
	)  */

@Entity
@Table(name="SUBJECTS", uniqueConstraints={@UniqueConstraint(columnNames="ID")})
public class SubjectEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="education_Seq")
	@SequenceGenerator(name="education_Seq", sequenceName="education_Seq")
    @Column(name="ID")	
	private long id ;
	
	@Column(name="NAME")
	private String name ;
	
	@Column(name="DESCRIPTION")
	private String description ;

	@ManyToOne
	@JoinColumn(name="SYLLABUSID")
	SyllabusEntity syllabus ;

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

	public SyllabusEntity getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(SyllabusEntity syllabus) {
		this.syllabus = syllabus;
	}

}
