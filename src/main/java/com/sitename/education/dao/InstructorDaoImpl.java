package com.sitename.education.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sitename.education.entity.CourseEntity;
import com.sitename.education.entity.InstructorEntity;


@Repository
public class InstructorDaoImpl implements InstructorDao {

	@Autowired
	private SessionFactory sessionFactory ;
	
	@SuppressWarnings("unchecked")
	public List<InstructorEntity> getAllInstructors() {
		
		System.out.println("Made it in InstructorDaoImpl") ;
		Session session = null ;
		Transaction transaction = null ;
		
		List<InstructorEntity> instructors = null ;
		try {
			System.out.println("In try") ;
			session = sessionFactory.openSession() ;
			System.out.println("created session") ;
			transaction = session.beginTransaction() ;
			System.out.println("begun transaction") ;
			
			instructors = session.createQuery("from InstructorEntity").list() ;
			System.out.println("query compeleted") ;
			transaction.commit(); 
			System.out.println("Commit done") ;
		} catch (Exception  e) {
			System.out.println("*** ERROR *** while getting list of instructors") ;
			if ( transaction != null ) {
				System.out.println("Transaction is being rolled back") ;
				transaction.rollback();
			}
		} finally {
			session.close() ;
		}
		return instructors ;
	}

	public InstructorEntity getInstructorById( long id ) {
		
		InstructorEntity instructorEntity = null ;
		Session session = null ;
		Transaction transaction = null ;
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("from InstructorEntity where id = " + id ) ;
			instructorEntity = ( InstructorEntity ) query.uniqueResult() ;
			transaction.commit();
		} catch ( Exception e) {
			System.out.println("*** ERROR *** while getting InstructorEntity for id : " + id) ;
			if ( transaction != null ) {
				System.out.println("Transaction is being rolled back") ;
				transaction.rollback();
			}			
		}
		return instructorEntity ;
	}

	public List<InstructorEntity> getInstructorsByCourseId(long id) {

		System.out.println("getInstructorsByCourseId from Implementation") ;
		List<InstructorEntity> instructors = null ;
		Session session = null ;
		Transaction transaction = null ;
		
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("from InstructorEntity where courseId = " + id) ;
			instructors = query.list() ;
			
			System.out.println("Count of instructors : " + instructors.size() ) ;
			transaction.commit(); 
		} catch ( Exception e ) {
			System.out.println("*** ERROR *** while getting instructors for courseId : " + id ) ;
			if ( transaction != null ) {
				System.out.println("Transaction is being rolled back") ;
				transaction.rollback();
			}			
		}
		return instructors;
	}

}
