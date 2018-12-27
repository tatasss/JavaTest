import java.util.Arrays;

public class Main {
    public static void main(String[]argc){
        Personne[] per= {new Personne(15),new Personne(36),new Personne(53),new Personne(50),new Personne(17)};
        //1 creer une classe implémentant comparator
        //2 Referencer une méthode qui existe !!
        //3 utiliser les lamdas expression
        Arrays.sort(per,(p1,p2)->{return p1.getAge()-p2.getAge();});
        // p-> code
        for(Personne p : per){
            System.out.println(p.getAge());
        }
        //afficheMessage(new DeclencheurIMPL());
        afficheMessage(System.out::println);

    }

    private static void afficheMessage(Declencheur d) {
        d.declenche("SALUT LES LAMPDA BRO");
    }
}
