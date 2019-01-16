package service;

import java.util.List;

import metier.Auteur;

public interface IAuteurService {
	void store (Auteur a);
	void delete(Auteur a);
	Auteur findById(Integer id);
	List<Auteur> findAll();
}
