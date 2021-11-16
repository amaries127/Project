import java.awt.*;
import java.net.URL;

public class Fruitp extends Fruit{
    Image img;
    Fruitp(){
        URL image = this.getClass().getResource("Rapple.png");
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
                    run.sleep(40);
                }catch (Exception e){ }
            }
        }
    });
    public Image getImage(){
        return img;
    }
}
