import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class Gamestart_hard extends JPanel{
    private ImageIcon Basket = new ImageIcon(this.getClass().getResource("basket.png"));
    private ImageIcon Jungle = new ImageIcon(this.getClass().getResource("jungle.jpg"));
    private ImageIcon Flat = new ImageIcon(this.getClass().getResource("flat.jpg"));
    ImageIcon gameover = new ImageIcon(this.getClass().getResource("Gameover.jpg"));
    int time=120;
    int HP=10;
    int score=0;
    int basket_x;
    int count=0;
    boolean timestart = true;
    boolean st_fruit = false;
    public ArrayList<Fruit> f1 = new ArrayList<Fruit>();
    public ArrayList<Fruit2> f2 = new ArrayList<Fruit2>();
    public ArrayList<Fruit3> f3 = new ArrayList<Fruit3>();
    public ArrayList<Fruit4> f4 = new ArrayList<Fruit4>();
    public ArrayList<Fruitp> f1p = new ArrayList<Fruitp>();
    public ArrayList<Fruit2p> f2p = new ArrayList<Fruit2p>();
    public ArrayList<Fruit3p> f3p = new ArrayList<Fruit3p>();
    public ArrayList<Fruit4p> f4p = new ArrayList<Fruit4p>();
    Thread Time = new Thread(new Runnable(){
        public void run(){
            while(true){
                try{
                    Thread.sleep(0);
                }catch(Exception e){ }

                if(timestart == false){
                    repaint();
                }
            }
        }
    });
    Thread t_counter = new Thread(new Runnable(){
        public void run() {
            while(true){
                if(timestart == false){
                    time = (time-1) ;
                }
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
    });
    Thread apple = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(st_fruit == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(st_fruit == false){
                    f1.add(new Fruit());
                }
            }
        }
    });
    Thread banana = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(st_fruit == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(st_fruit == false){
                    f2.add(new Fruit2());
                }
            }
        }
    });
    Thread melon = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(st_fruit == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(st_fruit == false){
                    f3.add(new Fruit3());
                }
            }
        }
    });
    Thread orange = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(st_fruit == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(st_fruit == false){
                    f4.add(new Fruit4());
                }
            }
        }
    });
    Thread Rapple = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(st_fruit == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(st_fruit == false){
                    f1p.add(new Fruitp());
                }
            }
        }
    });
    Thread Rbanana = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(st_fruit == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(st_fruit == false){
                    f2p.add(new Fruit2p());
                }
            }
        }
    });
    Thread Rmelon = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(st_fruit == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(st_fruit == false){
                    f3p.add(new Fruit3p());
                }
            }
        }
    });
    Thread Rorange = new Thread(new Runnable(){
        public void run() {
            while(true){
                try{
                    if(st_fruit == false) {
                        Thread.sleep((long) (Math.random() * 10000) + 2000);
                    }
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
                if(st_fruit == false){
                    f4p.add(new Fruit4p());
                }
            }
        }
    });
    Gamestart_hard(){
        setFocusable(true);
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e){ }
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_A){
                    basket_x-=10;
                }
                if(e.getKeyCode()==KeyEvent.VK_D){
                    basket_x+=10;
                }
            }

            @Override
            public void keyReleased(KeyEvent e){}
        });
        Time.start();
        t_counter.start();
        apple.start();
        banana.start();
        melon.start();
        orange.start();
        Rapple.start();
        Rbanana.start();
        Rmelon.start();
        Rorange.start();
    }
    //Rectangle2D basketrect=new Rectangle2D.Double(basket_x, 550, 150, 125);
    Rectangle2D getbound(){return (new Rectangle2D.Double(basket_x,550,45,45));}
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(time<=0||HP<=0){
            setLayout(null);
            g.drawImage(gameover.getImage(),0,0,1000,800,this);
            g.setColor(Color.WHITE);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,50));
            g.drawString("SCORE =  "+score,380, 200);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,120));
            g.drawString("Gameover",210, 120);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,50));
            g.drawString("Fruit collected =  "+count,300, 300);
        }else if(time<=60){
            g.drawImage(Flat.getImage(),0, 0,1000,800, this);
            g.drawImage(Basket.getImage(),basket_x, 550,150,125, this);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,30));
            g.setColor(Color.BLACK);
            g.drawString("SCORE="+score,50, 70);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,30));
            g.drawString("Fruit collected="+count,600, 70);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,50));
            g.drawString("Time:"+time,360,70);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,30));
            g.drawString("HP= "+HP,210, 70);
            //apple
            for(int i=0 ; i<f1.size();i++){
                g.drawImage( f1.get(i).getImage() ,f1.get(i).getX(),f1.get(i).getY(),90,90,this);
            }
            for(int i=0 ; i<f1.size();i++){
                if(getbound().intersects(f1.get(i).getbound())){
                    f1.remove(i);
                    count++;
                    score += 5;
                }
            }
            //banana
            for(int i=0 ; i<f2.size();i++){
                g.drawImage( f2.get(i).getImage() ,f2.get(i).getX(),f2.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f2.size();i++){
                if(getbound().intersects(f2.get(i).getbound())){
                    f2.remove(i);
                    count++;
                    score += 2;
                }
            }
            //melon
            for(int i=0 ; i<f3.size();i++){
                g.drawImage( f3.get(i).getImage() ,f3.get(i).getX(),f3.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f3.size();i++){
                if(getbound().intersects(f3.get(i).getbound())){
                    f3.remove(i);
                    count++;
                    score += 9;
                }
            }
            //orange
            for(int i=0 ; i<f4.size();i++){
                g.drawImage( f4.get(i).getImage() ,f4.get(i).getX(),f4.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f4.size();i++){
                if(getbound().intersects(f4.get(i).getbound())){
                    f4.remove(i);
                    count++;
                    score += 17;
                }
            }
            //Rapple
            for(int i=0 ; i<f1p.size();i++){
                g.drawImage( f1p.get(i).getImage() ,f1p.get(i).getX(),f1p.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f1p.size();i++){
                if(getbound().intersects(f1p.get(i).getbound())){
                    f1p.remove(i);
                    HP-=5;
                    score -= 6;
                }
            }
            //Rbanana
            for(int i=0 ; i<f2p.size();i++){
                g.drawImage( f2p.get(i).getImage() ,f2p.get(i).getX(),f2p.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f2p.size();i++){
                if(getbound().intersects(f2p.get(i).getbound())){
                    f2p.remove(i);
                    HP-=6;
                    score -= 5;
                }
            }
            //Rmelon
            for(int i=0 ; i<f3p.size();i++){
                g.drawImage( f3p.get(i).getImage() ,f3p.get(i).getX(),f3p.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f3p.size();i++){
                if(getbound().intersects(f3p.get(i).getbound())){
                    f3p.remove(i);
                    HP-=7;
                    score -= 10;
                }
            }
            //Rorange
            for(int i=0 ; i<f4p.size();i++){
                g.drawImage( f4p.get(i).getImage() ,f4p.get(i).getX(),f4p.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f4p.size();i++){
                if(getbound().intersects(f4p.get(i).getbound())){
                    f4p.remove(i);
                    HP-=8;
                    score -= 19;
                }
            }
        }else{
            g.drawImage(Jungle.getImage(),0, 0,1000,800, this);
            g.drawImage(Basket.getImage(),basket_x, 550,150,125, this);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,30));
            g.setColor(Color.WHITE);
            g.drawString("SCORE="+score,50, 70);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,30));
            g.drawString("Fruit collected="+count,600, 70);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,50));
            g.drawString("Time:"+time,360,70);
            g.setFont(new Font("Candara Light",Font.CENTER_BASELINE,30));
            g.drawString("HP= "+HP,210, 70);
            //apple
            for(int i=0 ; i<f1.size();i++){
                g.drawImage( f1.get(i).getImage() ,f1.get(i).getX(),f1.get(i).getY(),90,90,this);
            }
            for(int i=0 ; i<f1.size();i++){
                if(getbound().intersects(f1.get(i).getbound())){
                    f1.remove(i);
                    count++;
                    score += 5;
                }
            }
            //banana
            for(int i=0 ; i<f2.size();i++){
                g.drawImage( f2.get(i).getImage() ,f2.get(i).getX(),f2.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f2.size();i++){
                if(getbound().intersects(f2.get(i).getbound())){
                    f2.remove(i);
                    count++;
                    score += 2;
                }
            }
            //melon
            for(int i=0 ; i<f3.size();i++){
                g.drawImage( f3.get(i).getImage() ,f3.get(i).getX(),f3.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f3.size();i++){
                if(getbound().intersects(f3.get(i).getbound())){
                    f3.remove(i);
                    count++;
                    score += 9;
                }
            }
            //orange
            for(int i=0 ; i<f4.size();i++){
                g.drawImage( f4.get(i).getImage() ,f4.get(i).getX(),f4.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f4.size();i++){
                if(getbound().intersects(f4.get(i).getbound())){
                    f4.remove(i);
                    count++;
                    score += 17;
                }
            }
            //Rapple
            for(int i=0 ; i<f1p.size();i++){
                g.drawImage( f1p.get(i).getImage() ,f1p.get(i).getX(),f1p.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f1p.size();i++){
                if(getbound().intersects(f1p.get(i).getbound())){
                    f1p.remove(i);
                    HP-=5;
                    score -= 6;
                }
            }
            //Rbanana
            for(int i=0 ; i<f2p.size();i++){
                g.drawImage( f2p.get(i).getImage() ,f2p.get(i).getX(),f2p.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f2p.size();i++){
                if(getbound().intersects(f2p.get(i).getbound())){
                    f2p.remove(i);
                    HP-=6;
                    score -= 5;
                }
            }
            //Rmelon
            for(int i=0 ; i<f3p.size();i++){
                g.drawImage( f3p.get(i).getImage() ,f3p.get(i).getX(),f3p.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f3p.size();i++){
                if(getbound().intersects(f3p.get(i).getbound())){
                    f3p.remove(i);
                    HP-=7;
                    score -= 10;
                }
            }
            //Rorange
            for(int i=0 ; i<f4p.size();i++){
                g.drawImage( f4p.get(i).getImage() ,f4p.get(i).getX(),f4p.get(i).getY(),100,100,this);
            }
            for(int i=0 ; i<f4p.size();i++){
                if(getbound().intersects(f4p.get(i).getbound())){
                    f4p.remove(i);
                    HP-=8;
                    score -= 19;
                }
            }
        }
    }
}
