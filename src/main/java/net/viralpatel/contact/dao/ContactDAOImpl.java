package net.viralpatel.contact.dao;
 
import java.util.List;
 



import net.viralpatel.contact.form.Contact;
 



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
 
@Repository
public class ContactDAOImpl implements ContactDAO {
 
    @Autowired
    private SessionFactory sessionFactory;
 
    public void addContact(Contact contact) {
    	Session session = null ;
    	Transaction transaction = null ;
    	try {
    		session = sessionFactory.openSession() ;
    		transaction = session.beginTransaction() ;
    		System.out.println("first name : " + contact.getFirstname()) ;
    		session.save(contact) ;
    		transaction.commit();
    	} catch ( Exception e) {
    		System.out.println("Exception while saving \n" + e.toString()) ;
    	} finally {
   			session.close() ;
    	}
    }
 
    @SuppressWarnings("unchecked")
	public List<Contact> listContact() {
    	Session session = null ;
    	session = sessionFactory.openSession() ;
    	try {
    		session.beginTransaction() ;
    		System.out.println("in contactDaoImpl") ;
        	return session.createQuery("from Contact").list();
    	} catch ( Exception e) {
    		System.out.println("Exception during session open") ;
    		
    	} finally {
   			session.close() ;
    	}
    	
    	System.out.println("returning null ") ;
		return null;
    	
    }
 
    public void removeContact(Integer id) {
    	
    	Session session = null ;
    	Transaction transaction = null ;
    	
    	try {
	    	session = sessionFactory.openSession() ;
	    	transaction = session.beginTransaction() ;
	        Contact contact = (Contact) session.load(Contact.class, id);
	        if (null != contact) {
	        	session.delete(contact);
	        }
	        transaction.commit();
    	} catch ( Exception e) {
    		System.out.println("Error while deleting contact") ;
    	} finally {
   			session.close() ;
    	}
 
    }
}