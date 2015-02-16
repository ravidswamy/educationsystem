package com.sitename.education.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;

@MappedSuperclass
public class IdEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="education_Seq")
	@SequenceGenerator(name="education_Seq", sequenceName="education_Seq")
    @Column(name="ID")
	private long id ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
