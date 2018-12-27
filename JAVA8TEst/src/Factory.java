public class Factory {
    public static Name createName(String nom,String prenom){
        return new Name(nom,prenom);
    }
}
