/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.query.SQLQuery;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import model.Customer;

/**
 *
 * @author Admin
 */
public class CustomerDAO extends DBContext {

    public List<Customer> getAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.getAllCustomer());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("customerId");
                String customerName = resultSet.getString("customerName");
                String gender = resultSet.getString("gender");
                Date dateOfBirth = resultSet.getDate("dateOfBirth");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Customer customer = new Customer(customerId, customerName, gender, dateOfBirth, phoneNumber, email, address);
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public boolean updateCustomer(Customer customer) {
        boolean isSuccess = false;
        try {
            PreparedStatement pstmt = connection.prepareStatement(SQLQuery.updateCustomer());
            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getGender());
            pstmt.setDate(3, customer.getDateOfBirth());
            pstmt.setString(4, customer.getPhoneNumber());
            pstmt.setString(5, customer.getEmail());
            pstmt.setString(6, customer.getAddress());
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                isSuccess = true;
            }
            System.out.println("Update Customer Success" + rowsAffected);
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Exception SQL update");
        }
        return isSuccess;
    }

    public boolean addCustomer(Customer customer) {
        boolean isSuccess = false;
        try {
            PreparedStatement pstmt = connection.prepareStatement(SQLQuery.addCustomer());
            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getGender());
            pstmt.setDate(3, customer.getDateOfBirth());
            pstmt.setString(4, customer.getPhoneNumber());
            pstmt.setString(5, customer.getEmail());
            pstmt.setString(6, customer.getAddress());
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                isSuccess = true;
            }
            System.out.println("Insert Customer Success" + rowsAffected);
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Exception SQL add customer");
        }
        return isSuccess;
    }

    public boolean removeCustomer(int id) {
        boolean isSuccess = false;
        try {
            PreparedStatement pst = connection.prepareStatement(SQLQuery.removeCustomerById());
            pst.setInt(1, id);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                isSuccess = true;
            }
        } catch (SQLException e) {
            System.out.println("Remove customer fail");
        }
        return isSuccess;
    }
    
    
}
