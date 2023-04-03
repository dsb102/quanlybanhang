package database;

import database.query.SQLQuery;
import model.OrderDetail;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailDAO extends DBContext {
    public List<OrderDetail> getAll() {
        List<OrderDetail> orderDetails = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.getAllOrderDetail());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("detailId");
                int order = resultSet.getInt("orderId");
                int product = resultSet.getInt("productId");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("unitPrice");
                OrderDetail orderDetail = new OrderDetail(id, order, product, quantity, price);
                orderDetails.add(orderDetail);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return orderDetails;
    }

    public OrderDetail findById(int idNeedFind) {
        List<OrderDetail> orderDetails = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.findOrderDetailById());
            preparedStatement.setInt(1, idNeedFind);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("detailId");
                int order = resultSet.getInt("orderId");
                int product = resultSet.getInt("productId");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("unitPrice");
                OrderDetail orderDetail = new OrderDetail(id, order, product, quantity, price);
                orderDetails.add(orderDetail);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return orderDetails.get(0);
    }

    public boolean createOrderDetail(OrderDetail orderDetail) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.createOrderDetail());
            preparedStatement.setInt(1, orderDetail.getOrderId());
            preparedStatement.setInt(2, orderDetail.getProductId());
            preparedStatement.setInt(3, orderDetail.getQuantity());
            preparedStatement.setDouble(4, orderDetail.getUnitPrice());
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

    public boolean updateOrderDetail(OrderDetail orderDetail) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.updateOrderDetail());
            preparedStatement.setInt(1, orderDetail.getOrderId());
            preparedStatement.setInt(2, orderDetail.getProductId());
            preparedStatement.setInt(3, orderDetail.getQuantity());
            preparedStatement.setDouble(4, orderDetail.getUnitPrice());
            preparedStatement.setInt(5, orderDetail.getDetailId());
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

    public boolean removeOrderDetail(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.removeOrderDetail());
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

    public List<OrderDetail> findAllById(int ids) {
        List<OrderDetail> orderDetails = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.findAllOrderDetailByOrderId());
            preparedStatement.setInt(1, ids);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("detailId");
                int order = resultSet.getInt("orderId");
                int product = resultSet.getInt("productId");
                int quantity = resultSet.getInt("quantity");
                double price = resultSet.getDouble("unitPrice");
                OrderDetail orderDetail = new OrderDetail(id, order, product, quantity, price);
                orderDetails.add(orderDetail);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return orderDetails;
    }

    public int getTotalQuantitySpecifiedProductByDetailId(int orderId, int productId) {
        List<OrderDetail> orderDetails = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.sumQuantityOrderDetailSpecifiedProduct());
            preparedStatement.setInt(1, orderId);
            preparedStatement.setInt(2, productId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int quantity = resultSet.getInt("quantity");
                return quantity;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new OrderDetailDAO().getTotalQuantitySpecifiedProductByDetailId(1, 1));
    }
}
