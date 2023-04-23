package database;

import database.query.SQLQuery;
import model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO extends DBContext{

    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SQLQuery.getAllProduct());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("productId");
                String name = resultSet.getString("productName");
                double price = resultSet.getDouble("unitPrice");
                int categoryId = resultSet.getInt("categoryId");
                int supplierId = resultSet.getInt("supplierId");
                int quantity = resultSet.getInt("quantity");
                Product product = new Product(id, name, price, categoryId, quantity, supplierId);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) {
        System.out.println(new ProductDAO().getAllProduct());
    }

    public Product findById(int ids) {
        Product product = new Product();
        try {
            PreparedStatement statement = connection.prepareStatement(SQLQuery.findByProductId());
            statement.setInt(1, ids);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("productId");
                String name = resultSet.getString("productName");
                double price = resultSet.getDouble("unitPrice");
                int categoryId = resultSet.getInt("categoryId");
                int supplierId = resultSet.getInt("supplierId");
                int quantity = resultSet.getInt("quantity");
                product = new Product(id, name, price, categoryId, quantity, supplierId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public boolean updateQuantity(int id, int quantity) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SQLQuery.updateQuantityProduct());
            preparedStatement.setInt(1, quantity);
            preparedStatement.setInt(2, id);
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
}
