import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        List<String> nom = new ArrayList<>();
        nom.add("fabien");
        nom.add("xavier");
        nom.add("Dimitri");
        nom.stream()
                .filter(s->s.startsWith("X"))
                .map(String::toUpperCase)
                .sorted().
                forEach(System.out::println);
        IntStream.range(1,10).forEach(System.out::println);
        String[] mo= (String[]) Stream.of("une","liste","trop","genial").toArray();

        Stream<Personne> s=Stream.of(new Personne(34), new Personne(67),new Personne(4))
                .sorted((p1,p2)->{ return p1.compareA(p2);})
                .forEach(System.out::println);

    }
}
