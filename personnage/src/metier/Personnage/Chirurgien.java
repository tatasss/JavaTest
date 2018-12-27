package metier.Personnage;

public class Chirurgien extends Personnage {
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
        System.out.println("je soigne les blessés");
    }
}
