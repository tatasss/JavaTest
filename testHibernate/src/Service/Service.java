package Service;

import java.util.List;

import org.hibernate.Session;

import metier.Adresse;
import metier.Client;
import metier.Facture;

public class Service {
	public void ajouterClient(Client c) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();
	}
	public void ajouterAdresse(Adresse a) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
	}
	public void ajouterFacture(Facture f) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(f);
		session.getTransaction().commit();
	}
	public List<Client> getAllClient(){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Client").list();
	}
}