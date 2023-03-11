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
import java.util.Date;
import java.util.List;
import model.Customer;

/**
 *
 * @author Admin
 */
public class CustomerDAO extends DBContext{
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
}
