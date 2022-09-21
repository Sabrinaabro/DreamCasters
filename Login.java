import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JPanel jp=new JPanel();
        jp.setBackground(new Color(131,193,233));
        jp.setBounds(0,0,400,400);
        jp.setLayout(null);
        add(jp);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(100,80,200,200);
        jp.add(image);

        JPanel jp2=new JPanel();
        jp2.setLayout(null);
        jp2.setBounds(400,30,450,300);
        add(jp2);

        JLabel username=new JLabel("Username:");
        username.setBounds(60,20,100,25);
        username.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        jp2.add(username);

        JTextField jtfusername=new JTextField();
        jtfusername.setBounds(60,60,300,30);
        jtfusername.setBorder(BorderFactory.createEmptyBorder());
        jp2.add(jtfusername);

        JLabel password=new JLabel("Password:");
        password.setBounds(60,110,100,25);
        password.setFont(new Font("SAN SERIF",Font.PLAIN,20));
        jp2.add(password);

        JTextField jtfpassword=new JTextField();
        jtfpassword.setBounds(60,150,300,30);
        jtfpassword.setBorder(BorderFactory.createEmptyBorder());
        jp2.add(jtfpassword);

        JButton login=new JButton("Login");
        login.setBounds(60,200,130,30);
        login.setBackground(new Color(154, 187, 218, 255));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133,193,233)));
        jp2.add(login);

        JButton signup=new JButton("Signup");
        signup.setBounds(230,200,130,30);
        signup.setBackground(new Color(154, 187, 218, 255));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133,193,233)));
        jp2.add(signup);

        JButton fpassword=new JButton("Forget Password");
        fpassword.setBounds(130,250,130,30);
        fpassword.setBackground(new Color(154, 187, 218, 255));
        fpassword.setForeground(Color.WHITE);
        fpassword.setBorder(new LineBorder(new Color(133,193,233)));
        jp2.add(fpassword);

        JLabel text=new JLabel("Trouble in Login...");
        text.setBounds(300,250,150,20);
        text.setForeground(new Color(175, 15, 15));
        jp2.add(text);


        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();         //annonymous object
    }
}
