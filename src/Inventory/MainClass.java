package Inventory;
import java.io.IOException;
import java.sql.*;
public class MainClass {
    public static void main(String args[]) throws SQLException, IOException {
        Operations operations = new Operations();
        //operations.insert_func();
        operations.select_fun();
        //operations.update_func();
        //operations.delete_func();

       }
}
