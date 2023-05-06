package com.zorba.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zorba.student.dtos.EmployeeDepartment;
import com.zorba.student.entities.Employee;
import com.zorba.student.services.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getDepartments(){
		log.info("Get All Employee List of EmployeeController ");
		return ResponseEntity.ok(employeeService.getEmployees());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDepartment>getDepartmentById(@PathVariable Long id){
		log.info("Get Employee Details By Id of EmployeeController ");
		return ResponseEntity.ok(employeeService.getEmployeeById(id));
	}
	
	@PostMapping
	public ResponseEntity<Employee>saveDepartment(@RequestBody Employee employee){
		log.info("Save Employee Details of EmployeeController ");
		return ResponseEntity.ok(employeeService.saveEmployee(employee));
	}


}
