package dao;

import java.util.List;

import org.hibernate.SessionFactory;


import metier.Revue;

public class RevueDAO implements IRevueDAO{
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void store(Revue b) {
		this.sessionFactory.getCurrentSession().save(b);
		
	}

	@Override
	public void delete(Revue b) {
		this.sessionFactory.getCurrentSession().delete(b);
		
	}

	@Override
	public Revue findById(Integer id) {
		return ((Revue) this.sessionFactory.getCurrentSession().get(Revue.class, 1));
	}

	@Override
	public List<Revue> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Revue").list();
	}

}
