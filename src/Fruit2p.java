import java.awt.*;
import java.net.URL;

public class Fruit2p extends Fruit{
    Image img;
    Fruit2p(){
        URL image = this.getClass().getResource("Rbanana.png");
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
