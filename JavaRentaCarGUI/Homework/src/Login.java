import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Login extends JFrame implements ActionListener {
    Color color = new Color(99999999);
    FontUIResource font = new FontUIResource("Tahoma",Font.PLAIN,20) ;
    Customer customer = new Customer() ;
    private  JLabel IdLabel,ErrorMessage ;
    private JTextField IdTF;
    private JButton loginButton,exitButton ;
    public Login() throws IOException {
        this.setTitle("Car Rental");  // Frame başlığı

        this.setBounds(100,100,600,600); // Frame büyüklüğü

        this.setVisible(true); // Frame görünürlüğünü açma
        this.setResizable(false); // Pencere boyutunun değiştirilmemesi için gerekli

        this.setDefaultCloseOperation(EXIT_ON_CLOSE); /* Uygulamanın çarpı işaretine basınca programın kapatılması için onun
        haricinde bellekte bulunmaya devam ediyor ve çalışıyor.*/
        IdLabel = new JLabel("Customer Id") ;
        ErrorMessage = new JLabel("Please check your Id") ;

        IdLabel.setFont(font);
        ErrorMessage.setFont(font);

        IdTF = new JTextField(10) ;
        loginButton = new JButton("Login") ;
        exitButton = new JButton("Exit") ;

        Container C = getContentPane() ;
        C.setLayout(new FlowLayout());
        C.setBackground(color);
        C.add(IdLabel) ;
        C.add(IdTF) ;
        C.add(loginButton);
        C.add(exitButton) ;
        C.add(ErrorMessage) ;
        ErrorMessage.setVisible(false);
        loginButton.addActionListener(this);
        exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitButton)
        {
            System.exit(0);
        }
        if(e.getSource() == loginButton)
        {
            while(true)
            {
                boolean Id = customer.ScanCustomerId(Integer.parseInt(IdTF.getText()));
                if(Id == true)
                {
                    Findex findex = new Findex();
                    findex.setVisible(true);
                    this.setVisible(false);
                    break;
                }
                else
                {
                    ErrorMessage.setVisible(true);
                    break;
                }
            }
        }

    }
}
