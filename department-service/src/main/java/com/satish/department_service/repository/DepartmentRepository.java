package com.satish.department_service.repository;

import com.satish.department_service.enity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
