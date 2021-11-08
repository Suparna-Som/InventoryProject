import java.sql.*;
public class MainClass {
    public static void main(String args[]) throws SQLException {
        Connection conn = null;
        jdbc_Connect_Class conn_obj;
        Query query_obj;
        try{
            conn_obj = new  jdbc_Connect_Class();
            query_obj = new Query();
            conn = conn_obj.connect();
            Statement stmt = conn.createStatement();
            ResultSet result =stmt.executeQuery(query_obj.select);
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
