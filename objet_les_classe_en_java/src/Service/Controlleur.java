package Service;

import metier.Auteur;
import metier.Bibliotheque;
import metier.Document;
import metier.Frequence;

import java.io.*;

public class Controlleur {

    public static Bibliotheque charge(File monFichier, Bibliotheque bib) {
        try(ObjectInputStream oos= new ObjectInputStream(new FileInputStream(monFichier))){
            bib=(Bibliotheque) oos.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return bib;
    }

    public static void sauve(File monFichier, Bibliotheque bib) {
        try(PrintWriter pw= new PrintWriter(new FileWriter(monFichier))){
            pw.println(bib.getNom());
            pw.println(bib.getCompteur());
            for(Document d : bib.getMesDocument()){
                pw.println(d);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void sauveBin(File monFichier, Bibliotheque bib) {
        try(ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(monFichier))){
            oos.writeObject(bib);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
