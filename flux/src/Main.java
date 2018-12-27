import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] argc){
        try {
            FileWriter fw =new FileWriter("toto.txt");
            fw.write("a\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            PrintWriter pw = new PrintWriter("toto.txt");
            pw.println(3.0);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
