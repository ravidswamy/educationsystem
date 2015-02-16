package com.dom.test;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;


public class UserEntity  implements Serializable{

	private static final long serialVersionUID = 1L;

	public UserEntity() {
		// TODO Auto-generated constructor stub
	}
	private long    id ;
	private String  userId ;
	private String 	password ; 		
    private String 	firstName ;		
    private String 	lastName ;		
    private String 	gender ;			
	private String  dateOfBirth ;
    private String  addressLine1 ;		
    private String  addressLine2 ;		
    private String  city ;			
    private String  county ;			
    private String  postCode ;		
    private String  countryId ;		
    private String  schoolName ;		
    private String  parentFirstName ;		
    private String  parentLastName	;	
    private String  parentContactNo ;		
    private String  parentRelation ;
    

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId ;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth ;
	}
	
	public void setDateOfBirth(String dateOfBirth)  {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getAddressLine1() {
		return addressLine1;
	}
	
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	public String getAddressLine2() {
		return addressLine2;
	}
	
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCounty() {
		return county;
	}
	
	public void setCounty(String county) {
		this.county = county;
	}
	
	public String getPostCode() {
		return postCode;
	}
	
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public String getCountryId() {
		return countryId;
	}
	
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getParentFirstName() {
		return parentFirstName;
	}
	
	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}
	
	public String getParentLastName() {
		return parentLastName;
	}
	
	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}
	public String getParentContactNo() {
		return parentContactNo;
	}
	
	public void setParentContactNo(String parentContactNo) {
		this.parentContactNo = parentContactNo;
	}
	
	public String getParentRelation() {
		return parentRelation;
	}
	
	public void setParentRelation(String parentRelation) {
		this.parentRelation = parentRelation;
	}			
	
	
}
