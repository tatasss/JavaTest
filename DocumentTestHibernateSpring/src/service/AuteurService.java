package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.AuteurDAO;
import metier.Auteur;

public class AuteurService implements IAuteurService{
	private AuteurDAO AuteurDao;
	
	public AuteurDAO getAuteurDAO() {
		return AuteurDao;
	}

	public void setAuteurDAO(AuteurDAO AuteurDao) {
		System.out.println("AuteurService : setAuteurDAO");
		this.AuteurDao = AuteurDao;
	}
	@Transactional
	@Override
	public void store(Auteur a) {
		this.AuteurDao.store(a);
		
	}
	@Transactional
	@Override
	public void delete(Auteur a) {
		this.AuteurDao.delete(a);
		
	}
	@Transactional
	@Override
	public Auteur findById(Integer id) {
		
		return this.AuteurDao.findById(id);
	}
	@Transactional
	@Override
	public List<Auteur> findAll() {
		return this.AuteurDao.findAll();
	}

}
