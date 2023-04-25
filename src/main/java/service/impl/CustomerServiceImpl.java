/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import database.CustomerDAO;
import java.util.ArrayList;
import java.util.List;
import model.Customer;
import service.CustomerService;

/**
 *
 * @author Admin
 */
public class CustomerServiceImpl implements CustomerService {

    private final CustomerDAO customerDAO = new CustomerDAO();

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerDAO.getAll();
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        return customerDAO.findCustomerById(id);
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        return customerDAO.updateCustomer(customer);
    }

    @Override
    public boolean addCustomer(Customer customer) {
        return customerDAO.addCustomer(customer);
    }

    @Override
    public boolean removeCustomer(int id) {
        return customerDAO.removeCustomer(id);
    }

    @Override
    public int countUserActive() {
        return customerDAO.countCustomerActive();
    }
}
