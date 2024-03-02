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
        JPanel panneau = new JPanel();
        panneau.add(button);
        panneau.add(buttonExit);
        setContentPane(panneau);
        setSize(200,100);
        pack();
        setVisible(true);
    }
}

