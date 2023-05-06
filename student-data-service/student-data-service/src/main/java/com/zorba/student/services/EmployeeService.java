package com.zorba.student.services;

import java.util.List;

import com.zorba.student.dtos.EmployeeDepartment;
import com.zorba.student.entities.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();

	EmployeeDepartment getEmployeeById(Long id);

	Employee saveEmployee(Employee employee);

}
