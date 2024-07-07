//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Reservation extends JFrame implements ActionListener {
    private String d = "Bilgileri Onaylıyor musunuz ?";
    private String currentLine;
    private int deletef = 1;
    private JButton exitb;
    private JButton checkb;
    private JButton back2;
    private JLabel t;
    private JLabel t2;
    private JLabel t3;
    private JLabel t4;
    private JLabel t5;
    private JLabel t6;
    private JLabel t7;
    private JLabel t8;
    private JLabel t9;
    private TextField r;
    private TextField r2;
    private TextField r3;
    private TextField r4;
    private TextField r5;
    private TextField r6;
    private TextField r7;
    private TextField r8;
    private TextField r9;
    private TextField r10;
    private TextField r11;
    private String[] arr = new String[]{"CustomerId    ", "  Plaka     ", "     Gear    ", "           Fuel Type    ", "         Segment    ", "    Pick-up Location", "  Return-Location    ", "           Pick-up date    ", "            Return-Date         "};
    private String fileName = "C:/Users/Berkay/Desktop/reservation.txt";
    private Path path;
    private Scanner scanner;
    private List<String> lineBox;
    public String[] split;

    public Reservation() throws IOException {
        this.path = Paths.get(this.fileName);
        this.scanner = new Scanner(this.path);
        this.lineBox = new ArrayList();
        this.split = new String[9];
        this.setTitle("Reservation");
        this.setSize(600, 600);
        this.setVisible(true);
        this.checkb = new JButton("Rezervasyon Bilgileri");
        this.exitb = new JButton("Exit");
        this.back2 = new JButton("Back");
        this.t = new JLabel();
        this.t2 = new JLabel();
        this.t3 = new JLabel();
        this.t4 = new JLabel();
        this.t5 = new JLabel();
        this.t6 = new JLabel();
        this.t7 = new JLabel();
        this.t8 = new JLabel();
        this.t9 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.r = new TextField(10);
        this.r2 = new TextField(10);
        this.r3 = new TextField(10);
        this.r4 = new TextField(10);
        this.r5 = new TextField(10);
        this.r6 = new TextField(10);
        this.r7 = new TextField(20);
        this.r8 = new TextField(20);
        this.r9 = new TextField(20);
        Container c = this.getContentPane();
        c.setLayout(new FlowLayout());
        c.add(this.r);
        c.add(this.r2);
        c.add(this.r3);
        c.add(this.r4);
        c.add(this.r5);
        c.add(this.r6);
        c.add(this.t);
        c.add(this.t2);
        c.add(this.t3);
        c.add(this.t4);
        c.add(this.t5);
        c.add(this.t6);
        c.add(this.r7);
        c.add(this.r8);
        c.add(this.r9);
        c.add(this.t7);
        c.add(this.t8);
        c.add(this.t9);
        c.add(this.checkb);
        c.add(this.exitb);
        c.add(this.back2);
        this.checkb.addActionListener(this);
        this.exitb.addActionListener(this);
        this.back2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.exitb) {
            System.exit(0);
        } else if (e.getSource() == this.checkb) {
            this.t.setText(this.arr[0]);
            this.t2.setText(this.arr[1]);
            this.t3.setText(this.arr[2]);
            this.t4.setText(this.arr[3]);
            this.t5.setText(this.arr[4]);
            this.t6.setText(this.arr[5]);
            this.t7.setText(this.arr[6]);
            this.t8.setText(this.arr[7]);
            this.t9.setText(this.arr[8]);

            try {
                int re = 111111;

                while(this.scanner.hasNextLine()) {
                    String line = this.scanner.nextLine();
                    this.lineBox.add(line);
                    this.split = line.split(",");
                    System.out.println(this.split[0]);
                    if (re == Integer.parseInt(this.split[0])) {
                        System.out.println("no");
                        System.out.println(this.split[2]);
                        this.r.setText(this.split[0]);
                        this.r2.setText(this.split[1]);
                        this.r3.setText(this.split[2]);
                        this.r4.setText(this.split[3]);
                        this.r5.setText(this.split[4]);
                        this.r6.setText(this.split[5]);
                        this.r7.setText(this.split[6]);
                        this.r8.setText(this.split[7]);
                        this.r9.setText(this.split[8]);
                        break;
                    }
                }
            } catch (NumberFormatException var5) {
                throw new RuntimeException(var5);
            }
        }

        if (e.getSource() == this.back2) {
            Window wnd = new Window();
            wnd.setVisible(true);
            this.setVisible(false);
        }

    }
}