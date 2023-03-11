/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DBContext {
    
    protected Connection connection;
    
    public DBContext() {
        String url = "jdbc:mysql://localhost:33068/quanlybanhang";
        String user = "dung";
        String password = "12345678";
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Khởi tạo đối tượng DriverManager và kết nối tới database
            connection = DriverManager.getConnection(url, user, password);

            // Nếu kết nối thành công, in ra thông báo
            System.out.println("Kết nối tới database thành công!");
            
        } catch (SQLException e) {
            // Nếu kết nối không thành công, in ra thông báo lỗi
            System.out.println("Lỗi kết nối tới database: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // Đóng kết nối
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("Lỗi đóng kết nối: " + ex.getMessage());
            }
        }
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        DBContext db = new DBContext();
        System.out.println(db.connection);
    }
}
