package Inventory;
import java.sql.*;

public class ResultSetMetaData_Class {
    public static void main(String args[]) throws SQLException {
        Connection conn = null;
        jdbc_Connect_Class obj;
        try {
            obj = new jdbc_Connect_Class();
            conn = obj.connect();
            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery("Select * from student_detail");

            ResultSetMetaData rsmd = result.getMetaData();

            System.out.println("Total Columns : "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st Column :"+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 2nd Column : "+rsmd.getColumnTypeName(2));
            System.out.println("Name of the Table : "+rsmd.getTableName(1));

            while(result.next()){
                System.out.println(result.getInt("st_id")+" "+result.getString("name")+" "+result.getString("course"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            conn.close();
            System.out.println("Connection closed");
        }
    }


}
