package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.RevueDAO;
import metier.Revue;

public class RevueService implements IRevueService{
	private RevueDAO revueDAO;
	
	public RevueDAO getRevueDAO() {
		return revueDAO;
	}

	public void setRevueDAO(RevueDAO revueDAO) {
		this.revueDAO = revueDAO;
	}
	@Transactional
	@Override
	public void store(Revue b) {
		this.revueDAO.store(b);
		
	}
	@Transactional
	@Override
	public void delete(Revue b) {
		this.revueDAO.delete(b);
	}
	@Transactional
	@Override
	public Revue findById(Integer id) {
		return this.revueDAO.findById(id);
	}
	@Transactional
	@Override
	public List<Revue> findAll() {
		return this.revueDAO.findAll();
	}

}
