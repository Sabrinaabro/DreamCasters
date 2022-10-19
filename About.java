import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame implements ActionListener {

    About(){
        setBounds(600,200,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1=new JLabel("About Project");
        l1.setBounds(180,10,200,40);
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Tahoma",Font.BOLD,20));
        add(l1);

        String about="Dream Casters is basically a tour and tourism management system project\n" +
                "It is a desktop based java application,This application is develop to provide best travelling services to " +
                "the customers and travel agents. We have developed tours and travel management system to provide a " +
                "search platform where a tourist can find their tour places according to their choices. This system also " +
                "helps to promote responsible and interesting tourism so that people can enjoy their holidays at their " +
                "favorable places.\n" +
                "The main objective of this project is to develop a system that automates the processess and activities" +
                "of travel, it gives accurate information, simplifies the manual work, minimizes the documentation" +
                "related work and provides a Friendly-Environment\n" +
                "It is based on GUI Swing and AWT Concepts, MySQL is used for DataBase.";

        TextArea area=new TextArea(about,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,120,450,270);
        area.setFont(new Font("Tahoma",Font.PLAIN,14));
        add(area);

        JButton back=new JButton("Back");
        back.setBounds(200,420,100,25);
        back.addActionListener(this);
        add(back);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args) {
        new About();
    }
}
