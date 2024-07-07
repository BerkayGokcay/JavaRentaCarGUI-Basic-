import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.IOException;

public class Findex extends JFrame implements ActionListener {

    public double findexLevel ;
    JLabel findexLabel,ErrorLabel,learnLabel ;
    JTextField findexTF;
    JButton LearnButton,EnterButton,BackButton;
    public Findex()
    {
        this.setTitle("Car Rental");  // Frame başlığı

        this.setBounds(100,100,600,600); // Frame büyüklüğü

        this.setVisible(true); // Frame görünürlüğünü açma
        this.setResizable(false); // Pencere boyutunun değiştirilmemesi için gerekli

        this.setDefaultCloseOperation(EXIT_ON_CLOSE); /* Uygulamanın çarpı işaretine basınca programın kapatılması için onun
        haricinde bellekte bulunmaya devam ediyor ve çalışıyor.*/
        findexLabel = new JLabel("Findex") ;
        ErrorLabel = new JLabel("Your Findex rate is not available for car rental") ;
        learnLabel = new JLabel("You can find your Findex rate at this link. \nhttps://www.findeks.com/urunler/findeks-kredi-notu") ;
        learnLabel.setVisible(false);
        ErrorLabel.setVisible(false) ;
        findexTF = new JTextField(10);
        LearnButton = new JButton("Learn Findex Note") ;
        EnterButton = new JButton("Enter") ;
        BackButton = new JButton("Back") ;
        Container C = getContentPane();
        C.setLayout(new FlowLayout());
        C.add(findexLabel) ;
        C.add(findexTF) ;
        C.add(EnterButton);
        C.add(ErrorLabel) ;
        C.add(LearnButton) ;
        C.add(learnLabel) ;
        C.add(BackButton) ;
        EnterButton.addActionListener(this);
        LearnButton.addActionListener(this);
        BackButton.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.EnterButton) {
            this.findexLevel = Double.parseDouble(this.findexTF.getText());
            if (this.findexLevel >= 1400.0) {
                this.ErrorLabel.setVisible(false);
                Window rentF = new Window();
                this.setVisible(false);
                rentF.setVisible(true);
            } else if (this.findexLevel < 1400.0) {
                this.ErrorLabel.setVisible(true);
            }
        }
        else if(e.getSource() == LearnButton)
        {
            JHyperLink link = new JHyperLink();
            link.setVisible(true);
        }
        else if (e.getSource() == BackButton)
        {
            this.setVisible(false);
            try {
                Login login = new Login();
                login.setVisible(true);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
