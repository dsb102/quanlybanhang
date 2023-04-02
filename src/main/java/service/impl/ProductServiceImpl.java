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
}
