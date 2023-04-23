package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    Employee findEmployeeById(int id);
}
