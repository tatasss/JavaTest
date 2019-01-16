package dao;

import java.util.List;


import metier.Revue;

public interface IRevueDAO {
	void store (Revue b);
	void delete(Revue b);
	Revue findById(Integer id);
	List<Revue> findAll();
}
