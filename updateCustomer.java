import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class updateCustomer extends JFrame implements ActionListener {
    JLabel lblusername,lblname;
    JComboBox comboid;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphone,tfid,tfgender;
    JRadioButton rmale,rfemale;
    JButton add,back;
    updateCustomer(String Username){
        setBounds(500,200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text=new JLabel("UPDATE CUSTOMER DETAILS");
        text.setBounds(50,0,300,25);
        text.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(text);

        JLabel username =new JLabel("Username");
        username.setBounds(30,50,150,25);
        add(username);

        lblusername=new JLabel();
        lblusername.setBounds(220,50,150,25);
        add(lblusername);

        JLabel id =new JLabel("Id");
        id.setBounds(30,90,150,25);
        add(id);

        tfid=new JTextField();
        tfid.setBounds(220,90,150,25);
        add(tfid);

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

        tfgender=new JTextField();
        tfgender.setBounds(220,210,150,25);
        add(tfgender);

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

        add=new JButton("Update");
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

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/customerr.jpg"));
        Image i2=i1.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(440,50,350,400);
        add(image);

        try{
            Conn c=new Conn();
            ResultSet rs=c.s.executeQuery("select * from customer where Username = '"+Username+"'");
            while(rs.next()){
                lblusername.setText(rs.getString("Username"));
                lblname.setText(rs.getString("name"));
                tfid.setText(rs.getString("id"));
                tfnumber.setText(rs.getString("number"));
                tfgender.setText(rs.getString("gender"));
                tfcountry.setText(rs.getString("country"));
                tfaddress.setText(rs.getString("address"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String Username = lblusername.getText();
            String id = tfid.getText();
            String number = tfnumber.getText();
            String name = lblname.getText();
            String gender = tfgender.getText();
            String country=tfcountry.getText();
            String address=tfaddress.getText();
            String phone=tfphone.getText();
            String email=tfemail.getText();

            try{
                Conn c=new Conn();
                String query="update customer set Username ='"+Username+"',id ='"+id+"',number ='"+number+"',name ='"+name+"',gender ='"+gender+"',country ='"+country+"',address ='"+address+"',phone ='"+phone+"',email ='"+email+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new updateCustomer("");
    }
}
