package service.impl;

import database.OrderDAO;
import database.OrderDetailDAO;
import model.OrderDetail;
import service.OrderDetailService;

import java.util.List;

public class OrderDetailServiceImpl implements OrderDetailService {

    private OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
    private OrderDAO orderDAO = new OrderDAO();

    @Override
    public List<OrderDetail> getAll() {
        return orderDetailDAO.getAll();
    }

    @Override
    public boolean createOrderDetail(OrderDetail orderDetail) {
        boolean isSuccess = orderDetailDAO.createOrderDetail(orderDetail);
        orderDAO.updateTotalPrice(orderDetail.getOrderId());
        return isSuccess;
    }

    @Override
    public boolean deleteOrderDetail(int id) {
        boolean isSuccess = orderDetailDAO.removeOrderDetail(id);
        OrderDetail orderDetail = orderDetailDAO.findById(id);
        if (orderDetail != null) {
            orderDAO.updateTotalPrice(orderDetail.getOrderId());
        }
        return isSuccess;
    }

    @Override
    public boolean updateOrderDetail(OrderDetail orderDetail) {
        return orderDetailDAO.updateOrderDetail(orderDetail);
    }

    @Override
    public OrderDetail findById(int id) {
        return orderDetailDAO.findById(id);
    }
}
