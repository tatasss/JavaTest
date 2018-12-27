package metier;

import java.io.Serializable;

public class Auteur implements Serializable {
    private String nom;

    public Auteur(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
