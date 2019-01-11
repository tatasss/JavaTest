package Service;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import HibernateEvent.InterceptuerExemple;

public class HibernateUtil {
	 public static final SessionFactory sessionFactory;

	    static {
	        try {
	        	
	            // Création de la SessionFactory à partir de hibernate.cfg.xml
	            Configuration conf= new AnnotationConfiguration().configure("config/Hibernate.cfg.xml");
	            		conf.setInterceptor(new InterceptuerExemple());
	            		sessionFactory =conf.buildSessionFactory();
	            		
	        } catch (Throwable ex) {
	            // Make sure you log the exception, as it might be swallowed
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }

	   // public static final ThreadLocal session = new ThreadLocal();

	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
}
