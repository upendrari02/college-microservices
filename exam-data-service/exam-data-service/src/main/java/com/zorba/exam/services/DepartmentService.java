package com.zorba.exam.services;

import java.util.List;

import com.zorba.exam.entities.Department;

public interface DepartmentService {

	List<Department> getDepartments();

	Department saveDepartment(Department department);

	Department getDepartmentById(Long id);

}
