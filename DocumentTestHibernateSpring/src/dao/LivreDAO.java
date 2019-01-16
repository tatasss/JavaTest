package dao;

import java.util.List;

import org.hibernate.SessionFactory;


import metier.Livre;

public class LivreDAO implements ILivreDAO{
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void store(Livre b) {
		this.sessionFactory.getCurrentSession().save(b);
		
	}

	@Override
	public void delete(Livre b) {
		this.sessionFactory.getCurrentSession().delete(b);
		
	}

	@Override
	public Livre findById(Integer id) {
		return ((Livre) this.sessionFactory.getCurrentSession().get(Livre.class, 1));
	}

	@Override
	public List<Livre> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Livre").list();
	}

}
