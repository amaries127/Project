import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Playgame extends JFrame implements ActionListener{
        Home home=new Home();
        Home2 home2=new Home2();
        Gamestart start=new Gamestart();
        Gamestart_medium start1=new Gamestart_medium();
        Gamestart_hard start2=new Gamestart_hard();
    Playgame() {
        setSize(1000, 800);
        add(home);
        home.BStart.addActionListener(this);
        home.BExit.addActionListener(this);
        home2.easy.addActionListener(this);
        home2.medium.addActionListener(this);
        home2.hard.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==home.BStart) {
            setLocationRelativeTo(null);
            remove(home);
            setSize(1000, 800);
            add(home2);
        }
        if(e.getSource()==home2.easy) {
            setLocationRelativeTo(null);
            remove(home2);
            setSize(1000, 800);
            add(start);
            start.requestFocusInWindow();
            start.st_fruit = false;
            start.timestart = false;
        }
        if(e.getSource()==home2.medium) {
                setLocationRelativeTo(null);
                remove(home2);
                setSize(1000, 800);
                add(start1);
                start1.requestFocusInWindow();
                start1.st_fruit = false;
                start1.timestart = false;
            }
        if(e.getSource()==home2.hard) {
                setLocationRelativeTo(null);
                remove(home2);
                setSize(1000, 800);
                add(start2);
                start2.requestFocusInWindow();
                start2.st_fruit = false;
                start2.timestart = false;
            }
        if(e.getSource()==home.BExit){
            System.exit(0);
        }
        validate();
    }
}