import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class payment extends JFrame implements ActionListener {
    JButton pay,back;
    payment() {
        setBounds(500,200,800,600);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/payt.jpg"));
        Image i2=i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(0,0,800,600);
        add(icon);

        pay=new JButton("Pay");
        pay.setBounds(20,480,80,40);
        pay.setFont(new Font("Tahoma",Font.PLAIN,16));
        pay.setForeground(new Color(187, 78, 91));
        pay.addActionListener(this);
        icon.add(pay);

        back=new JButton("Back");
        back.setBounds(140,480,80,40);
        back.setFont(new Font("Tahoma",Font.PLAIN,14));
        back.setForeground(new Color(187, 78, 91));
        back.addActionListener(this);
        icon.add(back);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==pay){
            setVisible(false);
            new Paytm();
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new payment();
    }
}
