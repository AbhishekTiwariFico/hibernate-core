package com.dao;

import com.model.Employee;

import java.util.List;

public interface EmployeeDAO {


        public void save(Employee employee);
        public List<Employee> list();


}
