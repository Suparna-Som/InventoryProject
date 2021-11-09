package Inventory;
import java.io.IOException;
import java.sql.*;
public class MainClass {
    public static void main(String args[]) throws SQLException, IOException {
        //Operations_Suppliers operationsSuppliers = new Operations_Suppliers();
        //operations.insert_func();
        //operationsSuppliers.select_fun();
        //operations.update_func();
        //operations.delete_func();
        Operations_Order operations_order = new Operations_Order();
        //operations_order.insert_func();
        //operations_order.select_fun();
        //operations_order.update_func();
        operations_order.delete_func();

       }
}
