package Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import DAO.ClientDAO;
import metier.Client;

@Service
public class ClientServiceImpl implements ClientService{
	
	
	private ClientDAO clientDAO;
	@Transactional
	@Override
	public void store(Client c) {
		System.out.println("clientDAO : "+ clientDAO);
		clientDAO.store(c);
	}

	

	public ClientDAO getClientDAO() {
		return clientDAO;
	}



	public void setClientDAO(ClientDAO clientDAO) {
		this.clientDAO = clientDAO;
	}


	@Transactional
	@Override
	public void delete(Client c) {
		this.clientDAO.delete(c);
	}
	@Transactional(readOnly=true)
	@Override
	public Client findById(Integer id) {
		return this.clientDAO.findById(id);
	}
	@Transactional(readOnly=true)
	@Override
	public List<Client> findAll() {
		return this.clientDAO.findAll();
	}
}
