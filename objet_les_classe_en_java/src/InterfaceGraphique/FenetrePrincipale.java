package InterfaceGraphique;

import metier.Auteur;
import metier.Bibliotheque;
import metier.Frequence;
import metier.Revue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

        bib.ajouterUnDocument(tab[0],Integer.parseInt(tab[1]), Frequence.valueOf(tab[2]));


        model.addElement(new Revue(tab[0],Integer.parseInt(tab[1]), Frequence.valueOf(tab[2])));



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
        JButton actu =new JButton("actualiser");
        pSud.add(actu);
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
        livre.addActionListener((e)->{fl.setVisible(true);});

        actu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               /* if(fr.isVisible())
                    bib.ajouterUnDocument(fr.getMonTabDonne()[0], Integer.parseInt(fr.getMonTabDonne()[1]), Frequence.valueOf(fr.getMonTabDonne()[2]));
                if(fl.isVisible())
                    bib.ajouterUnDocument(fl.getMonTabDonne()[0], Integer.parseInt(fl.getMonTabDonne()[1]),new Auteur(fl.getMonTabDonne()[2]));
                */
               DefaultListModel<Object> model = new DefaultListModel<>();
                for(Object d : bib.getMesDocument()){
                    model.addElement(d);
                }
                listDoc.setModel(model);

            }

        });


    }


}
