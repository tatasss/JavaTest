package Employer;

public class Cadre extends Employer {
    private String fonctionCadre;

    public Cadre(String nom, int numeroBureau, float salaireAnnuel, String fonctionCadre) {
        super(nom, numeroBureau, salaireAnnuel);
        this.fonctionCadre = fonctionCadre;
    }

    public String getFonctionCadre() {
        return fonctionCadre;
    }

    public void setFonctionCadre(String fonctionCadre) {
        this.fonctionCadre = fonctionCadre;
    }
    /*@Override
    public String  maMethode(){
        return "cool, c'est trop bien";
    }*/
}
