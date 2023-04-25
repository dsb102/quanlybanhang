/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.query.SQLQuery;

import java.sql.*;
import java.util.ArrayList;
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
            if (connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, password);
            }
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
    
    public Customer findCustomerById(int id) {
        try {
            if (connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, password);
            }
            PreparedStatement pstm = connection.prepareStatement(SQLQuery.getCustomerById());
            pstm.setInt(1, id);
            ResultSet resultSet = pstm.executeQuery();
            if (resultSet.next()) {
                int customerId = resultSet.getInt("customerId");
                String customerName = resultSet.getString("customerName");
                String gender = resultSet.getString("gender");
                Date dateOfBirth = resultSet.getDate("dateOfBirth");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                Customer customer = new Customer(customerId, customerName, gender, dateOfBirth, phoneNumber, email, address);
                return customer;
            }
            return null;
        } catch (SQLException exception) {
            exception.printStackTrace();
//            System.out.println("Tim that bai co loi SQL xay ra");
        }

        return null;
    }

    public boolean updateCustomer(Customer customer) {
        boolean isSuccess = false;
        try {
            if (connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, password);
            }
            PreparedStatement pstmt = connection.prepareStatement(SQLQuery.updateCustomer());
            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getGender());
            pstmt.setDate(3, customer.getDateOfBirth());
            pstmt.setString(4, customer.getPhoneNumber());
            pstmt.setString(5, customer.getEmail());
            pstmt.setString(6, customer.getAddress());
            pstmt.setInt(7, customer.getCustomerId());
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                isSuccess = true;
            }
//            System.out.println("Update Customer Success" + rowsAffected);
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
//            System.out.println("Exception SQL update");
        }
        return isSuccess;
    }

    public boolean addCustomer(Customer customer) {
        boolean isSuccess = false;
        try {
            if (connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, password);
            }
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
//            System.out.println("Insert Customer Success" + rowsAffected);
            pstmt.close();
            connection.close();
        } catch (SQLException e) {
//            System.out.println("Exception SQL add customer");
        }
        return isSuccess;
    }

    public int addCustomerReturnId(Customer customer) {
        try {
            if (connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, password);
            }
            PreparedStatement pstmt = connection.prepareStatement(SQLQuery.addCustomer(), Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, customer.getCustomerName());
            pstmt.setString(2, customer.getGender());
            pstmt.setDate(3, customer.getDateOfBirth());
            pstmt.setString(4, customer.getPhoneNumber());
            pstmt.setString(5, customer.getEmail());
            pstmt.setString(6, customer.getAddress());
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                return -1;
            }

            ResultSet generatedKeys = pstmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("Creating customer failed, no ID obtained.");
            }
//            System.out.println("Insert Customer Success" + rowsAffected);

        } catch (SQLException e) {
//            System.out.println("Exception SQL add customer");
        }
        return -1;
    }

    public boolean removeCustomer(int id) {
        boolean isSuccess = false;
        try {
            if (connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, password);
            }
            PreparedStatement pst = connection.prepareStatement(SQLQuery.removeCustomerById());
            pst.setInt(1, id);
            int rowsAffected = pst.executeUpdate();
            if (rowsAffected > 0) {
                isSuccess = true;
            }
        } catch (SQLException e) {
//            System.out.println("Remove customer fail");
        }
        return isSuccess;
    }

    public int countCustomerActive() {
        int count = 0;
        try {
            if (connection.isClosed()) {
                connection = DriverManager.getConnection(url, user, password);
            }
            PreparedStatement pstm = connection.prepareStatement("SELECT COUNT(*) as total FROM Customer WHERE STATUS = 1");
            ResultSet resultSet = pstm.executeQuery();
            if (resultSet.next()) {
                count = resultSet.getInt("total");

                return count;
            }
            return count;
        } catch (SQLException exception) {
            exception.printStackTrace();
//            System.out.println("Tim that bai co loi SQL xay ra");
        }
        return count;
    }
    
//    public static void main(String[] args) {
//        Customer customer = new CustomerDAO().findCustomerById(2);
//        customer.setCustomerName(customer.getCustomerName()+"1");
//        System.out.println(new CustomerDAO().updateCustomer(customer));
////        System.out.println(new CustomerDAO().addCustomer(new Customer(1, "abc", "abc", new java.sql.Date(100L), "abc", "abc", "abc")));
//    }
}
