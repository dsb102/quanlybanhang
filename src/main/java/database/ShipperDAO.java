package database;

import database.query.SQLQuery;
import model.Shipper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShipperDAO extends DBContext{

    public List<Shipper> getAll() {
        List<Shipper> shippers = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SQLQuery.getAllShipper());
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("shipperId");
                String name = resultSet.getString("shipperName");
                String phone = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                Shipper shipper = new Shipper(id, name, phone, email);
                shippers.add(shipper);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return shippers;
    }
}
