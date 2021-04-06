package com.qitong.dao;

import com.qitong.pojo.Department;
import com.qitong.pojo.Employee;
import jdk.nashorn.internal.ir.IfNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;
    @Autowired
    DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer, Employee>();
        employees.put(1001, new Employee(1001, "小七", "1410321423@qq.com", 0, new Department(101, "教研部")));
        employees.put(1002, new Employee(1002, "小78", "14103223@qq.com", 0, new Department(102, "市场部")));
        employees.put(1003, new Employee(1003, "小9", "14103223@qq.com", 0, new Department(103, "运营")));
        employees.put(1004, new Employee(1004, "10", "1410321423@qq.com", 1, new Department(104, "java")));
        employees.put(1005, new Employee(1005, "小11", "141021423@qq.com", 0, new Department(105, "PHP")));
        employees.put(1006, new Employee(1006, "小12", "10321423@qq.com", 0, new Department(106, "c++")));
    }

    private static Integer init = 1006;

    public void add(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(++init);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));
        employees.put(employee.getId(), employee);
    }

    //获得所有的员工
    public Collection<Employee> getEmployee() {
        return employees.values();
    }

    public Employee getEmployeeById(int id) {
        return employees.get(id);
    }

    //删除一个员工
    public void deleteEmployeeById(Integer id) {
        employees.remove(id);
    }
}
