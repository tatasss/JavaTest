package traitement;

//import metier.Personnage.*;
import metier.autre.AgeException;
import metier.autre.Personnage;

public class Main {
    public static void main(String[] argc){
       /* Personnage[] PeroTab= {new Civil(),new Chirurgien(),new Guerrier(),new Medecin(),new Sniper()};
        for (int o=0;o<PeroTab.length;o++){
            System.out.println("============= "+ PeroTab[o].getClass().getName() + " ==================");
            PeroTab[o].combat();
            PeroTab[o].deplacer();
            PeroTab[o].soigne();
        }*/
        try {
            Personnage monPerso= new Personnage("quentin","rouvet",-1);
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }
}
