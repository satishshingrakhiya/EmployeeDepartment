package com.satish.employee_service.service;

import com.satish.employee_service.entity.Employee;
import com.satish.employee_service.payload.EmployeeDepartment;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long employeeId);
    Employee saveEmployee(Employee employee);
    EmployeeDepartment getEmployeeWithDepartment(Long employeeId);
}
