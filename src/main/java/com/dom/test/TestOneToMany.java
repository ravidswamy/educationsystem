package com.dom.test ;

import java.util.Date;
 


import java.util.List;
import java.util.Set;

import javassist.bytecode.Descriptor.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

 
public class TestOneToMany {

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
	  
	  List courses = session.createQuery("from Instructor").list() ;
	
	  java.util.Iterator it = courses.iterator() ;
	  
	  while ( it.hasNext() ) {
		  //Course course = ( Course ) it.next() ;
		  Instructor course = ( Instructor ) it.next() ;
		  System.out.println("Course Id,Name : " + course.getId() + ", " + course.getName()) ;
		  
		 /* Set instructors = course.getInstructors() ;
		  java.util.Iterator it2 = instructors.iterator() ;
		  
		  while ( it2.hasNext() ) {
			  Instructor inst = ( Instructor ) it2.next() ;
			  System.out.println("\tInstructor name : " + inst.getName() ) ;
		  } */
	  }
	  session.getTransaction().commit();
	  
	  sessionFactory.close();
	  
	}
 
}