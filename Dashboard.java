import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton adddetails,checkpackage,bookpackage,destinations,viewbookedhotel,calculator,deletedetails;
    String Username;
    JButton viewdetails,updatedetails,viewpackage,viewhotels,bookhotel,payment,notepad,about;


    Dashboard(String Username){
        this.Username=Username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,53);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(4,0,70,65);
        p1.add(icon);

        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD , 30));
        p1.add(heading);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,53,300,900);
        add(p2);

        adddetails=new JButton("Add Personal Details");
        adddetails.setBounds(0,0,300,50);
        adddetails.setBackground(new Color(0,0,102));
        adddetails.setForeground(Color.white);
        adddetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        adddetails.setMargin(new Insets(0,0,0,60));
        adddetails.addActionListener(this);
        p2.add(adddetails);

        updatedetails=new JButton("Update Personal Details");
        updatedetails.setBounds(0,50,300,50);
        updatedetails.setBackground(new Color(0,0,102));
        updatedetails.setForeground(Color.white);
        updatedetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatedetails.setMargin(new Insets(0,0,0,30));
        updatedetails.addActionListener(this);
        p2.add(updatedetails);

        viewdetails=new JButton("View Personal Details");
        viewdetails.setBounds(0,100,300,50);
        viewdetails.setBackground(new Color(0,0,102));
        viewdetails.setForeground(Color.white);
        viewdetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewdetails.setMargin(new Insets(0,0,0,50));
        viewdetails.addActionListener(this);
        p2.add(viewdetails);

        deletedetails=new JButton("Delete Personal Details");
        deletedetails.setBounds(0,150,300,50);
        deletedetails.setBackground(new Color(0,0,102));
        deletedetails.setForeground(Color.white);
        deletedetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletedetails.setMargin(new Insets(0,0,0,40));
        deletedetails.addActionListener(this);
        p2.add(deletedetails);

        checkpackage=new JButton("Check Package");
        checkpackage.setBounds(0,200,300,50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground(Color.white);
        checkpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackage.setMargin(new Insets(0,0,0,100));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);

        bookpackage=new JButton("Book Package");
        bookpackage.setBounds(0,250,300,50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.white);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,110));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);

        viewpackage=new JButton("View Package");
        viewpackage.setBounds(0,300,300,50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);

        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

        bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.white);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);

        viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.white);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);

        destinations=new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        destinations.addActionListener(this);
        p2.add(destinations);

        payment=new JButton("Payment");
        payment.setBounds(0,550,300,50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.white);
        payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,155));
        payment.addActionListener(this);
        p2.add(payment);

        calculator=new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.white);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        calculator.addActionListener(this);
        p2.add(calculator);

        notepad=new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        notepad.addActionListener(this);
        p2.add(notepad);

        about=new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        about.addActionListener(this);
        p2.add(about);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);

        JLabel text=new JLabel("DREAM CASTERS");
        text.setBounds(660,70,1200,70);
        text.setForeground(new Color(9, 28, 121));
        text.setFont(new Font("Monotype Corsiva",Font.BOLD,60));
        image.add(text);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == adddetails){
            new Addcustomer(Username);
        } else if (ae.getSource()==viewdetails) {
            new viewCustomer(Username);
        } else if (ae.getSource() == updatedetails) {
            new updateCustomer(Username);
        } else if (ae.getSource() == checkpackage) {
            new checkPackage();
        } else if (ae.getSource()==bookpackage) {
            new Bookpackage(Username);
        } else if (ae.getSource()==viewpackage) {
            new viewPackage(Username);
        } else if (ae.getSource()==viewhotels) {
            new checkHotels();
        } else if (ae.getSource()==destinations) {
            new Destinations();
        } else if (ae.getSource()==bookhotel) {
            new BookHotel(Username);
        } else if (ae.getSource()==viewbookedhotel) {
            new viewbookedhotel(Username);
        } else if (ae.getSource()==payment) {
            new payment();
        } else if (ae.getSource()==calculator) {
            try{
                Runtime.getRuntime().exec("calc.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource()==notepad) {
            try{
                Runtime.getRuntime().exec("notepad.exe");
            }catch (Exception e){
                e.printStackTrace();
            }
        } else if (ae.getSource()==about) {
            new About();
        } else if (ae.getSource()==deletedetails) {
            new deleteDetails(Username);
        }
    }
    public static void main(String[] args) {
        new Dashboard("");
    }
}
