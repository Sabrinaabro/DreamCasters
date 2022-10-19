import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection c;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem"
                    ,"root","Foodislove14");

            s=c.createStatement();

        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
