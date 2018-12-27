package metier;

public class Revue extends Document {
    private Frequence frequence;
    public Revue(String titre, int nbPage, Frequence frequence) {
        super(titre, nbPage);
        this.frequence=frequence;
    }

    public Frequence getFrequence() {
        return frequence;
    }

    public void setFrequence(Frequence frequence) {
        this.frequence = frequence;
    }
    @Override
    public String toString(){
        return "===TYPE:REVUE===\ntitre: "+ this.getTitre()+"\nnombre de page: "+this.getNbPage() + "\nFrequence: "+this.frequence;
    }
}
