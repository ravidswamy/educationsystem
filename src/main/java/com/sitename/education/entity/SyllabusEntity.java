package com.sitename.education.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


/*create table syllabus (
		id		number,
		name		varchar2(100),
		htmlpath	varchar2(100),
		courseid	number,
		constraint	syllabus_pk primary key (id),
		constraint	course_syllabus_fk foreign key (courseid ) references courses(id) */

@Entity
@Table(name="SYLLABUS", uniqueConstraints={@UniqueConstraint(columnNames="ID")})
public class SyllabusEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="education_Seq")
	@SequenceGenerator(name="education_Seq", sequenceName="education_Seq")
    @Column(name="ID")	
	private long id ;
	
	@Column(name="NAME")
	private String name ;
	
	@Column(name="HTMLPATH")
	private String htmlPath ;
	
	@ManyToOne
	@JoinColumn(name="COURSEID")
	private CourseEntity course ;

	//fetch = FetchType.EAGER, mappedBy = "topic", cascade = CascadeType.ALL
	@OneToMany(mappedBy="syllabus", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<SubjectEntity> subjects ;
	
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

	public String getHtmlPath() {
		return htmlPath;
	}

	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}

	public CourseEntity getCourse() {
		return course;
	}

	public void setCourse(CourseEntity course) {
		this.course = course;
	}

	public Set<SubjectEntity> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<SubjectEntity> subjects) {
		this.subjects = subjects;
	}

	
}
