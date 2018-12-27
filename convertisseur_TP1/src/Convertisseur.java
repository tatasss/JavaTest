

import java.util.Scanner;

public class Convertisseur {
    public static void main(String[] argc){
        String continuer;
        int choixMenu;
        float temperature;
        float resultat;
        Scanner sc= new Scanner(System.in);

        String tab[][] = {{"toto", "titi", "tutu"}, {"tata", "tete", "tyty"}};

        for(String str[] : tab)
        {
            for(String str2 : str)
            {
                System.out.println("La valeur est  = " + str2);
            }

        }
        do
        {
            System.out.println("choisissez un mode de convertion: \n1: Convertisseur Celcus-farenheit\n2: convertisseur farenheit-Celcus ");
            choixMenu= sc.nextInt();

            switch (choixMenu) {
                case 1:
                    System.out.println("Température à convertir");
                    temperature=sc.nextFloat();
                    resultat=(((float)(9/5.0))*temperature)+32;
                    System.out.println(temperature+ " %C correspond à "+resultat+ "F");

                    break;
                case 2:
                    System.out.println("Température à convertir");
                    temperature=sc.nextFloat();
                    resultat= (float) (((temperature-32)*5)/9.0);
                    System.out.println(temperature + "F correspond à "+ resultat+ "%C");
                    break;
                default:
                    System.out.println ("mauvais choix");

            }
            System.out.println("voulez vous continuer ? (O/N)");
            continuer= sc.next();
        }
        while (!continuer.equals( "N"));
    }
}
