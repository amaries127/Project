import javax.swing.*;
import java.awt.*;

public class Home2 extends JPanel {
    private ImageIcon background = new ImageIcon(this.getClass().getResource("Fruitcatcher_Home.jpg"));
    private ImageIcon Name = new ImageIcon(this.getClass().getResource("Gamename.png"));
    private ImageIcon easyimg = new ImageIcon(this.getClass().getResource("easy.png"));
    private ImageIcon mediumimg = new ImageIcon(this.getClass().getResource("medium.png"));
    private ImageIcon hardimg = new ImageIcon(this.getClass().getResource("hard.png"));
    JButton easy=new JButton(easyimg);
    JButton medium=new JButton(mediumimg);
    JButton hard=new JButton(hardimg);
    Home2(){
        easy.setContentAreaFilled(false);
        easy.setOpaque(false);
        medium.setContentAreaFilled(false);
        medium.setOpaque(false);
        hard.setContentAreaFilled(false);
        hard.setOpaque(false);
        setLayout(null);
        add(easy);
        easy.setBounds(240,385,138,63);
        add(medium);
        medium.setBounds(430,385,138,63);
        add(hard);
        hard.setBounds(620,385,138,63);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background.getImage(),0,0,1000,800,this);
        g.drawImage(Name.getImage(),340,120,320,200,this);
    }
}
