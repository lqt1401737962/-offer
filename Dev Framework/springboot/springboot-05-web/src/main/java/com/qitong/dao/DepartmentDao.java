package com.qitong.dao;

import com.qitong.pojo.Department;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
public class DepartmentDao {

    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer, Department>();
        departments.put(101, new Department(101, "教研部"));
        departments.put(102, new Department(102, "市场部"));
        departments.put(103, new Department(103, "运营"));
        departments.put(104, new Department(104, "java"));
        departments.put(105, new Department(105, "PHP"));
        departments.put(106, new Department(106, "c++"));
    }

    public Collection<Department> getDepartment() {
        return departments.values();
    }

    public Department getDepartmentById(int id) {
        return departments.get(id);
    }
}
