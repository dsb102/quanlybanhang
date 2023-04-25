/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.OrderDetail;
import model.Orders;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface OrderService {
    int createOrder(Orders order);
    boolean removeOrder(int id);
    List<Orders> getAllOrder();
    boolean updateOrder(Orders orders);
    Orders findById(int id);
    int countQuantityBought();
    int countTotal();
    int countQuantityNotBoughtYet();
}
