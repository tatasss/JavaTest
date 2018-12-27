package metier.Personnage;

import metier.Combat.CombatCouteau;

public class Guerrier extends Personnage {

    @Override
    public void combat() {
        System.out.println("Je combat");
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
