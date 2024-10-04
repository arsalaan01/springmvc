package org.geekmozo.springmvc101.dao;

import org.geekmozo.springmvc101.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {
        return sessionFactory.getCurrentSession().createQuery("from Employee", Employee.class).list();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee = getEmployeeById(id);
        if (employee != null) {
            sessionFactory.getCurrentSession().delete(employee);
        }
    }
}
