package service.impl;

import database.ProductDAO;
import model.Product;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO = new ProductDAO();

    @Override
    public List<Product> getAll() {
        return productDAO.getAllProduct();
    }

    @Override
    public Product findById(int id) {
        return productDAO.findById(id);
    }

    @Override
    public boolean updateQuantity(int id, int quantity) {
        return productDAO.updateQuantity(id, quantity);
    }
}
