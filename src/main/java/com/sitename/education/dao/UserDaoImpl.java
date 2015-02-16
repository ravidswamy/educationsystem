package com.sitename.education.dao;

import java.util.List;

import net.viralpatel.contact.form.Contact;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sitename.education.entity.UserEntity;

@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory ;

	public void save(UserEntity userEntity) {
		
		Session session = null ;
		Transaction transaction = null ;
		
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			session.save(userEntity) ;
			transaction.commit();
		} catch ( Exception e ) {
			System.out.println("*** ERROR *** while saving userEntity \n" + e.toString()) ;
			if ( transaction != null ) {
				System.out.println("*** ERROR *** Transaction rolled back )" + e.toString()) ;
				transaction.rollback(); 
			}
		} finally {
			session.close() ;
		}
	}

	
	public void update(UserEntity userEntity) {
		sessionFactory.getCurrentSession().update(userEntity) ;
	}

	public void delete(long id) {
		UserEntity userEntity = ( UserEntity) sessionFactory.getCurrentSession().load(UserEntity.class, id) ;
		if ( userEntity != null ) {
			sessionFactory.getCurrentSession().delete(userEntity );
		}
		
	}

	public UserEntity findById(long id) {
		Session session = null ;
		Transaction transaction = null ;
		UserEntity userEntity = null ;
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("FROM UserEntity where id='" + id + "'" ) ;
			userEntity = ( UserEntity ) query.uniqueResult() ;
			transaction.commit();
		} catch ( Exception e ) {
			System.out.println("Error while finding User by user id  :" + e.toString()) ;
		} finally {
			session.close() ;
		}
		return userEntity;
	}

	public UserEntity findByUserId(String userId) {
		
		Session session = null ;
		Transaction transaction = null ;
		UserEntity userEntity = null ;
		try {
			session = sessionFactory.openSession() ;
			transaction = session.beginTransaction() ;
			Query query = session.createQuery("FROM UserEntity where userId='" + userId + "'" ) ;
			userEntity = ( UserEntity ) query.uniqueResult() ;
			transaction.commit();
		} catch ( Exception e ) {
			System.out.println("Error while finding User by user id  :" + e.toString()) ;
		} finally {
			session.close() ;
		}
		
		// TODO Auto-generated method stub
		return userEntity;
	}


}
