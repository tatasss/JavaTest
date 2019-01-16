package dao;

import java.util.List;

import org.hibernate.SessionFactory;

import metier.Auteur;


public class AuteurDAO implements IAuteurDAO{
	private SessionFactory sessionFactory;
	@Override
	public void store(Auteur a) {
		this.sessionFactory.getCurrentSession().save(a);
		
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void delete(Auteur a) {
		this.sessionFactory.getCurrentSession().delete(a);
		
	}

	@Override
	public Auteur findById(Integer id) {

		return ((Auteur) this.sessionFactory.getCurrentSession().get(Auteur.class, 1));
	}

	@Override
	public List<Auteur> findAll() {
		return this.sessionFactory.getCurrentSession().createQuery("from Auteur").list();
	}

}
