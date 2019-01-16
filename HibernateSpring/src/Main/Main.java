package Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Service.ClientService;
import Service.ClientServiceImpl;
import metier.Client;

public class Main {

	private static ApplicationContext contexte;
	public static void main(String[] args) {
		contexte = new ClassPathXmlApplicationContext("config/maconfig.xml");
		ClientService service = (ClientService) contexte.getBean(ClientServiceImpl.class);
		Client c= new Client("Rasori");
		System.out.println("service : "+ service+"\nclient : "+c);
		service.store(c);
		Client retour= service.findById(1);
		System.out.println(retour);
		
		
		Client c2= new Client("Rasmocket");
		service.store(c2);
		
		List<Client> lesC = service.findAll();
		lesC.forEach((e)->{System.out.println(e);});

	}

}
