package clinic_reserv;

import javax.swing.*;

public class intro {
    private JPanel panelIntro;
    private JLabel labelLogo;
    private JProgressBar progressBarLoad;

    static JFrame fr = new JFrame("Klinik Permata Bunga");

    public intro() {

        fr.setVisible(true);
        fr.add(panelIntro);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setResizable(true);
        fr.setLocation(650,175);
        fr.setSize(600,630);

        progressBarLoad.setStringPainted(true);
        load();
    }

    public void load(){
        int i = 0;
        while (i <= 100){
            progressBarLoad.setValue(i);
            i += 3;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        progressBarLoad.setString("DONE");
        fr.dispose();
        new depan();
    }

    public static void main(String[] args) {
        new intro();
    }
}
