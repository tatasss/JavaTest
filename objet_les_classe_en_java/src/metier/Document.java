package metier;

import java.io.Serializable;

public class Document implements Serializable {
    private String titre;
    private int nbPage;
    private static int compteur=0;

    public static int getCompteur() {
        return compteur;
    }

    public static void setCompteur(int compteur) {
        Document.compteur = compteur;
    }

    public Document(String titre, int nbPage) {
        this.titre = titre;
        this.nbPage = nbPage;
        compteur++;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }
    @Override
    public String toString(){
        return "titre: "+ this.titre+"\nnombre de page: "+this.nbPage;
    }
}
