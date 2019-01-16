package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.LivreDAO;
import metier.Livre;

public class LivreService implements ILivreService{
	private LivreDAO livreDAO;
	
	public LivreDAO getLivreDAO() {
		return livreDAO;
	}

	public void setLivreDAO(LivreDAO livreDAO) {
		this.livreDAO = livreDAO;
	}
	@Transactional
	@Override
	public void store(Livre b) {
		this.livreDAO.store(b);
		
	}
	@Transactional
	@Override
	public void delete(Livre b) {
		this.livreDAO.delete(b);
		
	}
	@Transactional
	@Override
	public Livre findById(Integer id) {
		return this.livreDAO.findById(id);
	}
	@Transactional
	@Override
	public List<Livre> findAll() {
		return this.livreDAO.findAll();
	}

}
