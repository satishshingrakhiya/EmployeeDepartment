package com.satish.employee_service.controller;

import com.satish.employee_service.entity.Employee;
import com.satish.employee_service.payload.EmployeeDepartment;
import com.satish.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/{id}/department")
    public EmployeeDepartment getEmployeeDepartment(@PathVariable("id") Long id){
        return employeeService.getEmployeeWithDepartment(id);
    }
}
