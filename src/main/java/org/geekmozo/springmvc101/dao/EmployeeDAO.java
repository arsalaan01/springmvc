package org.geekmozo.springmvc101.dao;

import org.geekmozo.springmvc101.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    void saveEmployee(Employee employee);
    void deleteEmployee(int id);
}
