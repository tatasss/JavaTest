public class NameParser <T> {
    public T parse (String caractere, Creator<T> creator){
        String[] tab = caractere.split(" ");
        String nom = tab[0];
        String prenom = tab[1];
        return creator.create(nom,prenom);
    }
}
