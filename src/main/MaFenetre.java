import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
public class MaFenetre extends JFrame {

    public MaFenetre(String titre){
        super(titre);
        add(new JPanel());
        setName("NPanel");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public MaFenetre(){

        WindowListener l = new WindowAdapter() {
            public void windowsClosing(WindowEvent e){
                System.exit(0);
            }
        };
        addWindowListener(l);

        JButton button = new JButton("OK");
        JButton buttonExit = new JButton("EXIT");
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        // Panneau principal
        JPanel panneau = new JPanel();
        panneau.add(button);
        panneau.add(buttonExit);
        setContentPane(panneau);

        //Barre de menu
        JMenuBar barreMenu = new JMenuBar();
        //Menus
        JMenu menuFichier = new JMenu("Fichier");
        JMenu menuEdition = new JMenu("Edition");
        JMenu menuQuitter = new JMenu("Quitter");

        // Sous menu Fichier
        JMenuItem itemF1 = new JMenuItem("Quitter");
        JMenuItem itemF2 = new JMenuItem("Sauvegarder");
        JMenuItem itemF3 = new JMenuItem("Sauvegarder sous");
        menuFichier.add(itemF1);
        menuFichier.add(itemF2);
        menuFichier.add(itemF3);

        //Sous menu Edition
        JMenuItem itemE1 = new JMenuItem("ED1");
        JMenuItem itemE2 = new JMenuItem("ED2");

        menuEdition.add(itemE1);
        menuEdition.add(itemE2);




        barreMenu.add(menuFichier);
        barreMenu.add(menuEdition);
        barreMenu.add(menuQuitter);
        setJMenuBar(barreMenu);
        // Configuration finale
        setSize(200,200);
        pack();
        setVisible(true);
    }
}

