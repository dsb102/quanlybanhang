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
        return "UPDATE Customer SET customerName = ?, gender = ?, dateOfBirth = ?, phoneNumber = ?, email = ?, address = ? WHERE customerId = ?";
    }
    
    public static String addCustomer() {
        return "INSERT INTO Customer VALUES (1, ?, ?, ?, ? ,?, ?)";
    }

    public static String getAllEmployee() {
        return "SELECT * FROM Employee";
    }

    public static String getEmployeeById() {
        return "SELECT * FROM Employee WHERE employeeId = ?";
    }

    public static String getAllShipper() {
        return "SELECT * FROM Shipper";
    }

    public static String getAllProduct() {
        return "SELECT * FROM Product";
    }

    public static String findByProductId() {
        return "SELECT * FROM Product WHERE productId = ?";
    }

    public static String getProduct() {
        return "SELECT * Product WHERE productId = ?";
    }

    public static String getAllOrderDetail() {
        return "SELECT * FROM OrderDetail";
    }

    public static String sumQuantityOrderDetailSpecifiedProduct() {
        return "SELECT SUM(quantity) as quantity FROM OrderDetail WHERE orderId = ? AND productId = ?";
    }

    public static String removeOrderDetail() {
        return "DELETE FROM OrderDetail WHERE detailId = ?";
    }

    public static String updateOrderDetail() {
        return "UPDATE OrderDetail SET orderId = ?, productId = ?, quantity = ?, unitPrice = ? WHERE detailId = ?";
    }

    public static String createOrderDetail() {
        return "INSERT INTO OrderDetail (orderId, productId, quantity, unitPrice) VALUES (?, ?, ?, ?)";
    }

    public static String createOrder() {
        return "INSERT INTO Orders (customerId, employeeId, orderDate, deliveryDate, totalPrice, shipperId, payment, status)" +
                " VALUES (?, ?, CURDATE(), CURDATE(), 0, 1, 0, 1)";
    }

    public static String getAllOrder() {
        return "SELECT * FROM Orders WHERE status = 1";
    }

    public static String deleteOrder() {
        return "UPDATE Orders SET status = 0 WHERE orderId = ? AND payment = 0";
    }

    public static String updateOrder() {
        return "UPDATE Orders SET customerId = ?, employeeId = ?, orderDate = CURDATE() WHERE orderId = ?";
    }

    public static String updateQuantityProduct() {
        return "UPDATE Product SET quantity = ? WHERE productId = ?";
    }

    public static String paymentOrder() {
        return "UPDATE Orders SET payment = 1 WHERE orderId = ?";
    }

    public static String findOrderById() {
        return "SELECT * FROM Orders WHERE orderId = ?";
    }

    public static String findOrderDetailById() {
        return "SELECT * FROM OrderDetail WHERE detailId = ?";
    }

    public static String updateTotalPrice() {
        return "UPDATE Orders SET totalPrice = (SELECT SUM(quantity * unitPrice) FROM OrderDetail WHERE orderId = ?) WHERE orderId = ?";
    }

    public static String findAllOrderDetailByOrderId() {
        return "SELECT * FROM OrderDetail WHERE orderId = ?";
    }
}
