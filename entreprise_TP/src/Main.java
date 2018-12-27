import Employer.Employer;
import Employer.Cadre;

import java.util.Scanner;

public class Main {
    public static void main(String[] argc){
        Entreprise mon= new Entreprise();
        mon.ajoutEmployer(new Employer("Pascal",1, (float) 25000.00));
        mon.ajoutEmployer(new Employer("brigitte",2, (float) 25500.00));
        mon.ajoutEmployer(new Employer("Gasper",3, (float) 28000.00));
        mon.ajoutEmployer(new Cadre("Jean-Jac",4, (float) 55000.00,"lol"));
        mon.afficherEmployer();
        mon.suppressionEmployer("Pascal");
        System.out.println("===============================================================");
        mon.afficherEmployer();
        System.out.println("===============================================================");
        Scanner sc = new Scanner(System.in);
        System.out.println("1 :Employer.Employer.Cadre,\n2:employer");
        int choixType=sc.nextInt();
        System.out.println("Donner un nom :");
        String nom= sc.next();
        System.out.println("Donner un numéro de bureau :");
        int numBur= sc.nextInt();
        System.out.println("Donner un salaire annuel :");
        float salaire= Float.parseFloat(sc.next());
        switch (choixType){
            case 2:
                mon.ajoutEmployer(new Employer(nom,numBur,salaire));
                break;
            case 1:
                System.out.println("Donner une fonctionnalité de cadre :");
                String fonc = sc.next();
                mon.ajoutEmployer(new Cadre(nom,numBur,salaire,fonc));
                break;
        }
        mon.afficherEmployer();
        System.out.println(Employer.getNbEmployer());
        mon.afficherNbEmployer();
        // final : si je veut déclarer une méthode mais sans la redéfinition, on ne peut pas redéfinir une méthode finale dans les classe fille
    }
}
