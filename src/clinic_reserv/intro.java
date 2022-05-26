package clinic_reserv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class intro {
    private JPanel panelIntro;
    private JLabel labelLogo;
    private JButton selanjutnyaButton;


    public intro() {

        JFrame fr = new JFrame("Klinik Permata Bunga");
        fr.setVisible(true);
        fr.add(panelIntro);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(true);
        fr.setLocation(650,240);
        fr.setSize(600,600);

        selanjutnyaButton.setFocusable(false);


        selanjutnyaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new depan();
                fr.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new intro();
    }
}
