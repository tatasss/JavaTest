package metier.Personnage;

import metier.Combat.CombatPistolet;

public class Sniper extends Personnage {

    @Override
    public void combat() {
        System.out.println("je combat");
    }

    @Override
    public void deplacer() {
        System.out.println("impossible");
    }

    @Override
    public void soigne() {
        System.out.println("impossible");
    }
}
