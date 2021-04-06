package com.qitong;

import com.qitong.dao.EmployeeDao;
import com.qitong.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collection;
import java.util.Collections;

@SpringBootTest
class Springboot05WebApplicationTests {

    @Autowired
    EmployeeDao employeeDao;

    @Test
    void contextLoads() {
        Collection<Employee> employee = employeeDao.getEmployee();
        employee.forEach(System.out::print);
    }

}
