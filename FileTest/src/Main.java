import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main (String[] args) throws IOException {
        System.out.println("==============monFichier=========================");
        File monFichier=new File("toto.txt");
        if(monFichier.exists()){
            System.out.println("le fichier existe");
        }
        else{
            System.out.println("on creer le fichier");
            try {
                boolean b = monFichier.createNewFile();
                if(b) System.out.println("le fishier est créé");
                else System.out.println("le fichier ne peut pas être créé");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("==============monRep=========================");
        File monRep= new File(".");
        File[] lesFichiers = monRep.listFiles();
        for (File f : lesFichiers){
            System.out.println(f);
            System.out.println(f.getAbsolutePath());
        }
        Path dir = monRep.toPath();
        WatchService w = FileSystems.getDefault().newWatchService();
        WatchKey wc = dir.register(w,StandardWatchEventKinds.ENTRY_CREATE);
        WatchKey wk=null;
        try {
            System.out.println("je suis en attente");
            wk=w.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("J'ai finis l'observable");
    }
}
