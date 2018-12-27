package metier.autre;

public class AgeException extends Exception {
    public AgeException() {
        System.err.println("age doit être positif");
    }
}
