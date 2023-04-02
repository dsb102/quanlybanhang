/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.query;

/**
 *
 * @author Admin
 */
public class SQLQuery {

    public static String getCustomerById() {
        return "SELECT * FROM Customer WHERE customerId = ?";
    }
    
    public static String getAllCustomer() {
        return "SELECT * FROM Customer WHERE status = 1";
    }
    
    public static String removeCustomerById() {
        return "UPDATE Customer SET stauts = 0 WHERE customerId = ?";
    }
    
    public static String updateCustomer() {
        return "UPDATE Customer SET customerName = ?, gender = ?, dateOfBirth = ?, phoneNumber = ?, email = ?, address = ?";
    }
    
    public static String addCustomer() {
        return "INSERT INTO Customer VALUES (1, ?, ?, ?, ? ,?, ?)";
    }

    public static String getAllEmployee() {
        return "SELECT * FROM Employee";
    }

    public static String getAllShipper() {
        return "SELECT * FROM Shipper";
    }

    public static String getAllProduct() {
        return "SELECT * FROM Product";
    }
}
