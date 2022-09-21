import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable{
    Thread thread;
    Splash(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/plane.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        thread=new Thread(this);
        thread.start();

    }
    public void run(){
        try{
            Thread.sleep(5000);
            //new Login();
            setVisible(false);

        }catch(Exception e){

        }

    }
    public static void main(String[] args){
        Splash frame=new Splash();
        frame.setVisible(true);
        int x=1;
        for (int i = 0; i <= 500;x+=7, i+=6) {
            frame.setLocation(250,200);
            frame.setSize(x+i,i);
        }
        try{
            Thread.sleep(50);
        }
        catch(Exception e){

        }
    }

}

