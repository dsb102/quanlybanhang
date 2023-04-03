/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.query.SQLQuery;
import model.OrderDetail;
import model.Orders;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author Admin
 */
public class OrderDAO extends DBContext {
    public List<Orders> getAll() {
        List<Orders> orders = new ArrayList<>();
        try {
            PreparedStatement pstm = connection.prepareStatement(SQLQuery.getAllOrder());
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("orderId");
                int cus = resultSet.getInt("customerId");
                int em = resultSet.getInt("employeeId");
                Date date = resultSet.getDate("orderDate");
                double price = resultSet.getDouble("totalPrice");
                boolean payment = resultSet.getBoolean("payment");
                Orders orders1 = new Orders(id, cus, em, date, price, payment);
                orders.add(orders1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders;
    }

    public Orders findById(int idNeedFind) {
        List<Orders> orders = new ArrayList<>();
        try {
            PreparedStatement pstm = connection.prepareStatement(SQLQuery.findOrderById());
            pstm.setInt(1, idNeedFind);
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("orderId");
                int cus = resultSet.getInt("customerId");
                int em = resultSet.getInt("employeeId");
                Date date = resultSet.getDate("orderDate");
                double price = resultSet.getDouble("totalPrice");
                boolean payment = resultSet.getBoolean("payment");
                Orders orders1 = new Orders(id, cus, em, date, price, payment);
                orders.add(orders1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orders.get(0);
    }

    public boolean createOrder(Orders orderDetail) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.createOrder());
            preparedStatement.setInt(1, orderDetail.getCustomerId());
            preparedStatement.setInt(2, orderDetail.getEmployeeId());
            int rowUpdate = preparedStatement.executeUpdate();
            if (rowUpdate == 0) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateOrder(int orderId, int payment) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.updateOrderPayment());
            preparedStatement.setInt(1, payment);
            preparedStatement.setInt(2, orderId);
            System.out.println(preparedStatement);
            int rowUpdate = preparedStatement.executeUpdate();
            if (rowUpdate == 0) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateOrder(Orders orderDetail) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.updateOrder());
            preparedStatement.setInt(1, orderDetail.getCustomerId());
            preparedStatement.setInt(2, orderDetail.getEmployeeId());
            preparedStatement.setInt(3, orderDetail.getOrderId());
            int rowUpdate = preparedStatement.executeUpdate();
            if (rowUpdate == 0) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeOrder(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.deleteOrder());
            preparedStatement.setInt(1, id);
            int rowUpdate = preparedStatement.executeUpdate();
            if (rowUpdate == 0) {
                return false;
            }
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void updateTotalPrice(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.updateTotalPrice());
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, id);
            int rowUpdate = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(new OrderDAO().updateOrder(1, 1));
    }
}
