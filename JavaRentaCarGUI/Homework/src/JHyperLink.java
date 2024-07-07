import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class JHyperLink extends JFrame {
    private String text = "Learn Findex";
    private JLabel hyperLink = new JLabel(text);

    public JHyperLink() throws HeadlessException {
        super();
        setTitle("Findex Rate Learn");
        hyperLink.setForeground(Color.BLUE.darker());
        hyperLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
        hyperLink.setFont(new Font("Serif",Font.BOLD,20));

        hyperLink.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.findeks.com/urunler/findeks-kredi-notu"));
                } catch (IOException | URISyntaxException e1) {
                    e1.printStackTrace();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hyperLink.setText(text);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                hyperLink.setText("<html><a href=''>" + text + "</a></html>");
            }

        });
        setLayout(new FlowLayout());
        getContentPane().add(hyperLink);


        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
}