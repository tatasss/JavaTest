package service;

import java.util.List;

import metier.Revue;

public interface IRevueService {
	void store (Revue b);
	void delete(Revue b);
	Revue findById(Integer id);
	List<Revue> findAll();
}
