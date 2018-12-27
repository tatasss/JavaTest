import javafx.scene.control.Alert;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Fenetre extends JFrame {
    JLabel monLabel;
    private void nouveauxFichier(){
        this.monLabel.setText("On creer un nouveaux fichier");
    }
    private void enregistrer(){
        this.monLabel.setText("On enregistre un nouveaux fichier");
    }
    private void enregistrerSous(){
        this.monLabel.setText("On enregistre sous un nouveaux fichier");
    }
    private void cut(){
        this.monLabel.setText("On coupe un nouveaux fichier");
    }
    private void copier(){
        this.monLabel.setText("On copie un nouveaux fichier");
    }
    private void coller(){
        this.monLabel.setText("On colle un nouveaux fichier");
    }
    private void quitter(){
        this.setVisible(false);
        System.exit(0);
    }

    public Fenetre() {
        monLabel = new JLabel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,400);
        this.setLocationRelativeTo( null );
        this.setJMenuBar(this.createJMenuBar());
        JPanel monPannel = (JPanel) getContentPane();
        monPannel.add(this.createToolBar(),BorderLayout.NORTH);
        monPannel.add(monLabel,BorderLayout.CENTER);
        //JToolBar barre
        setTitle("Titre");
        //pack();
        //add(monPannel);

        //

    }

    private JToolBar createToolBar() {
        JToolBar mainBar= new JToolBar();
        //=================================
        JButton newFile = new JButton(new ImageIcon("src/Icon/icons/new.png"));
        newFile.setToolTipText("Nouveaux Fichiers");
        JButton save = new JButton(new ImageIcon("src/Icon/icons/save.png"));
        JButton saveAs = new JButton(new ImageIcon("src/Icon/icons/save_as.png"));
        JButton cut = new JButton(new ImageIcon("src/Icon/icons/cut.png"));
        JButton copy = new JButton(new ImageIcon("src/Icon/icons/copy.png"));
        JButton paste = new JButton(new ImageIcon("src/Icon/icons/paste.png"));
        JButton exit = new JButton(new ImageIcon("src/Icon/icons/exit.png"));

        newFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nouveauxFichier();
            }
        });
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enregistrer();
            }
        });
        saveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enregistrerSous();
            }
        });
        cut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cut();
            }
        });
        copy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                copier();
            }
        });
        paste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                coller();
            }
        });
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quitter();
            }
        });

        //==================================
        mainBar.add(newFile);
        mainBar.add(save);
        mainBar.add(saveAs);
        mainBar.add(cut);
        mainBar.add(copy);
        mainBar.add(paste);
        mainBar.add(exit);
        return mainBar;


    }

    private JMenuBar createJMenuBar() {
        JMenuBar menu = new JMenuBar();
        //================================
        JMenu file = new JMenu("fichier");
        file.setMnemonic('f');
        //====
        JMenuItem newFile = new JMenuItem("nouveaux Fichier");
        newFile.setIcon(new ImageIcon("src/Icon/icons/new.png"));
        newFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));

        //=====
        JMenuItem openFile = new JMenuItem("ouvrir");
        openFile.setIcon(new ImageIcon("src/Icon/icons/open.png"));
        openFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        //=====
        JMenuItem saveFile = new JMenuItem("enregistrer");
        saveFile.setIcon(new ImageIcon("src/Icon/icons/save.png"));
        saveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        //=====
        JMenuItem saveFileAs = new JMenuItem("enregistrer sous");
        saveFileAs.setIcon(new ImageIcon("src/Icon/icons/save_as.png"));
        //saveFileAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,KeyEvent.ALT_DOWN_MASK));
        //=====
        JMenuItem exit = new JMenuItem("Quitter");
        exit.setIcon(new ImageIcon("src/Icon/icons/exit.png"));
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4,KeyEvent.ALT_DOWN_MASK));



        //============================
        file.add(newFile);
        file.addSeparator();
        file.add(openFile);
        file.add(saveFile);
        file.add(saveFileAs);
        file.addSeparator();
        file.add(exit);



        //===============================================================================================
        JMenu edit= new JMenu("edition");
        //=====
        JMenuItem cut = new JMenuItem("couper");
        cut.setIcon(new ImageIcon("src/Icon/icons/cut.png"));
        JMenuItem copy = new JMenuItem("copier");
        copy.setIcon(new ImageIcon("src/Icon/icons/copy.png"));
        JMenuItem paste = new JMenuItem("coller");
        paste.setIcon(new ImageIcon("src/Icon/icons/paste.png"));
        JMenuItem redo = new JMenuItem("devant");
        redo.setIcon(new ImageIcon("src/Icon/icons/redo.png"));
        JMenuItem undo = new JMenuItem("derrière");
        undo.setIcon(new ImageIcon("src/Icon/icons/undo.png"));

        //=====
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.setMnemonic('E');
        edit.addSeparator();
        edit.add(undo);
        edit.add(redo);
        //================================================================================================
        JMenu help = new JMenu("Aide");
        //====
        JMenuItem about= new JMenuItem("à propos");
        about.setIcon(new ImageIcon("src/Icon/icons/about.png"));
        //=====

        //=====
        help.add(about);
        //=================================================================================================
        menu.add(file);
        menu.add(edit);
        menu.add(help);
        //============================
        return menu;
    }

    public static void main(String[] argc){
        Fenetre maF = new Fenetre();
        maF.setVisible(true);
    }
}
