package org.geekmozo.springmvc101.service;

import org.geekmozo.springmvc101.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    void saveEmployee(Employee employee);
    void deleteEmployee(int id);
}