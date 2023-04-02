/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Orders {
    private int orderId;
    private int customerId;
    private int employeeId;
    private Date orderDate;
    private Date deleveryDate;//ngày giao hàng
    private double totalPrice;
    private int shipperId;

    public Orders() {
    }
    
    public Orders(int orderId, int customerId, int employeeId, Date orderDate, Date deleveryDate, double totalPrice, int shipperId) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.orderDate = orderDate;
        this.deleveryDate = deleveryDate;
        this.totalPrice = totalPrice;
        this.shipperId = shipperId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeleveryDate() {
        return deleveryDate;
    }

    public void setDeleveryDate(Date deleveryDate) {
        this.deleveryDate = deleveryDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getShipperId() {
        return shipperId;
    }

    public void setShipperId(int shipperId) {
        this.shipperId = shipperId;
    }
}
