package DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import metier.Client;
@Repository
public class ClientDAOImpl implements ClientDAO{
	private SessionFactory sessionFactory;
	/*public ClientDAOImpl() {
		Configuration conf= new AnnotationConfiguration().configure("config/Hibernate.cfg.xml");
    	
		this.sessionFactory =conf.buildSessionFactory();
	}*/
	
	@Override
	public void store(Client c) {
			this.sessionFactory.getCurrentSession().save(c);
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void delete(Client c) {
	
			this.sessionFactory.getCurrentSession().delete(c);

	}

	@Override
	public Client findById(Integer id) {

			return ((Client) this.sessionFactory.getCurrentSession().get(Client.class, 1));
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Client> findAll() {
		
		return this.sessionFactory.getCurrentSession().createQuery("from Client").list();
		
	}

}
