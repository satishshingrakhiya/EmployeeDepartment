package com.satish.employee_service.service;

import com.satish.employee_service.repository.EmployeeRepository;
import com.satish.employee_service.entity.Employee;
import com.satish.employee_service.payload.Department;
import com.satish.employee_service.payload.EmployeeDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public EmployeeDepartment getEmployeeWithDepartment(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/api/department/"+employee.getDepartmentId(), Department.class);
        System.out.println(department.toString());
        return new EmployeeDepartment(employee, department);
    }
}
