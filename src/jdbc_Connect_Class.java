import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_Connect_Class {
    public static Connection connect(){
        Connection conn = null;
         Credentials obj1=new Credentials();
         String DB_URL = obj1.url;
         String USER = obj1.user;
         String PASS = obj1.pass;
         try{
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            }
        catch(SQLException e){
            System.out.println("Connection Failed!");
            e.printStackTrace();
            return null;
        }
        if(conn != null){
            System.out.println("Connection working");
        }
        else
        {
            System.out.println("Connection not working");
        }
        return conn;
    }
}
