import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;

public class Addcustomer extends JFrame implements ActionListener {
    JLabel lblusername,lblname;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone;
    JRadioButton rmale,rfemale;
    JButton add,back;
    Addcustomer(String Username){
        setBounds(450,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel username =new JLabel("Username");
        username.setBounds(30,50,150,25);
        add(username);

        lblusername=new JLabel();
        lblusername.setBounds(220,50,150,25);
        add(lblusername);

        JLabel id =new JLabel("Id");
        id.setBounds(30,90,150,25);
        add(id);

        comboid=new JComboBox(new String[] {"Passport ","ID Card","Ration Card"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.WHITE);
        add(comboid);

        JLabel number=new JLabel("Number");
        number.setBounds(30,130,150,25);
        add(number);

        tfnumber=new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);

        JLabel name=new JLabel("Name");
        name.setBounds(30,170,150,25);
        add(name);

        lblname=new JLabel();
        lblname.setBounds(220,170,150,25);
        add(lblname);

        JLabel gender=new JLabel("Gender");
        gender.setBounds(30,210,150,25);
        add(gender);

        rmale=new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.WHITE);
        add(rmale);

        rfemale=new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.WHITE);
        add(rfemale);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

        JLabel country=new JLabel("Country");
        country.setBounds(30,250,150,25);
        add(country);

        tfcountry=new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);

        JLabel address=new JLabel("Address");
        address.setBounds(30,290,150,25);
        add(address);

        tfaddress=new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);

        JLabel email=new JLabel("Email");
        email.setBounds(30,330,150,25);
        add(email);

        tfemail=new JTextField();
        tfemail.setBounds(220,330,150,25);
        add(tfemail);

        JLabel phone=new JLabel("Phone");
        phone.setBounds(30,370,150,25);
        add(phone);

        tfphone=new JTextField();
        tfphone.setBounds(220,370,150,25);
        add(tfphone);

        add=new JButton("Add");
        add.setBounds(70,430,100,25);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        back=new JButton("Back");
        back.setBounds(220,430,100,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/customer.jpg"));
        Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(440,50,350,400);
        add(image);

        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from account where username = '"+Username+"'");
        while(rs.next()){
            lblusername.setText(rs.getString("Username"));
            lblname.setText(rs.getString("name"));

        }
        }catch (Exception e){
        e.printStackTrace();
        }

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String Username = lblusername.getText();
            String id = (String) comboid.getSelectedItem();
            String number = tfnumber.getText();
            String name = lblname.getText();
            String gender = null;
            if (rmale.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            String country=tfcountry.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();

            try{
                Conn c=new Conn();
                String query="insert into customer values('"+Username+"','"+id+"','"+number+"','"+name+"','"+gender+"', +'"+country+"','"+address+"','"+phone+"','"+email+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Added Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Addcustomer("");
    }
}
