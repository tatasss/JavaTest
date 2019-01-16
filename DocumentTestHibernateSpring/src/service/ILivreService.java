package service;

import java.util.List;

import metier.Livre;

public interface ILivreService {
	void store (Livre b);
	void delete(Livre b);
	Livre findById(Integer id);
	List<Livre> findAll();
}
