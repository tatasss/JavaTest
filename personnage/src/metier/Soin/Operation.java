package metier.Soin;

public class Operation implements Soin {
    @Override
    public void soigne() {
        System.out.println("Je suis en train de faire une opération");
    }
}
