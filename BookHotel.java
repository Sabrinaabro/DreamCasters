import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;
public class BookHotel extends JFrame implements ActionListener {
    Choice chotel,cac,cfood;
    JTextField tfperson,tfdays;
    String Username;
    JLabel labelusername,labelid,labelnum,labelphone,labeltotal;
    JButton checkprice,bookhotel,back;
    BookHotel(String Username){
        this.Username=Username;
        setBounds(300,150,1100,600);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel text=new JLabel("BOOK HOTEL");
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

        JLabel lblsp=new JLabel("Select Hotel");
        lblsp.setBounds(40,110,150,20);
        lblsp.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblsp);

        chotel=new Choice();
        chotel.setBounds(250,110,100,20);
        add(chotel);
        try{
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
            }
        }catch(Exception e){

        }

        JLabel lblnumber=new JLabel("Total Persons");
        lblnumber.setBounds(40,150,150,25);
        lblnumber.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnumber);

        tfperson=new JTextField("1");
        tfperson.setBounds(250,150,200,25);
        add(tfperson);

        JLabel lbldays=new JLabel("No. of Days");
        lbldays.setBounds(40,190,150,25);
        lbldays.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbldays);

        tfdays=new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);

        JLabel lblac=new JLabel("AC/NON-AC Rooms");
        lblac.setBounds(40,230,150,25);
        lblac.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblac);

        cac=new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,200,20);
        add(cac);

        JLabel lblfood=new JLabel("Food Service");
        lblfood.setBounds(40,270,150,25);
        lblfood.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblfood);

        cfood=new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add(cfood);

        JLabel lblid=new JLabel("Id");
        lblid.setBounds(40,310,150,20);
        lblid.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblid);

        labelid=new JLabel();
        labelid.setBounds(250,310,200,25);
        add(labelid);

        JLabel lblnum=new JLabel("Number");
        lblnum.setBounds(40,350,150,25);
        lblnum.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblnum);

        labelnum=new JLabel();
        labelnum.setBounds(250,350,150,25);
        add(labelnum);

        JLabel lblphone=new JLabel("Phone");
        lblphone.setBounds(40,390,150,20);
        lblphone.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lblphone);

        labelphone=new JLabel();
        labelphone.setBounds(250,390,200,25);
        add(labelphone);

        JLabel lbltotal=new JLabel("Total Price");
        lbltotal.setBounds(40,430,150,25);
        lbltotal.setFont(new Font("Tahoma",Font.PLAIN,16));
        add(lbltotal);

        labeltotal=new JLabel();
        labeltotal.setBounds(250,430,150,25);
        add(labeltotal);

        try{
            Conn con=new Conn();
            String query="select * from customer where Username = '"+Username+"'";
            ResultSet rs=con.s.executeQuery(query);
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
        checkprice.setBounds(60,490,120,25);
        checkprice.setForeground(Color.WHITE);
        checkprice.setBackground(Color.BLACK);
        checkprice.addActionListener(this);
        add(checkprice);

        bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(200,490,120,25);
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setBackground(Color.BLACK);
        bookhotel.addActionListener(this);
        add(bookhotel);

        back=new JButton("Back");
        back.setBounds(340,490,120,25);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(500,50,600,400);
        add(image);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==checkprice){
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery("select * from hotel where name='" + chotel.getSelectedItem() + "'");
                while(rs.next()){
                    int cost=Integer.parseInt(rs.getString("costperperson"));
                    int ac=Integer.parseInt(rs.getString("acroom"));
                    int food=Integer.parseInt(rs.getString("foodincluded"));

                    int persons=Integer.parseInt(tfperson.getText());
                    int days=Integer.parseInt(tfdays.getText());

                    String acselected=cac.getSelectedItem();
                    String foodselected=cfood.getSelectedItem();

                    if(persons * days > 0){
                        int total=0;
                        total += acselected.equals("AC") ? ac : 0;
                        total += foodselected.equals("Yes") ? food : 0;
                        total +=cost;   //cost per person per day
                        total=total*persons*days;
                        labeltotal.setText("Rs" + total);
                    }else{
                        JOptionPane.showMessageDialog(null,"Enter a Valid Number");
                    }
                }
        }catch (Exception e){
            e.printStackTrace();
        }
    } else if (ae.getSource()==bookhotel) {
            try{
                Conn con=new Conn();
                String query="insert into bookhotel values('"+labelusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfperson.getText()+"','"+tfdays.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+labelid.getText()+"','"+labelnum.getText()+"','"+labelphone.getText()+"','"+labeltotal.getText()+"')";
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
                setVisible(false);
            }catch (Exception e){
                e.printStackTrace();
            }
        }else{
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BookHotel("");
    }
}
