/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.OrderDetail;
import model.Orders;

/**
 *
 * @author Admin
 */
public interface OrderService {
    boolean createOrder(Orders order, OrderDetail orderDetail);
    boolean removeOrder(OrderDetail orderDetail);
}
