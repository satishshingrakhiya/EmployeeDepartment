package com.satish.department_service.service;

import com.satish.department_service.enity.Department;
import com.satish.department_service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        Department departmentFromDb = departmentRepository.findById(id).get();
        departmentFromDb.setDepartmentName(department.getDepartmentName());
        departmentFromDb.setDepartmentAddress(department.getDepartmentAddress());
        return departmentRepository.save(departmentFromDb);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
