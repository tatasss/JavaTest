package metier.autre;

public class Personnage {
    private  String nom;
    private String prenom;
    private int age;

    public Personnage(String nom, String prenom, int age) throws AgeException {
        this.nom = nom;
        this.prenom = prenom;
        if(age>0) {
            this.age = age;
        }
        else {
            throw new AgeException();
        }

    }
}
