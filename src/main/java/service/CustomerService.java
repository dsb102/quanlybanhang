/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Customer;

/**
 *
 * @author Admin
 */
public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer getCustomerById(int id);
    boolean updateCustomer(Customer customer);
    boolean addCustomer(Customer customer);
    boolean removeCustomer(int id);
    int countUserActive();
}
