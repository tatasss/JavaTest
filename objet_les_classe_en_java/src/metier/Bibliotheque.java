package metier;

import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheque implements Serializable {
    private List<Document> mesDocument= new ArrayList<>();
    private FabriqueDocuement fb =new FabriqueDocuement();
    public String getNom() {
        return nom;
    }

    public List<Document> getMesDocument() {
        return mesDocument;
    }

    private final String nom;

    public Bibliotheque(String titre) {
        this.nom=titre;
    }

    public int getCompteur(){
        return Document.getCompteur();
    }
    public void ajouterUnDocument(String titre,int nbPage,Auteur auteur){
        mesDocument.add(fb.createDocuement(titre,nbPage,auteur));
    }
    public void ajouterUnDocument(String titre,int nbPage,Frequence frequence){
        mesDocument.add(fb.createDocuement(titre,nbPage,frequence));
    }
    public void afficherLesDocument(){
        for (int i=0; i<this.mesDocument.size();i++)
            System.out.println(mesDocument.get(i).toString());
    }
}
