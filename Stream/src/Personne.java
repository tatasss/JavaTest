public class Personne {
    private int age;

    public Personne(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public int compareA(Personne p){
        return age-p.getAge();
    }

    @Override
    public String toString() {
        return "age=" + age;
    }
}
