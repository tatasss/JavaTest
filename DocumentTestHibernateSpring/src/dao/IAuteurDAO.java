package dao;

import java.util.List;

import metier.Auteur;



public interface IAuteurDAO {
	void store (Auteur a);
	void delete(Auteur a);
	Auteur findById(Integer id);
	List<Auteur> findAll();
}
