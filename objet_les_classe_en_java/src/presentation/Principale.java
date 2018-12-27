package presentation;

import InterfaceGraphique.FenetrePrincipale;
import metier.Auteur;
import metier.Bibliotheque;
import Service.Controlleur;
import metier.Frequence;

import java.io.File;
import java.util.Scanner;

public class Principale {
    public static void main(String[] args){
        File monFichier =new File("bib.txt");
        File fichBin= new File("bib.bin");
        Bibliotheque bib = null;
        if (fichBin.exists()){
            bib=Controlleur.charge(fichBin,bib);
        }
        else bib=new Bibliotheque("bibVide");

        FenetrePrincipale f= new FenetrePrincipale(bib);
        f.setVisible(true);
        /*int menu;
        String titre;
        int nbPage;
        String nomAu;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        do {
            System.out.println("========="+bib.getNom()+"\n1:ajouter un livre");
            System.out.println("2:ajouter une Revue");
            System.out.println("3:Afficher la bibliothèque");
            menu=sc.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Donner un titre : ");
                    titre=sc.next();
                    System.out.println("Donner le nombre de page");
                    nbPage=Integer.parseInt(sc.next());
                    System.out.println("Donner le nom de l'auteur");
                    nomAu = sc.next();
                    bib.ajouterUnDocument(titre,nbPage,new Auteur(nomAu));
                    break;
                case 2:
                    System.out.println("Donner un titre : ");
                    titre=sc.next();
                    System.out.println("Donner le nombre de page");
                    nbPage=Integer.parseInt(sc.next());
                    System.out.println("Donner une frequence");
                    nomAu = sc.next();
                    bib.ajouterUnDocument(titre,nbPage, Frequence.valueOf(nomAu.toUpperCase()));
                    break;
                case 3:
                    bib.afficherLesDocument();
                    break;
            }
        }while (menu>0 &&menu<=3);*/
        //System.out.println(bib.getCompteur());
        Controlleur.sauve(monFichier,bib);
        Controlleur.sauveBin(fichBin,bib);
    }
}
