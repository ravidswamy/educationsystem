package com.dom.test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;


public class IdEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private long id ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
