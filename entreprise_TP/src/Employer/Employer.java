package Employer;

public class Employer {
    private String nom;
    private int numeroBureau;
    private float salaireAnnuel;
    private static int nbEmployer=0;

    public static int getNbEmployer() {
        return nbEmployer;
    }

    public Employer(String nom, int numeroBureau, float salaireAnnuel) {
        this.nom = nom;
        this.numeroBureau = numeroBureau;
        this.salaireAnnuel = salaireAnnuel;
        nbEmployer++;
    }
    public final String maMethode(){
        return "cool, c'est trop bien";
    }
    public String getNom() {
        return nom;
    }

    public int getNumeroBureau() {
        return numeroBureau;
    }

    public float getSalaireAnnuel() {
        return salaireAnnuel;
    }
    @Override
    public String toString(){
        return this.getNom()+ " numéro bureau :"+ getNumeroBureau()+ " salaire: " + this.getSalaireAnnuel();
    }
}
