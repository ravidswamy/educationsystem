package com.sitename.education.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sitename.education.entity.CourseEntity;
import com.sitename.education.entity.SubjectEntity;

@Repository
public class SubjectDaoImpl implements SubjectDao {

	@Autowired
	SessionFactory sessionFactory ;
	
	public List<SubjectEntity> getAllSubjects() {

		System.out.println("Made it in SubjectDaoImpl") ;
		Session session = null ;
		Transaction transaction = null ;
		
		List<SubjectEntity> subjects = null ;
		try {
			System.out.println("In try") ;
			session = sessionFactory.openSession() ;
			System.out.println("created session") ;
			transaction = session.beginTransaction() ;
			System.out.println("begun transaction") ;
			
			subjects = session.createQuery("from SubjectEntity").list() ;
			System.out.println("query compeleted") ;
			transaction.commit(); 
			System.out.println("Commit done") ;
		} catch (Exception  e) {
			System.out.println("*** ERROR *** while getting list of subjects") ;
			if ( transaction != null ) {
				System.out.println("Transaction is being rolled back") ;
				transaction.rollback();
			}
		} finally {
			System.out.println("Closing session") ;
			session.close() ;
		}
		return subjects ;

		
	}

	public SubjectEntity getSubjectById( long id ) {
		
		SubjectEntity subjectEntity = null ;
		Session session = null ;
		Transaction transaction = null ;
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("from SubjectEntity where id = " + id ) ;
			subjectEntity = ( SubjectEntity ) query.uniqueResult() ;
			transaction.commit();
		} catch ( Exception e) {
			System.out.println("*** ERROR *** while getting SubjectEntity for id : " + id) ;
		}
		return subjectEntity ;
	}

	public List<SubjectEntity> getSubjectsBySyllabusId(long id) {
		
		List<SubjectEntity> subjects = null ;
		Session session = null ;
		Transaction transaction = null ;
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("from SubjectEntity where syllabusId = " + id ) ;
			subjects = query.list() ;
			transaction.commit();
		} catch ( Exception e) {
			System.out.println("*** ERROR *** while getting SubjectEntity for Syllabus Id : " + id) ;
		}
		return subjects ;
		
	}

}
