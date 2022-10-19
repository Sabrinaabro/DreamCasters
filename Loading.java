import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable {
    Thread t;
    JProgressBar bar;
    String Username;
    public void run(){
        try{
            for(int i=0;i<=101;i++){
                int max=bar.getMaximum();    //max value
                int value= bar.getValue();  //gives current value
                if(value<max){ //101<100
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                    new Dashboard(Username);
                }
                Thread.sleep(40);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    Loading(String Username){
        this.Username=Username;

        t=new Thread(this);
        setBounds(500,200,650,400);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text =new JLabel("LET'S TRAVEL");
        text.setBounds(180,20,600,40);
        text.setForeground(new Color(187, 78, 91));
        text.setFont(new Font("Raleway",Font.BOLD,35));
        add(text);

        bar=new JProgressBar();
        bar.setBounds(150,100,300,35);
        bar.setStringPainted(true);
        add(bar);

        JLabel wait =new JLabel("Loading, please wait...");
        wait.setBounds(220,130,190,30);
        wait.setForeground(Color.red);
        wait.setFont(new Font("Raleway",Font.BOLD,16));
        add(wait);

        JLabel welcome =new JLabel("Welcome, "+ Username);
        welcome.setBounds(20,310,400,40);
        welcome.setForeground(new Color(10, 176, 153, 169));
        welcome.setFont(new Font("Raleway",Font.BOLD,16));
        add(welcome);

        t.start();

        setVisible(true);
    }
    public static void main(String[] args) {
        new Loading("");
    }
}
