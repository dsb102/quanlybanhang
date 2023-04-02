package service.impl;

import database.EmployeeDAO;
import model.Employee;
import service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO = new EmployeeDAO();
    @Override
    public List<Employee> getAll() {
        return employeeDAO.getAll();
    }
}
