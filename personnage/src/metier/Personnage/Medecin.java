package metier.Personnage;

import metier.Soin.PremierSoin;

public class Medecin extends Personnage {

    @Override
    public void combat() {
        System.out.println("impossible");
    }

    @Override
    public void deplacer() {
        System.out.println("impossible");
    }

    @Override
    public void soigne() {
        System.out.println("je soigne les bléssé");
    }
}
