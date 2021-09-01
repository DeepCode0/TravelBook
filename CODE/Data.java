package travelbook;
import java.sql.*;

/*
@author Deepanshu Phogat
 */
public class Data{
    Connection c;
    Statement s;
    public Data(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelbook","root","8094@Mnnit");
           s=c.createStatement();
        }catch(Exception e){
            
        }
    }
}
