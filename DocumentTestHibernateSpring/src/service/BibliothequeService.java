package service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import dao.BibliothequeDAO;
import metier.Bibliotheque;
import metier.Document;

public class BibliothequeService implements IBibliothequeService{
	private BibliothequeDAO bibliothequeDAO;
	
	public BibliothequeDAO getBibliothequeDAO() {
		//System.out.println("BibliothequeService : getBibliothequeDAO");
		return bibliothequeDAO;
	}

	public void setBibliothequeDAO(BibliothequeDAO BibliothequeDAO) {
		System.out.println("BibliothequeService : setBibliothequeDAO");
		this.bibliothequeDAO = BibliothequeDAO;
	}
	@Transactional
	@Override
	public void store(Bibliotheque b) {
		System.out.println(bibliothequeDAO);
		this.bibliothequeDAO.store(b);
		
	}
	@Transactional
	@Override
	public void delete(Bibliotheque b) {
		this.bibliothequeDAO.delete(b);
	}
	@Transactional
	@Override
	public Bibliotheque findById(Integer id) {
		return this.bibliothequeDAO.findById(id);
	}
	@Transactional
	@Override
	public List<Bibliotheque> findAll() {
		return this.bibliothequeDAO.findAll();
	}

	@Override
	public List<Document> getAllDoc(Integer id) {
		return this.bibliothequeDAO.getAllDoc(id);
	}

}
