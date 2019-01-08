package testHibernate;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
//import org.hibernate.boot.registry.*;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	static {
		try {
			Configuration conf = new Configuration();
			conf.configure();
			ServiceRegistry serviceReg = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build());
			sessionFactory = conf.buildSessionFactory();
		}catch(Throwable ex) {
			System.err.println();
		}
	}
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}
	
}
