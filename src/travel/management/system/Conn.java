
package travel.management.system;
import java.sql.*;

public class Conn {
    // 2.create connection
    Connection c;
    //3.create statement
    Statement s;
    public Conn(){
        try{
            //1. registering the mysql driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/tms","root","1234");
            //3.
            s=c.createStatement();
         //   System.out.println("ddd");
        }catch(Exception e){
            
        }
    }
}
