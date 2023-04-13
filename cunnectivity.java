
package bank.management.system;
import java.sql.*;
public class cunnectivity {
    Connection c;
    Statement s;
    public cunnectivity(){
        
        try{
         c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Mohit@2003");
         s=c.createStatement();
        }catch(Exception e){
           System.out.print(e);
        }
    }
}
