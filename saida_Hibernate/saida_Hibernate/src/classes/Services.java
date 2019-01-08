package classes;

import java.util.List;

import org.hibernate.Session;
import util.HibernateUtil;

public class Services {


	
	public void addCategorie(Categorie c){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}
	

	
	public Categorie getCategorie(Long idC){
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Categorie c = (Categorie) session.load(Categorie.class, idC);
		return c;
	}

	public List<Categorie> getAllCategories(){
		Session session =  HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Categorie").list();
	}
	
	
	
	
}
