import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_Connect_Class {
    public static Connection connect(){
        Connection conn = null;
         Credentials cerdential_obj=new Credentials();
         String DB_URL = cerdential_obj.url;
         String USER = cerdential_obj.user;
         String PASS = cerdential_obj.pass;
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
