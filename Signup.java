import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;

public class Signup extends JFrame implements ActionListener {

    JButton create,back;
    JTextField jtfusername,jtfname,jtfpassword,jtfanswer;
    Choice securee;
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

        jtfusername=new JTextField();
        jtfusername.setBounds(190,20,180,25);
        jtfusername.setBorder(BorderFactory.createEmptyBorder());
        j1.add(jtfusername);

        JLabel name=new JLabel("Name:");
        name.setBounds(50,60,125,25);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(name);

        jtfname=new JTextField();
        jtfname.setBounds(190,60,180,25);
        jtfname.setBorder(BorderFactory.createEmptyBorder());
        j1.add(jtfname);

        JLabel password=new JLabel("Password:");
        password.setBounds(50,100,125,25);
        password.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(password);

        jtfpassword=new JTextField();
        jtfpassword.setBounds(190,100,180,25);
        jtfpassword.setBorder(BorderFactory.createEmptyBorder());
        j1.add(jtfpassword);

        JLabel security=new JLabel("Security Question");
        security.setBounds(50,140,125,25);
        security.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(security);

        securee=new Choice();
        securee.add("Favourite character from Stranger Things");
        securee.add("Favourite Marvel Series");
        securee.add("Favourite Colour");
        securee.add("Your Lucky Number");
        securee.setBounds(190,140,180,25);
        j1.add(securee);

        JLabel answer=new JLabel("Answer:");
        answer.setBounds(50,180,125,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        j1.add(answer);

        jtfanswer=new JTextField();
        jtfanswer.setBounds(190,180,180,25);
        jtfanswer.setBorder(BorderFactory.createEmptyBorder());
        j1.add(jtfanswer);

        create=new JButton("Create");
        create.setBounds(80,250,100,30);
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));;
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.addActionListener(this);
        j1.add(create);

        back=new JButton("Back");
        back.setBounds(250,250,100,30);
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.addActionListener(this);
        j1.add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.jpg"));
        Image i2=i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(560,50,250,250);
        add(image);


        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create){
            String Username=jtfusername.getText();
            String name=jtfname.getText();
            String password=jtfpassword.getText();
            String secure=securee.getSelectedItem();
            String answer=jtfanswer.getText();


            try{
                String query="insert into account values('"+Username+"', '"+name+"','"+password+"','"+secure+"','"+answer+"')";
                Conn con=new Conn();

                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Account Created Successfully");

                setVisible(false);
                new Login();

            }catch (Exception e){
                e.printStackTrace();
            }

        }else if (ae.getSource() == back) {
            setVisible(false);
            new Login();

        }

    }


    public static void main(String[] args) {
        new Signup();
    }
}
