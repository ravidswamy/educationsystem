package com.sitename.education.entity;

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
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;

@Entity
@Table(name="APPUSER")
public class UserEntity  implements Serializable{

	private static final long serialVersionUID = 1L;

	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="education_Seq")
	@SequenceGenerator(name="education_Seq", sequenceName="education_Seq")
    @Column(name="ID")
	private long id ;
	
	@Column(name="USERID")
	private String  userId ;
	
	@Column(name="PASSWORD")
	private String 	password ; 		

	@Column(name="FIRSTNAME")
    private String 	firstName ;		
	
	@Column(name="LASTNAME")
    private String 	lastName ;		
	
	@Column(name="GENDER")
    private String 	gender ;			
	
/*	@Column(name="DATEOFBIRTH")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date  	dateOfBirth	; */
	
	@Column(name="DATEOFBIRTH")
	private String dateOfBirth ;
	
	@Column(name="ADDRESSLINE1")
    private String  addressLine1 ;		
	
	@Column(name="ADDRESSLINE2")
    private String  addressLine2 ;		
	
	@Column(name="CITY")
    private String  city ;			
	
	@Column(name="COUNTY")
    private String  county ;			
	
	@Column(name="POSTCODE")
    private String  postCode ;		
	
	@Column(name="COUNTRYID")
    private String   countryId ;		
	
	@Column(name="SCHOOLNAME")
    private String  schoolName ;		
	
	@Column(name="PARENTFIRSTNAME")
    private String  parentFirstName ;		
	
	@Column(name="PARENTLASTNAME")
    private String  parentLastName	;	
	
	@Column(name="PARENTCONTACTNO")
    private String  parentContactNo ;		
	
	@Column(name="PARENTRELATION")
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
		if ( password != null ) {
			PasswordEncoder passwordEncoder = new Md5PasswordEncoder() ;
			this.password = passwordEncoder.encodePassword(password, null);
		}
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
