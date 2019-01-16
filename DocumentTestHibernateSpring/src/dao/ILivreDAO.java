package dao;

import java.util.List;

import metier.Livre;

public interface ILivreDAO {
	void store (Livre b);
	void delete(Livre b);
	Livre findById(Integer id);
	List<Livre> findAll();
}
