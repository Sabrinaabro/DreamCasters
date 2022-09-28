import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    Dashboard(){
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0,0,1600,65);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(4,0,70,70);
        p1.add(icon);

        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD , 30));
        p1.add(heading);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0,65,300,900);
        add(p2);

        JButton adddetails=new JButton("Add Personal Details");
        adddetails.setBounds(0,0,300,50);
        adddetails.setBackground(new Color(0,0,102));
        adddetails.setForeground(Color.white);
        adddetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        adddetails.setMargin(new Insets(0,0,0,60));
        p2.add(adddetails);

        JButton updatedetails=new JButton("Update Personal Details");
        updatedetails.setBounds(0,50,300,50);
        updatedetails.setBackground(new Color(0,0,102));
        updatedetails.setForeground(Color.white);
        updatedetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatedetails.setMargin(new Insets(0,0,0,30));
        p2.add(updatedetails);

        JButton viewdetails=new JButton("View Personal Details");
        viewdetails.setBounds(0,100,300,50);
        viewdetails.setBackground(new Color(0,0,102));
        viewdetails.setForeground(Color.white);
        viewdetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewdetails.setMargin(new Insets(0,0,0,50));
        p2.add(viewdetails);

        JButton deletedetails=new JButton("Delete Personal Details");
        deletedetails.setBounds(0,150,300,50);
        deletedetails.setBackground(new Color(0,0,102));
        deletedetails.setForeground(Color.white);
        deletedetails.setFont(new Font("Tahoma",Font.PLAIN,20));
        deletedetails.setMargin(new Insets(0,0,0,40));
        p2.add(deletedetails);

        JButton checkpackage=new JButton("Check Package");
        checkpackage.setBounds(0,200,300,50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground(Color.white);
        checkpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackage.setMargin(new Insets(0,0,0,100));
        p2.add(checkpackage);

        JButton bookpackage=new JButton("Book Package");
        bookpackage.setBounds(0,250,300,50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.white);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0,0,0,110));
        p2.add(bookpackage);

        JButton viewpackage=new JButton("View Package");
        viewpackage.setBounds(0,300,300,50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0,0,0,120));
        p2.add(viewpackage);

        JButton viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,350,300,50);
        viewhotels.setBackground(new Color(0,0,102));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotels.setMargin(new Insets(0,0,0,130));
        p2.add(viewhotels);

        JButton bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0,400,300,50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.white);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0,0,0,140));
        p2.add(bookhotel);

        JButton viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,450,300,50);
        viewbookedhotel.setBackground(new Color(0,0,102));
        viewbookedhotel.setForeground(Color.white);
        viewbookedhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookedhotel.setMargin(new Insets(0,0,0,70));
        p2.add(viewbookedhotel);

        JButton destinations=new JButton("Destinations");
        destinations.setBounds(0,500,300,50);
        destinations.setBackground(new Color(0,0,102));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Tahoma",Font.PLAIN,20));
        destinations.setMargin(new Insets(0,0,0,125));
        p2.add(destinations);

        JButton payment=new JButton("Payment");
        payment.setBounds(0,550,300,50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.white);
        payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,155));
        p2.add(payment);

        JButton calculator=new JButton("Calculator");
        calculator.setBounds(0,600,300,50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.white);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0,0,0,145));
        p2.add(calculator);

        JButton notepad=new JButton("Notepad");
        notepad.setBounds(0,650,300,50);
        notepad.setBackground(new Color(0,0,102));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notepad.setMargin(new Insets(0,0,0,155));
        p2.add(notepad);

        JButton about=new JButton("About");
        about.setBounds(0,700,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.white);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,175));
        p2.add(about);

        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);

        JLabel text=new JLabel("Travel and Tourism Management System");
        text.setBounds(380,70,1200,70);
        text.setForeground(new Color(255, 255, 255));
        text.setFont(new Font("Raleway",Font.BOLD,55));
        image.add(text);

        setVisible(true);

    }
    public static void main(String[] args) {
        new Dashboard();
    }
}
