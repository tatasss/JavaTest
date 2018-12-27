public class Main {
    public static void main(String[] argc){
        NameParser mo= new NameParser();
        Name na= (Name) mo.parse("luidgi mario", Factory::createName);
        System.out.println("nom : "+na.getFirstName());
        System.out.println("prenom : " +na.getLastName());

    }
}//vers une méthode statique ou instance
/*
*Classe::methode
* Objet::methode
 */
