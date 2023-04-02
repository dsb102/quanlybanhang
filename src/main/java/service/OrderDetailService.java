package service;

import model.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> getAll();
    boolean createOrderDetail(OrderDetail orderDetail);
    boolean deleteOrderDetail(int id);
    boolean updateOrderDetail(OrderDetail orderDetail);
    OrderDetail findById(int id);
}
