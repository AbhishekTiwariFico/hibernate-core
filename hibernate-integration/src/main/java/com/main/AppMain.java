package com.main;

import com.dao.EmployeeDAO;
import com.model.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class AppMain {
    public static void main (String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        EmployeeDAO employeeDAO = context.getBean(EmployeeDAO.class);
        Employee employee = new Employee();
        employee.setName("Shravan");
        employee.setDepartment("Dep1");

        employeeDAO.save(employee);
        List<Employee> list = employeeDAO.list();

        for (Employee e : list) {
            System.out.println("Employee List::" + e);
        }

    }
}
