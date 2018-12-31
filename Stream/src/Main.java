import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        List<String> nom = new ArrayList<>();
        nom.add("fabien");
        nom.add("xavier");
        nom.add("Dimitri");
        nom.stream()
                .filter(s->s.startsWith("x"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
        IntStream.range(1,10).forEach(System.out::println);
        //String[] mo= (String[]) Stream.of("une","liste","trop","genial").toArray();
        ArrayList<Personne> mp= new ArrayList<>();
        mp.add(new Personne(34));
        mp.add( new Personne(67));
        mp.add(new Personne(4));
        Stream<Personne> s=mp.stream();
        s.sorted((p1,p2)->{ return p1.compareA(p2);})
                .forEach(System.out::println);

        List<EPersonne> mo = new ArrayList<>();
        mo.add(new EPersonne(47,"fabien"));
        mo.add(new EPersonne(34,"xavier"));
        mo.add(new EPersonne(23,"dimitri"));
        List<Personne> filtre = mo.stream().filter(p-> p.getAge()>30).collect(Collectors.toList());
        double ageAVG= mo.stream().collect(Collectors.averagingInt(p->p.getAge()));
        filtre.stream().forEach(System.out::println);
        System.out.println("Age moyenr : "+ageAVG);
        Integer agetotal = mo.stream().reduce(0,(somme,p)-> somme+=p.getAge(), (s1,s2)->s1+s2);
        System.out.println("somme age " + agetotal);
        mo.parallelStream()
                .forEach(( n ->System.out.println(n+" :"+ Thread.currentThread().getName())));
        ArrayList<String> a = new ArrayList<String>();
        a.add("matthias");
        a.add("saida");
        a.add("joisian");
        a.add("fabien");
        a.add("Christian");
        a.add("margaux");
        a.add("elisa");
        a.add("ludivine");
        a.add("clair");
        a.add("silvie");
        a.add("christelle");
        a.add("mouna");
        a.add("julien");
        a.add("Gwenne");
        a.add("melanie");
        a.add("brice");
        a.add("romainric");
        a.add("alexandra");
        a.add("alexandre");
        a.add("eva");
        a.add("michel");
        a.add("quentin");

        ForkJoinPool pool =ForkJoinPool.commonPool();
        System.out.println(pool.getParallelism());
        a.parallelStream().
                forEach(n -> System.out.println(n + " : "+ Thread.currentThread().getName()));
    }

}
