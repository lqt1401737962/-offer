package com.qitong.controller;

import com.qitong.dao.DepartmentDao;
import com.qitong.dao.EmployeeDao;
import com.qitong.pojo.Department;
import com.qitong.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("all")
    public String all(Model model) {
        Collection<Employee> employee = employeeDao.getEmployee();
        model.addAttribute("emps", employee);
        return "emp/list";
    }

    //进入增加页面
    @GetMapping("/add")
    public String toAddPage(Model model) {
        Collection<Department> departments = departmentDao.getDepartment();
        model.addAttribute("deps", departments);
        return "emp/add";
    }

    @PostMapping("/addUser")
    public String addEmp(Employee employee) {
        System.out.println("add===>" + employee);
        employeeDao.add(employee);
        return "redirect:/all";
    }

    //进入修改页面
    @GetMapping("/emp/{id}")
    public String toUpdatePage(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("emp", employee);
        //获取部门的id
        Collection<Department> departments = departmentDao.getDepartment();
        model.addAttribute("deps", departments);
        return "emp/update";
    }

    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee) {
        employeeDao.add(employee);
        return "redirect:/all";
    }

    //删除一个员工
    @RequestMapping("/deleteEmp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id) {

        employeeDao.deleteEmployeeById(id);
        return "redirect:/all";
    }

}
