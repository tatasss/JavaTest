package metier;

public class Livre extends  Document {
    private Auteur auteur;
    public Livre(String titre, int nbPage, Auteur auteur) {
        super(titre, nbPage);
        this.auteur = auteur;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }
    @Override
    public String toString(){
        return "TYPE : LIVRRE : "+getTitre();
    }

}
