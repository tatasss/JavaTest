package InterfaceGraphique;

import metier.Frequence;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreLivre extends JFrame{
    private String[] monTabDonne= new String[3];

    public String[] getMonTabDonne() {
        return monTabDonne;
    }
    static JButton valider;
    public FenetreLivre(){

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
        JPanel auteur = new JPanel();
        JLabel labelAuteur = new JLabel("Nom Auteur : ");
        JTextField textAuteur = new JTextField();
        textAuteur.setPreferredSize(new Dimension(250,20));
        auteur.add(labelAuteur);
        auteur.add(textAuteur);
        //--------------------------------------------------------
        valider = new JButton("valider");
        valider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                monTabDonne[0]= textTitre.getText();
                monTabDonne[1] = textNbPage.getText();
                monTabDonne[2] = textAuteur.getText();
                //setVisible(false);

            }
        });

        //---------------------------------------------------------
        main.add(titre);
        main.add(nbPage);
        main.add(auteur);
        main.add(valider);
        add(main);

        pack();
    }

}
