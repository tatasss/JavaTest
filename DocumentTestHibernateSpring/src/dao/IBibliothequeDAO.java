package dao;

import java.util.List;

import metier.Bibliotheque;
import metier.Document;

public interface IBibliothequeDAO {
	void store (Bibliotheque b);
	void delete(Bibliotheque b);
	Bibliotheque findById(Integer id);
	List<Bibliotheque> findAll();
	List<Document> getAllDoc(Integer id);
	
}