import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Signup extends JFrame {
    Signup(){
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel j1=new JPanel();
        j1.setBackground(new Color(133,193,233));
        j1.setBounds(0,0,500,400);
        j1.setLayout(null);
        add(j1);

        JLabel username=new JLabel("Username:");
        username.setBounds(50,20,125,25);
        username.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(username);

        JTextField jtfusername=new JTextField();
        jtfusername.setBounds(190,20,180,25);
        jtfusername.setBorder(BorderFactory.createEmptyBorder());
        j1.add(jtfusername);

        JLabel name=new JLabel("Name:");
        name.setBounds(50,60,125,25);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(name);

        JTextField jtfname=new JTextField();
        jtfname.setBounds(190,60,180,25);
        jtfname.setBorder(BorderFactory.createEmptyBorder());
        j1.add(jtfname);

        JLabel password=new JLabel("Password:");
        password.setBounds(50,100,125,25);
        password.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(password);

        JTextField jtfpassword=new JTextField();
        jtfpassword.setBounds(190,100,180,25);
        jtfpassword.setBorder(BorderFactory.createEmptyBorder());
        j1.add(jtfpassword);

        JLabel security=new JLabel("Security Question");
        security.setBounds(50,140,125,25);
        security.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(security);

        Choice secure=new Choice();
        secure.add("Favourite character from Stranger Things");
        secure.add("Favourite Marvel Series");
        secure.add("Favourite Colour");
        secure.add("Your Lucky Number");
        secure.setBounds(190,140,180,25);
        j1.add(secure);

        JLabel answer=new JLabel("Answer:");
        answer.setBounds(50,180,125,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(answer);

        JTextField jtfanswer=new JTextField();
        jtfanswer.setBounds(190,180,180,25);
        jtfanswer.setBorder(BorderFactory.createEmptyBorder());
        j1.add(jtfanswer);

        JButton create=new JButton("Create");
        create.setBounds(80,250,100,30);
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));;
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(create);

        JButton back=new JButton("Back");
        back.setBounds(250,250,100,30);
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.jpg"));
        Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(560,50,250,250);
        add(image);


        setVisible(true);
    }
    public static void main(String[] args) {
        new Signup();
    }
}
