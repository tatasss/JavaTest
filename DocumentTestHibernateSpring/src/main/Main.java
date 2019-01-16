package main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.Auteur;
import metier.Bibliotheque;
import metier.Frequence;
import service.AuteurService;
import service.BibliothequeService;
import service.IAuteurService;
import service.IBibliothequeService;

public class Main {
	private static ApplicationContext contexte;
	public static void main(String[] args) {
		contexte = new ClassPathXmlApplicationContext("config/maconfig.xml");
		Bibliotheque mabib=null;
		Auteur a = new Auteur("Sherlok Holmes");
		
		
		IAuteurService as = contexte.getBean(AuteurService.class);
		IBibliothequeService Ibib = contexte.getBean(BibliothequeService.class);
		System.out.println ("nombre bibliotheque : "+ Ibib.findAll().size());
		if(Ibib.findAll().size()>0) {
			mabib=Ibib.findById(1);
			System.out.println("Condition Creation : ma bibliotheque : "+ mabib);
		}
		else {
			mabib=(Bibliotheque) contexte.getBean("bib");
			Ibib.store(mabib);
			System.out.println("Condition Creation non respect : ma bibliotheque : "+ mabib);
			
		}
		
		as.store(a);
		int menu;
        String titre;
        int nbPage;
        String nomAu;
        Double test;
        Scanner sc = new Scanner(System.in);
        Scanner line = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("========="+mabib.getNom()+"\n1:ajouter un livre");
            System.out.println("2:ajouter une Revue");
            System.out.println("3:Afficher la bibliothèque");
            
            
            menu=sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Donner un titre : ");
                    titre=line.next();
                    System.out.println("Donner le nombre de page");
                    nbPage=Integer.parseInt(sc.next());
                    System.out.println("Donner le nom de l'auteur");
                    nomAu = line.next();
                    a=new Auteur(nomAu);
                    as.store(a);
                    mabib.ajouterUnDocument(titre,nbPage,a);
                    break;
                case 2:
                    System.out.println("Donner un titre : ");
                    titre=line.next();
                    System.out.println("Donner le nombre de page");
                    nbPage=Integer.parseInt(sc.next());
                    System.out.println("Donner une frequence");
                    nomAu = sc.next();
                    mabib.ajouterUnDocument(titre,nbPage, Frequence.valueOf(nomAu.toUpperCase()));
                    break;
                case 3:
                    mabib.afficherLesDocument();
                    break;
            }
        }while (menu>0 &&menu<=3);
        
		/*mabib.ajouterUnDocument("le crime de la lune", 1587, a);
		mabib.ajouterUnDocument("science est vie junior", 100, Frequence.MENSUEL);*/
		
	}

}
