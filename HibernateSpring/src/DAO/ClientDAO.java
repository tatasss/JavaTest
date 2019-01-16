package DAO;

import java.util.List;

import metier.Client;

public interface ClientDAO {
	void store (Client c);
	void delete(Client c);
	Client findById(Integer id);
	List<Client> findAll();
}