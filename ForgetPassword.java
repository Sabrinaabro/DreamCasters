import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {

    JTextField tfusername,tfname,tfquestion,tfanswer,tfpassword;
    JButton search,retrieve,back;
    ForgetPassword(){
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forget.png"));
        Image i2=i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(600,70,200,200);
        add(image);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);

        JLabel username=new JLabel("Username");
        username.setBounds(40,20,100,25);
        username.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(username);

        tfusername=new JTextField();
        tfusername.setBounds(220,20,150,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        search=new JButton("Search");
        search.setBounds(380,20,100,25);
        search.setBackground(Color.gray);
        search.setForeground(Color.WHITE);
        search.addActionListener(this);
        p1.add(search);

        JLabel name=new JLabel("Name");
        name.setBounds(40,60,100,25);
        name.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(name);

        tfname=new JTextField();
        tfname.setBounds(220,60,150,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel question=new JLabel("Security Question");
        question.setBounds(40,100,100,25);
        question.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(question);

        tfquestion=new JTextField();
        tfquestion.setBounds(220,100,150,25);
        tfquestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfquestion);

        JLabel answer=new JLabel("Answer");
        answer.setBounds(40,140,150,25);
        answer.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(answer);

        tfanswer=new JTextField();
        tfanswer.setBounds(220,140,150,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        retrieve=new JButton("Retrieve");
        retrieve.setBounds(380,140,100,25);
        retrieve.setBackground(Color.gray);
        retrieve.setForeground(Color.WHITE);
        retrieve.addActionListener(this);
        p1.add(retrieve);

        JLabel password=new JLabel("Password");
        password.setBounds(40,180,150,25);
        password.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(password);

        tfpassword=new JTextField();
        tfpassword.setBounds(220,180,150,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        back=new JButton("Back");
        back.setBounds(150,230,100,25);
        back.setBackground(Color.gray);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        p1.add(back);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==search){
            try{
                String query="Select * from account where username='"+tfusername.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while (rs.next()){
                    tfname.setText(rs.getString("name"));
                    tfquestion.setText(rs.getString("Security"));
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        } else if (ae.getSource()==retrieve) {
            try{
                String query="Select * from account where answer='"+tfanswer.getText()
                        +"' And username='"+tfusername.getText()+"'";
                Conn c=new Conn();
                ResultSet rs=c.s.executeQuery(query);
                while (rs.next()){
                    tfpassword.setText(rs.getString("Password"));
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        }else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new ForgetPassword();

    }
}
