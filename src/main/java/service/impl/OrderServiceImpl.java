/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.util.List;

import database.OrderDAO;
import model.OrderDetail;
import model.Orders;
import service.OrderService;

/**
 *
 * @author Admin
 */
public class OrderServiceImpl implements OrderService {

    private OrderDAO orderDAO = new OrderDAO();

    @Override
    public boolean removeOrder(int id) {
        return orderDAO.removeOrder(id);
    }

    @Override
    public List<Orders> getAllOrder() {
        return orderDAO.getAll();
    }

    @Override
    public boolean updateOrder(Orders orders) {
        return orderDAO.updateOrder(orders);
    }

    @Override
    public Orders findById(int id) {
        return orderDAO.findById(id);
    }

    @Override
    public int countQuantityBought() {
        return orderDAO.countBought();
    }

    @Override
    public int countTotal() {
        return orderDAO.countTotal();
    }

    @Override
    public int countQuantityNotBoughtYet() {
        return orderDAO.countNotBoughtYet();
    }

    @Override
    public int createOrder(Orders order) {
        return orderDAO.createOrder(order);
    }
}
