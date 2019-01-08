package testHibernate;

import javax.transaction.Transaction;

import org.hibernate.*;

public class Principale {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null ;
		try {
			Client monClient=new Client();
			tx = session.beginTransaction();
			session.save(monClient);
			tx.commit();
		}
		catch(Exception ex) {
			tx.rollback();
			throw ex;
		}
		finally {
			session.close();
		}

	}

}
