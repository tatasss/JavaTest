public class Triple <T> {
    T premier;
    T second;
    T troisieme;

    public Triple(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public T getPremier() {
        return premier;
    }

    public T getSecond() {
        return second;
    }

    public T getTroisieme() {
        return troisieme;
    }

    public void affiche(){
        System.out.println(this.premier + "\n"+ this.second+"\n"+ this.troisieme+"\n======================");
    }
}
