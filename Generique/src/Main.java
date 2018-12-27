import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main (String[] argc) throws ParseException {
       /* Triple<String> test= new Triple<>("bonjour", "Good Morning","Guten tag");
        test.affiche();
        Scanner sc = new Scanner(System.in);
       int menu;
       Ensemble<Float> ens= new Ensemble<>();
       do{
        System.out.println("====menu===\n1:Ajoutez un élément\n2:Enlever un élément\n3:Arreter");
        menu=sc.nextInt();
        switch (menu){
            case 1:
                System.out.println("ajouter un reel");
                ens.ajoute(Float.parseFloat(sc.next()));
                break;
            case 2:
                System.out.println("enlever un reel");
                ens.enleve(Float.parseFloat(sc.next()));
                break;
        }
        System.out.println(ens);
       }while(menu>=1 && menu<3);
       System.gc();*/

       Date d;
       Calendar c = Calendar.getInstance();
       d= c.getTime();
       System.out.println(d);
       if(c.get(Calendar.MONTH)== Calendar.JANUARY){
           System.out.println("c'est le sky");
       }
       c.add(Calendar.MONTH,2);
        d= c.getTime();
        System.out.println(d);
        DateFormat df = DateFormat.getDateInstance();
        String str=df.format(d);
        System.out.println(str);
        SimpleDateFormat sdf = new SimpleDateFormat("dd--MM--yyyy");
        str=sdf.format(d);
        System.out.println(str);
        Date i= sdf.parse("12--08--2039");
        System.out.println(i);
    }
}
