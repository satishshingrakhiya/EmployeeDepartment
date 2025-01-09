package com.satish.employee_service.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Department {
    private Long id;
    private String departmentName;
    private String departmentAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public Department() {
    }

    public Department(Long id, String departmentName, String departmentAddress) {
        this.id = id;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
    }
}
