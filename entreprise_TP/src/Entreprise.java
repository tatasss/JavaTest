import Employer.Employer;

import java.util.ArrayList;
import java.util.List;

public class Entreprise {
     private List<Employer> ListeEmployer;

    public Entreprise() {
        ListeEmployer = new ArrayList<>();
    }

    public List<Employer> getListeEmployer() {
        return ListeEmployer;
    }

    public void setListeEmployer(List<Employer> listeEmployer) {
        ListeEmployer = listeEmployer;
    }

    public void ajoutEmployer(Employer E){
        ListeEmployer.add(E);
    }
    public void suppressionEmployer(String nom){
        for(int i=0; i<this.ListeEmployer.size();i++) {
            if (this.ListeEmployer.get(i).getNom().equals(nom)) {
                this.ListeEmployer.remove(i);
            }
        }
    }
    public void afficherEmployer(){
        for(int i=0; i<this.ListeEmployer.size();i++) {
            System.out.println(this.ListeEmployer.get(i));
        }
    }
    public void afficherNbEmployer(){
        System.out.println(this.ListeEmployer.size());
    }
}
