package com.dom.test;

import java.util.Date;
 


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//import com.dom.test.UserEntity;

 
public class TestOrder {

 
public static void main ( String[] args ){
 
	Session session = null ;
	SessionFactory sessionFactory = null ;
  try {	
	  sessionFactory = new Configuration().configure().buildSessionFactory() ;	
	  session = sessionFactory.openSession();
  } catch ( Exception e ) {
  	System.out.println("Error : " + e.toString()) ;
  }
  session.beginTransaction();
  /* Order order = new Order();
  order.setOrder_Id(1);
  order.setOrderDate(new Date());
  order.setCustomerName("rrr");
  order.setOrderType("rrr"); */
  
  UserEntity userEntity = new UserEntity() ;
  userEntity.setUserId("userId");
  userEntity.setFirstName("userId");
  userEntity.setLastName("userId");
  userEntity.setGender("userId");
  userEntity.setDateOfBirth("userId");
  userEntity.setAddressLine1("userId");
  userEntity.setAddressLine2("userId");
  userEntity.setCity("userId");
  userEntity.setCounty("userId");
  userEntity.setPostCode("userId");
  userEntity.setCountryId("111");
  userEntity.setSchoolName("userId");
  userEntity.setParentFirstName("userId");
  userEntity.setParentLastName("userId");
  userEntity.setParentContactNo("userId");
  userEntity.setParentRelation("userId"); 
  
  session.save(userEntity);
  session.getTransaction().commit();
  
  sessionFactory.close();
  
  System.out.println("Row inserted") ;
}
 
}