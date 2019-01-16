package dao;

import java.util.List;

import org.hibernate.SessionFactory;


import metier.Bibliotheque;
import metier.Document;

public class BibliothequeDAO implements IBibliothequeDAO{
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void store(Bibliotheque b) {
		this.sessionFactory.getCurrentSession().save(b);
		
	}

	@Override
	public void delete(Bibliotheque b) {
		this.sessionFactory.getCurrentSession().delete(b);
		
	}

	@Override
	public Bibliotheque findById(Integer id) {
		Bibliotheque b= ((Bibliotheque) this.sessionFactory.getCurrentSession().get(Bibliotheque.class, 1));
		List<Document> s= this.sessionFactory.getCurrentSession().createQuery("from Document where BibId = "+id).list();
		b.setMesDocument(s);
		return b;
	}

	@Override
	public List<Bibliotheque> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Bibliotheque").list();
	}
	@Override
	public List<Document> getAllDoc(Integer id){
		return this.sessionFactory.getCurrentSession().createQuery("from Document where BibId = "+id).list();
	}
} 
