import javax.swing.*;
import java.awt.*;

public class checkPackage extends JFrame {
    checkPackage(){
        setBounds(450,200,900,600);

        String[] package1={"GOLD PACKAGE","-6 Days and 7 Nights","-Airport Assistance","-Sky diving"
        ,"-Daily Buffet","-Luxury Hotels","-Island Cruising","-Tourist Guide","BOOK NOW!","SUMMER SPECIAL"
                ,"90000/-per person","package1.jpg"};
        String[] package2={"SILVER PACKAGE","-7 Days and 8 Nights","-Airlline Ticketing ","-Renting Car"
                ,"-BBQ Nights","-Hotel Booking","-BornFire","-Parachuting","BOOK NOW!","WINTER SPECIAL"
                ,"70000/-per person","package2.jpg"};
        String[] package3={"BRONZE PACKAGE","-9 Days and 10 Nights","-Free Transport","-Country side Tour"
                ,"-Dinner","-Free Entrance Tickets","-Hiking","-A Guide","BOOK NOW!","Season Special"
                ,"60000/-per person","package3.jpg"};

        JTabbedPane tab=new JTabbedPane();

        JPanel p1=createpackage(package1);
        tab.addTab("Package1",null,p1);

        JPanel p2=createpackage(package2);
        tab.addTab("Package2",null,p2);

        JPanel p3=createpackage(package3);
        tab.addTab("Package3",null,p3);
        add(tab);


        setVisible(true);}
    public JPanel createpackage(String[] pack){
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(85, 153, 248));

        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(50,5,300,30);
        l1.setForeground(new Color(0, 67, 190));
        l1.setFont(new Font("Comic Sans MS Bold Italic",Font.BOLD,30));
        p1.add(l1);

        JLabel l2=new JLabel(pack[1]);
        l2.setBounds(30,60,300,30);
        l2.setForeground(new Color(195, 210, 245, 255));
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l2);

        JLabel l3=new JLabel(pack[2]);
        l3.setBounds(30,110,300,30);
        l3.setForeground(new Color(195, 210, 245, 255));
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l3);

        JLabel l4=new JLabel(pack[3]);
        l4.setBounds(30,160,300,30);
        l4.setForeground(new Color(195, 210, 245, 255));
        l4.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l4);

        JLabel l5=new JLabel(pack[4]);
        l5.setBounds(30,210,300,30);
        l5.setForeground(new Color(195, 210, 245, 255));
        l5.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l5);

        JLabel l6=new JLabel(pack[5]);
        l6.setBounds(30,260,300,30);
        l6.setForeground(new Color(195, 210, 245, 255));
        l6.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l6);

        JLabel l7=new JLabel(pack[6]);
        l7.setBounds(30,310,300,30);
        l7.setForeground(new Color(195, 210, 245, 255));
        l7.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l7);

        JLabel l8=new JLabel(pack[7]);
        l8.setBounds(30,360,300,30);
        l8.setForeground(new Color(195, 210, 245, 255));
        l8.setFont(new Font("Tahoma",Font.BOLD,20));
        p1.add(l8);

        JLabel l9=new JLabel(pack[8]);
        l9.setBounds(60,430,300,30);
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Segoe Script",Font.BOLD,30));
        p1.add(l9);

        JLabel l10=new JLabel(pack[9]);
        l10.setBounds(80,480,300,30);
        l10.setForeground(Color.YELLOW);
        l10.setFont(new Font("Ink Free",Font.BOLD,25));
        p1.add(l10);

        JLabel l11=new JLabel(pack[10]);
        l11.setBounds(500,400,300,40);
        l11.setForeground(new Color(136, 8, 46));
        l11.setFont(new Font("Tahoma",Font.BOLD,25));
        p1.add(l11);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2=i1.getImage().getScaledInstance(500,300,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(350,30,500,350);
        p1.add(icon);

        return p1;
    }

    public static void main(String[] args) {
       new checkPackage();
    }
}
