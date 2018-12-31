package InterfaceGraphique;

import Service.Controlleur;
import metier.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class FenetrePrincipale extends JFrame { // la JFrame Utilise un layout par default  : BoderLayout
    /*public static void actu(String[] tab){
        bib.ajouterUnDocument(tab[0], Integer.parseInt(tab[1]), Frequence.valueOf(tab[2]));
    }*/

    public Bibliotheque getBib() {
        return bib;
    }
    private  JList<Object> listDoc = new JList<>();
    private static Bibliotheque bib;
    private static DefaultListModel<Object> model = new DefaultListModel<>();
    public static void  actualiser(String[] tab)
    {
        if(tab[3].equals("REVUE")) {
            bib.ajouterUnDocument(tab[0], Integer.parseInt(tab[1]), Frequence.valueOf(tab[2]));


            model.addElement(new Revue(tab[0], Integer.parseInt(tab[1]), Frequence.valueOf(tab[2])));
        }
        else {
            bib.ajouterUnDocument(tab[0], Integer.parseInt(tab[1]), new Auteur(tab[2]));


            model.addElement(new Livre(tab[0], Integer.parseInt(tab[1]), new Auteur(tab[2])));
        }
        Controlleur.sauveBin(new File("bib.bin"),bib);
        Controlleur.sauve(new File("bib.txt"),bib);

    }
    public FenetrePrincipale(Bibliotheque bib){
        //=========================================================================
        FenetrePrincipale.bib=bib;
        //=========================================================================
        //DefaultListModel<Object> model = new DefaultListModel<>();
        for(Object d : FenetrePrincipale.bib.getMesDocument()){
            model.addElement(d);
        }
        listDoc.setModel(model);
        add(listDoc, BorderLayout.CENTER);

        //===========================================================================
        JPanel pSud = new JPanel(); // utilise un layoutManager : flowLayout
        JButton livre =new JButton("ajouter un livre");
        pSud.add(livre);
        JButton revue=new JButton("ajouter une revue");
        pSud.add(revue);

        //=============================================================================
        this.setLocationRelativeTo(null);
        add(pSud, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//on libère toutes les ressources
        pack();
        FenetreRevue fr=new FenetreRevue(this.getBib());
        FenetreLivre fl=new FenetreLivre();
        revue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                fr.setVisible(true);

            }//jouer le role d'un écouteur, lorque l'utilisateur clique sur la souris ou clavier, elle va detecter et executer
            //le traitement qui lui correspond
        });
        listDoc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listDoc.scrollRectToVisible(new Rectangle());
        listDoc.addListSelectionListener((e)->{
            Document monDoc=bib.getMesDocument().get(listDoc.getSelectedIndex());
            FenetreLivreDetail fld= new FenetreLivreDetail(monDoc);
            fld.setVisible(true);
        });
        livre.addActionListener((e)->{fl.setVisible(true);});




    }


}
