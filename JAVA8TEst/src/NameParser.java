public class NameParser <T> {
    public T parse (String caractere, Creator<T> creator){
        String[] tab = caractere.split(" ");
        String nom = tab[0];
        String prenom = tab[1];
        return (T) ((Creator) (firstName, LastName) -> new Name(nom, prenom)).create(nom,prenom);
    }
}
