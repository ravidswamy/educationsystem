package com.sitename.education.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sitename.education.entity.CourseEntity;


@Repository
public class CourseDaoImpl implements CourseDao {

	@Autowired
	private SessionFactory sessionFactory ;
	
	@SuppressWarnings("unchecked")
	public List<CourseEntity> getAllCourses() {
		
		System.out.println("Made it in CourseDaoImpl") ;
		Session session = null ;
		Transaction transaction = null ;
		
		List<CourseEntity> courses = null ;
		try {
			System.out.println("In try") ;
			session = sessionFactory.openSession() ;
			System.out.println("created session") ;
			transaction = session.beginTransaction() ;
			System.out.println("begun transaction") ;
			
			courses = session.createQuery("from CourseEntity").list() ;
			System.out.println("query compeleted") ;
			transaction.commit(); 
			System.out.println("Commit done") ;
		} catch (Exception  e) {
			System.out.println("*** ERROR *** while getting list of courses") ;
			if ( transaction != null ) {
				System.out.println("Transaction is being rolled back") ;
				transaction.rollback();
			}
		} finally {
			System.out.println("Closing session") ;
			session.close() ;
		}
		return courses ;
	}

	public CourseEntity getCourseById( long id ) {
		
		CourseEntity courseEntity = null ;
		Session session = null ;
		Transaction transaction = null ;
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("from CourseEntity where id = " + id ) ;
			courseEntity = ( CourseEntity ) query.uniqueResult() ;
			transaction.commit();
		} catch ( Exception e) {
			System.out.println("*** ERROR *** while getting CourseEntity for id : " + id) ;
		}
		return courseEntity ;
	}

	
}
