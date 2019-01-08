package main;

import java.util.List;

import org.hibernate.*;

import Service.HibernateUtil;
import Service.Service;
import metier.Adresse;
import metier.Client;
import metier.Facture;

public class Principale {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Facture f1 = new Facture();
		Client monClient = new Client("garen");
		Adresse adr1 = new Adresse();
		f1.setTotalTTC(666.666);
		adr1.setVille("demacia");
		adr1.setCodePostal("demacia");
		adr1.setLigne1("Demacia");
		adr1.setLigne2("Demacia");
		adr1.setLigne3("Demacia");
		adr1.setComplementcedex("demacia");
		monClient.setAdresse(adr1);
		monClient.addFacture(f1);
		
		Service s = new Service();
		
		s.ajouterAdresse(adr1);
		s.ajouterClient(monClient);
		s.ajouterFacture(f1);
		List<Client> listClient= s.getAllClient();
		listClient.forEach((cl)->{ System.out.println(cl);});
		
	}
}
