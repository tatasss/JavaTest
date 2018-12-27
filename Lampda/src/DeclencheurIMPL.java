public class DeclencheurIMPL implements Declencheur {
    @Override
    public void declenche(String msg) {
        System.out.println("message : "+msg);
    }
}
