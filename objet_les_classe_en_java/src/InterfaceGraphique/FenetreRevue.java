package InterfaceGraphique;

import metier.Bibliotheque;
import metier.Frequence;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreRevue extends JFrame {
    private String[] monTabDonne= new String[4];

    public String[] getMonTabDonne() {
        return monTabDonne;
    }
    static JButton valider;
    public FenetreRevue(Bibliotheque bib){

       // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
        setPreferredSize(new Dimension(650,250));
        JLabel labelTitre = new JLabel("Titre");
        JPanel main= new JPanel();


        //------------------------
        main.setLayout(new GridLayout(4,1,10,10));//loyout en forme de grille
        JTextField textTitre = new JTextField();
        textTitre.setPreferredSize(new Dimension(250,20));
        JPanel titre = new JPanel();
        titre.add(labelTitre);
        titre.add(textTitre);
        //------------------------
        JPanel nbPage = new JPanel();
        JLabel labelNbPage = new JLabel("Nombre de page : ");
        JTextField textNbPage = new JTextField();
        textNbPage.setPreferredSize(new Dimension(250,20));
        nbPage.add(labelNbPage);
        nbPage.add(textNbPage);
        //-----------------------------------------------
        JPanel frequence = new JPanel();
        JLabel labelFrequence = new JLabel("Frequence : ");
        JComboBox<Frequence> frequenceList = new JComboBox<>();
        frequenceList.addItem(Frequence.ANNUEL);
        frequenceList.addItem(Frequence.JOURNALIER);
        frequenceList.addItem(Frequence.HEBDOMADAIRE);
        frequenceList.addItem(Frequence.MENSUEL);
        frequenceList.addItem(Frequence.TRIMESTRIEL);
        frequenceList.addItem(Frequence.SEMESTRIEL);
        frequence.add(labelFrequence);
        frequence.add(frequenceList);
        //--------------------------------------------------------
        valider = new JButton("valider");
        valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monTabDonne[0]= textTitre.getText();
                monTabDonne[1] = textNbPage.getText();
                monTabDonne[2] = String.valueOf(frequenceList.getItemAt(frequenceList.getSelectedIndex()));
                monTabDonne[3]="REVUE";
                //setVisible(false);
                //FenetrePrincipale.actu(monTabDonne);
                FenetrePrincipale.actualiser(monTabDonne);
                //bib.ajouterUnDocument(textTitre.getText(),Integer.parseInt(textNbPage.getText()),frequenceList.getItemAt(frequenceList.getSelectedIndex()));
                setVisible(false);
            }
        });

        //---------------------------------------------------------
        main.add(titre);
        main.add(nbPage);
        main.add(frequence);
        main.add(valider);
        add(main);

        pack();
    }

}
