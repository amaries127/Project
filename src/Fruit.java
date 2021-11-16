import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;

public class Fruit {
    public int x = (int) (Math.random()*800);
    public int y= 0;
    Image img;
    Fruit(){
        URL image = this.getClass().getResource("apple.png");
        img=Toolkit.getDefaultToolkit().getImage(image);
        run.start();
    }
    Thread run=new Thread(new Runnable() {
        @Override
        public void run() {
       while(true){
                y+=2;
           if(y >= 800){
               img = null;
               run = null;
           }
                try{
                    run.sleep(10);
                }catch (Exception e){ }
            }
        }

    });
    public Image getImage(){
        return img;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Rectangle2D getbound(){
        return (new Rectangle2D.Double(x,y,45,45));
    }
}
