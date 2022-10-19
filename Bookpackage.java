import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;

public class Bookpackage extends JFrame implements ActionListener {
    Choice cpackage;
    JTextField tfperson;
    String Username;
    JLabel labelusername,labelid,labelnum,labelphone,labeltotal;
    JButton checkprice,bookpackage,back;
    Bookpackage(String Username){
        this.Username=Username;
        setBounds(350,200,1100,500);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text=new JLabel("BOOK PACKAGE");
        text.setBounds(100,10,200,30);
        text.setFont(new Font("Javanese Text",Font.BOLD,20));
        add(text);

        JLabel lblusername=new JLabel("Username");
        lblusername.setBounds(40,70,100,20);
        lblusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblusername);

        labelusername=new JLabel();
        labelusername.setBounds(250,70,200,20);
        labelusername.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(labelusername);

        JLabel lblsp=new JLabel("Select Package");
        lblsp.setBounds(40,110,150,20);
        lblsp.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblsp);

        cpackage=new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250,110,100,20);
        add(cpackage);

        JLabel lblnumber=new JLabel("Total Persons");
        lblnumber.setBounds(40,150,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnumber);

        tfperson=new JTextField("1");
        tfperson.setBounds(250,150,200,25);
        add(tfperson);

        JLabel lblid=new JLabel("Id");
        lblid.setBounds(40,190,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);

        labelid=new JLabel();
        labelid.setBounds(250,190,200,25);
        add(labelid);

        JLabel lblnum=new JLabel("Number");
        lblnum.setBounds(40,230,150,25);
        lblnum.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnum);

        labelnum=new JLabel();
        labelnum.setBounds(250,230,150,25);
        add(labelnum);

        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(40,270,150,20);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblphone);

        labelphone=new JLabel();
        labelphone.setBounds(250,270,200,25);
        add(labelphone);

        JLabel lbltotal=new JLabel("Total Price");
        lbltotal.setBounds(40,310,150,25);
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbltotal);

        labeltotal=new JLabel();
        labeltotal.setBounds(250,310,150,25);
        add(labeltotal);

        try{
            Conn c=new Conn();
            String query="select * from customer where username = '"+Username+"'";
            ResultSet rs=c.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("Username"));
                labelid.setText(rs.getString("id"));
                labelnum.setText(rs.getString("number"));
                labelphone.setText(rs.getString("phone"));
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        checkprice=new JButton("Check Price");
        checkprice.setBounds(60,380,120,25);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBackground(Color.BLACK);
        checkprice.addActionListener(this);
        add(checkprice);

        bookpackage=new JButton("Book Package");
        bookpackage.setBounds(200,380,120,25);
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setBackground(Color.BLACK);
        bookpackage.addActionListener(this);
        add(bookpackage);

        back=new JButton("Back");
        back.setBounds(340,380,120,25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(550,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(550,75,500,300);
        add(image);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            String pack=cpackage.getSelectedItem();
            int cost=0;
            if(pack.equals("Gold Package")){
                cost += 90000;

            } else if (pack.equals("Silver Package")) {
                cost += 70000;
            }else{
                cost += 60000;
            }
            int persons= Integer.parseInt(tfperson.getText());
            cost *=persons;
            labeltotal.setText("Rs" + cost);

        } else if (ae.getSource()==bookpackage) {
            try{
                Conn con=new Conn();
                String query="insert into bookpackage values('"+labelusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfperson.getText()+"','"+labelid.getText()+"','"+labelnum.getText()+"','"+labelphone.getText()+"','"+labeltotal.getText()+"')";

                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Package Booked Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
       new Bookpackage("");
    }
}
