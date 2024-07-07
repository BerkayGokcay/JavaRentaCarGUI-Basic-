//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Window extends JFrame implements ActionListener {
    private String d = "Bilgileri Onaylıyor musunuz ?";
    private String currentLine;
    private int deletef = 1;
    private JButton b;
    private JButton b2;
    private JButton b3;
    private JLabel r;
    private JLabel r2;
    private JLabel r3;
    private JLabel r4;
    private JLabel r5;
    private JLabel r6;
    private JLabel r7;
    private JLabel r8;
    private JLabel r9;
    private JLabel r10;
    private JLabel r11;
    private List<String> lineBox = new ArrayList();
    public String[] split = new String[9];

    public Window() {
        this.setVisible(true);
        this.b = new JButton("Kiralama ");
        this.b2 = new JButton("Teslim Etme");
        this.b3 = new JButton("Back");
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        this.setBounds(100, 100, 600, 600);
        c.add(this.b);
        c.add(this.b2);
        c.add(this.b3);
        this.b.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        RentClass rent;
        if (e.getSource() == this.b) {
            rent = null;

            try {
                rent = new RentClass();
            } catch (IOException var5) {
                throw new RuntimeException(var5);
            }

            rent.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == this.b2) {
            rent = null;

            Reservation rez;
            try {
                rez = new Reservation();
            } catch (IOException var4) {
                throw new RuntimeException(var4);
            }

            rez.setVisible(true);
            this.setVisible(false);
        } else if (e.getSource() == this.b3) {
            Findex find = new Findex();
            find.setVisible(true);
            this.setVisible(false);
        }

    }
}
