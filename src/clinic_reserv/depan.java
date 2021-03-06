package clinic_reserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class depan {
    private JPanel panelDpn;
    private JTextField textFieldNama;
    private JTextField textFieldAlamat;
    private JTextField textFieldEmail;
    private JButton button1;
    private JTextField textFieldUsia;
    private JRadioButton priaRadioButton;
    private JRadioButton wanitaRadioButton;
    private JButton resetButton;
    private JLabel labelError;
    private JPanel panelatas;
    private JLabel labelATAS;

    static JFrame frm;

    static String nama;
    static String sapa;
    String alamat;
    String email;
    int usia;
    int jk;
    int err;


    public depan() {

        frm = new JFrame("Klinik Permata Bunga");
        frm.setVisible(true);
        frm.add(panelDpn);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setResizable(true);
        frm.setSize(616, 480);
        frm.setLocationRelativeTo(null);

        ButtonGroup jenisKelamin = new ButtonGroup();
        jenisKelamin.add(priaRadioButton);
        jenisKelamin.add(wanitaRadioButton);

        labelError.setText("*mohon isikan data dengan benar dan lengkap");
        labelError.setVisible(false);

        labelATAS.setIconTextGap(5);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nama = textFieldNama.getText();
                alamat = textFieldAlamat.getText();
                email = textFieldEmail.getText();
                String usi = textFieldUsia.getText();
                try {
                    usia = Integer.parseInt(textFieldUsia.getText());
                } catch (NumberFormatException er){
                    err = 1;}
//                err = 1 untuk mengindikasikan adanya kesalahan/error
                
                if (nama.equals("")||alamat.equals("")||email.equals("")||usi.equals("")){
                    err = 1;
                } else if(usia < 1 || jk < 1){
                    err = 1;
                } else{
                    err = 0;
                }

                if (err == 1) {
                    labelError.setVisible(true);
                } else {
                    if (usia > 35 && jk == 1) {
                        sapa = "Bapak";
                    } else if (usia > 35 && jk == 2) {
                        sapa = "Ibu";
                    } else if (usia <= 35 && jk == 1) {
                        sapa = "Mas";
                    } else if (usia <= 35 && jk == 2) {
                        sapa = "Mbak";
                    }
                    frm.dispose();
                    new utama();
                }

            }
        });


        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldNama.setText("");
                textFieldAlamat.setText("");
                textFieldEmail.setText("");
                textFieldUsia.setText("");
                jenisKelamin.clearSelection();
                labelError.setVisible(false);
            }
        });
        priaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jk = 1;
            }
        });
        wanitaRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jk = 2;
            }
        });
    }

}

