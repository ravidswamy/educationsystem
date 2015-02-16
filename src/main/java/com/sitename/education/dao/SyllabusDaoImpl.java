package com.sitename.education.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sitename.education.entity.CourseEntity;
import com.sitename.education.entity.SyllabusEntity;

@Repository
public class SyllabusDaoImpl implements SyllabusDao {

	@Autowired
	private SessionFactory sessionFactory ;
	
	public List<SyllabusEntity> getAllSyllabus() {
		
		List<SyllabusEntity> listOfSyllabus = null ;
		
		System.out.println("Made it in SyllabusDaoImpl") ;
		Session session = null ;
		Transaction transaction = null ;
		
		try {
			System.out.println("In try") ;
			session = sessionFactory.openSession() ;
			System.out.println("created session") ;
			transaction = session.beginTransaction() ;
			System.out.println("begun transaction") ;
			
			listOfSyllabus = session.createQuery("from SyllabusEntity").list() ;
			System.out.println("query compeleted") ;
			transaction.commit(); 
			System.out.println("Commit done") ;
		} catch (Exception  e) {
			System.out.println("*** ERROR *** while getting list of Syllabus") ;
			if ( transaction != null ) {
				System.out.println("Transaction is being rolled back") ;
				transaction.rollback();
			}
		} finally {
			System.out.println("Closing session") ;
			session.close() ;
		}
		return listOfSyllabus ;
	}
	
	public SyllabusEntity getSyllabusById( long id ) {
		
		SyllabusEntity syllabusEntity = null ;
		Session session = null ;
		Transaction transaction = null ;
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("from SyllabusEntity where id = " + id ) ;
			syllabusEntity = ( SyllabusEntity ) query.uniqueResult() ;
			transaction.commit();
		} catch ( Exception e) {
			System.out.println("*** ERROR *** while getting SyllabusEntity for id : " + id) ;
		}
		return syllabusEntity ;
	}

	public List<SyllabusEntity> getSyllabusByCourseId(long id) {

		List<SyllabusEntity> listOfSyllabus = null ;
		Session session = null ;
		Transaction transaction = null ;
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("from SyllabusEntity where courseId = " + id ) ;
			listOfSyllabus = query.list() ;
			transaction.commit();
		} catch ( Exception e) {
			System.out.println("*** ERROR *** while getting list of syllabus for course id : " + id) ;
		}
		return listOfSyllabus ;
	}	

}
