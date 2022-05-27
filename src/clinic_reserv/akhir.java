package clinic_reserv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class akhir {
    private JPanel panelAkh;
    private JLabel labelKonf;
    private JTextArea textAreaKonf;
    private JButton okeeButton;
    private JButton kembali2Button;
    private JPanel panelTextare;

    public static JFrame fram;

    akhir(){
        fram = new JFrame("Konfirmasi");
        fram.setVisible(true);
        fram.setContentPane(panelAkh);
        fram.setDefaultCloseOperation(3);
        fram.setSize(630,400);
        fram.setLocationRelativeTo(null);

        textAreaKonf.setText(" Baik, "+depan.sapa+" "+depan.nama+". \n Kami akan mengirimkan pesan konfirmasi ke email Anda.   \n Nomor antrean anda adalah "+ utama.antrean+
                ".\n Silakan datang ke klinik pukul "+ utama.dtg+" WIB.");

        okeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        kembali2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new depan();
                fram.dispose();
            }
        });
    }

}
