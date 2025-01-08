package com.satish.employee_service.payload;

import com.satish.employee_service.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class EmployeeDepartment {
    private Employee employee;
    private Department department;

    public EmployeeDepartment(Employee employee, Department department) {
        this.employee = employee;
        this.department = department;
    }

    public EmployeeDepartment() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
