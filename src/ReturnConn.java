import java.sql.*;
public class ReturnConn {
    public static void main(String args[]) throws SQLException {
        Connection conn = null;
        jdbc_Connect_Class obj;
        try{
            obj = new  jdbc_Connect_Class();
            conn = obj.connect();
            Statement stmt = conn.createStatement();
            ResultSet result =stmt.executeQuery("Select * from student_detail");
            while(result.next()){
                System.out.println(result.getInt("st_id")+" "+result.getString("name")+" "+result.getString("course"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            conn.close();
            System.out.println("Connection closed");
        }
    }
}
