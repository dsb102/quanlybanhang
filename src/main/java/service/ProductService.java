package service;

import model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    Product findById(int id);

    boolean updateQuantity(int id, int quantity);
}
