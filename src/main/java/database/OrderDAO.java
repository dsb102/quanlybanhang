/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import database.query.SQLQuery;
import model.OrderDetail;
import model.Orders;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public int createOrder(Orders orderDetail) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.createOrder(), Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, orderDetail.getCustomerId());
            preparedStatement.setInt(2, orderDetail.getEmployeeId());
            int rowUpdate = preparedStatement.executeUpdate();
            if (rowUpdate == 0) {
                return -1;
            }

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                throw new SQLException("Creating customer failed, no ID obtained.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    public boolean updateOrder(int orderId, int payment) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.updateOrderPayment());
            preparedStatement.setInt(1, payment);
            preparedStatement.setInt(2, orderId);
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

    public int countBought() {
        int count = 0;
        List<Orders> orders = new ArrayList<>();
        try {
            PreparedStatement pstm = connection.prepareStatement("SELECT count(*) as count FROM Orders WHERE payment = 1");
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int countNotBoughtYet() {
        int count = 0;
        List<Orders> orders = new ArrayList<>();
        try {
            PreparedStatement pstm = connection.prepareStatement("SELECT count(*) as count FROM Orders WHERE payment = 0 AND status = 1");
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    public int countTotal() {
        int count = 0;
        try {
            PreparedStatement pstm = connection.prepareStatement("SELECT count(*) as count FROM Orders WHERE status = 1");
            ResultSet resultSet = pstm.executeQuery();
            while (resultSet.next()) {
                count = resultSet.getInt("count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

//    public static void main(String[] args) {
//        System.out.println(new OrderDAO().updateOrder(1, 1));
//    }
}
