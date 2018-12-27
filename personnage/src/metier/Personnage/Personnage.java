package metier.Personnage;

import metier.Combat.EspritCombatif;
import metier.Deplacement.Deplacement;
import metier.Soin.Soin;

public abstract class Personnage implements EspritCombatif,Deplacement,Soin{
    private EspritCombatif combat;
    private Deplacement deplacement;
    private Soin soin;

    @Override
    public void combat() {
        combat.combat();
    }

    @Override
    public void deplacer() {
        deplacement.deplacer();
    }

    @Override
    public void soigne() {
        soin.soigne();
    }
}
