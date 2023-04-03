package database;

import database.query.SQLQuery;
import model.Customer;
import model.Employee;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends DBContext {
    public List<Employee> getAll() {
        List<Employee> customers = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.getAllEmployee());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int customerId = resultSet.getInt("employeeId");
                String customerName = resultSet.getString("employeeName");
                String gender = resultSet.getString("gender");
                Date dateOfBirth = resultSet.getDate("dateOfBirth");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                double salary = resultSet.getDouble("salary");
                Employee customer = new Employee(customerId, customerName, gender, dateOfBirth, phoneNumber, email, address, salary);
                customers.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    public Employee findById(int id) {
        try {
            PreparedStatement pstm = connection.prepareStatement(SQLQuery.getEmployeeById());
            pstm.setInt(1, id);
            ResultSet resultSet = pstm.executeQuery();
            if (resultSet.next()) {
                int customerId = resultSet.getInt("employeeId");
                String customerName = resultSet.getString("employeeName");
                String gender = resultSet.getString("gender");
                Date dateOfBirth = resultSet.getDate("dateOfBirth");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                double salary = resultSet.getDouble("salary");
                Employee customer = new Employee(customerId, customerName, gender, dateOfBirth, phoneNumber, email, address, salary);
                return customer;
            }
            return null;
        } catch (SQLException exception) {
            System.out.println("Tim that bai co loi SQL xay ra");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new EmployeeDAO().findById(1));
    }
}
