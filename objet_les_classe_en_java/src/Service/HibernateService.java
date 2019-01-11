package Service;

import org.hibernate.Session;


import metier.Auteur;
import metier.Bibliotheque;
import metier.Document;
import metier.Livre;
import metier.Revue;
import java.util.List;


public class HibernateService {
	public void ajouterLivre(Livre l) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(l);
		session.getTransaction().commit();
	}
	public void ajouterRevue(Revue r) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(r);
		session.getTransaction().commit();
	}
	public void ajouterAuteur(Auteur A) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(A);
		session.getTransaction().commit();
	}
	public void ajouterBibliotheque(Bibliotheque b) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(b);
		session.getTransaction().commit();
	}
	public Bibliotheque chargerBib() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Bibliotheque> maBib= session.createQuery("from Bibliotheque").list();
		if(maBib.isEmpty()) {
			return new Bibliotheque("bib");
		}
			return maBib.get(0);
	}
	public List<Document> chargerDoc(Bibliotheque bib) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Document> maBib= session.createQuery("from Document where bibId = "+ bib.getId()).list();
		return maBib;
	}
	
}
