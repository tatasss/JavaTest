package metier.Personnage;

import metier.Deplacement.Marcher;

public class Civil extends Personnage {

    @Override
    public void combat() {
        System.out.println("impossible");
    }

    @Override
    public void deplacer() {
        System.out.println("je me deplace");
    }

    @Override
    public void soigne() {
        System.out.println("impossible");
    }
}
