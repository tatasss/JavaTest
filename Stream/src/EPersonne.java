public class EPersonne extends Personne {
    private String nom;
    public EPersonne(int age, String nom) {
        super(age);
        this.nom= nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "nom= " + nom + " age : "+getAge();
    }
}
