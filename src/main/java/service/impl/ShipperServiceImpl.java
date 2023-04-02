package service.impl;

import database.ShipperDAO;
import model.Shipper;
import service.ShipperService;

import java.util.List;

public class ShipperServiceImpl implements ShipperService {

    ShipperDAO shipperDAO = new ShipperDAO();

    @Override
    public List<Shipper> getAll() {
        return shipperDAO.getAll();
    }
}
