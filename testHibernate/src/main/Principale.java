package main;

import java.util.List;

import org.hibernate.*;

import Service.HibernateUtil;
import Service.Service;
import metier.Adresse;
import metier.Client;
import metier.Facture;
import metier.Vendeur;

public class Principale {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		
		Adresse adr1 = new Adresse();
		
		adr1.setVille("demacia");
		adr1.setCodePostal("demacia");
		adr1.setLigne1("Demacia");
		
		adr1.setComplementcedex("demacia");
		Client monClient = new Client("garen",adr1);
		Facture f1 = new Facture(666.666,monClient);
		//monClient.addFacture(f1);
		Vendeur v = new Vendeur("fabrice");
		Service s = new Service();
	
		s.ajouterAdresse(adr1);
		s.ajouterClient(monClient);
		s.ajouterFacture(f1);
		s.ajouterVendeur(v);
		List<Client> listClient= s.getAllClient();
		listClient.forEach((cl)->{ System.out.println(cl);});
		
	}
}
