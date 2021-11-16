import javax.swing.*;
import java.awt.*;

public class Home extends JPanel {
        private ImageIcon background = new ImageIcon(this.getClass().getResource("Fruitcatcher_Home.jpg"));
        private ImageIcon Exit = new ImageIcon(this.getClass().getResource("Exit_Button.png"));
        private ImageIcon Start = new ImageIcon(this.getClass().getResource("Start_Button.png"));
        private ImageIcon Name = new ImageIcon(this.getClass().getResource("Gamename.png"));
        public JButton BStart = new JButton(Start);
        public JButton BExit  = new JButton(Exit);
        Home() {
                setLayout(null);
                BStart.setContentAreaFilled(false);
                BStart.setOpaque(false);
                BExit.setContentAreaFilled(false);
                BExit.setOpaque(false);
                add(BStart);
                BStart.setBounds(430, 350, 138, 63);
                add(BExit);
                BExit.setBounds(430, 430, 138, 63);
        }
        public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(background.getImage(),0,0,1000,800,this);
                g.drawImage(Name.getImage(),340,120,320,200,this);
        }
}
