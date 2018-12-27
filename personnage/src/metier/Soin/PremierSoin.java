package metier.Soin;

public class PremierSoin implements Soin {
    @Override
    public void soigne() {
        System.out.println("Je suis en train d'infliger les premier Soin");
    }
}
