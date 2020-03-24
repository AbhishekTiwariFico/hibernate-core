package com.dao;

import com.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void save(Employee employee) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(employee);
        tx.commit();
        session.close();
        System.out.println("\n\n");
    }

    @Override
    public List<Employee> list() {
        Session session = this.sessionFactory.openSession();
        List<Employee> employeeList = session.createQuery("from Employee").list();
        session.close();
        System.out.println("\n\n");
        return employeeList;
    }
}
