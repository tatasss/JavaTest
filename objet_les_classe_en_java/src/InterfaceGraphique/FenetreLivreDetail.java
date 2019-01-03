package InterfaceGraphique;

import metier.Auteur;
import metier.Document;
import metier.Livre;
import metier.Revue;

import javax.swing.*;
import java.awt.*;

public class FenetreLivreDetail extends JFrame {
    public FenetreLivreDetail(Document doc) {
        this.setSize(600,200);
        JPanel main = new JPanel(new GridLayout(3,2));
        JLabel titre = new JLabel("titre");
        JLabel nbPage = new JLabel("nbPage");
        JLabel nbPageDon = new JLabel(String.valueOf(doc.getNbPage()));
        JLabel autre;
        JLabel autreNon;
        if(doc instanceof Revue){
            setTitle("Revue");
            autre = new JLabel("Frequence");
            autreNon = new JLabel(((Revue) doc).getFrequence().toString());
        }
        else {
            setTitle("Livre");
            autre = new JLabel("Auteur ");
            autreNon = new JLabel(((Livre) doc).getAuteur().toString());
        }
        JLabel donTitre = new JLabel(doc.getTitre());
        main.add(titre);
        main.add(donTitre);
        main.add(nbPage);
        main.add(nbPageDon);
        main.add(autre);
        main.add(autreNon);




        add(main);
        //pack();
    }
}
