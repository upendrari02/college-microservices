package com.zorba.exam.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zorba.exam.entities.Department;
import com.zorba.exam.services.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	public ResponseEntity<List<Department>> getDepartments(){
		log.info("Get All Department List of DepartmentController ");
		return ResponseEntity.ok(departmentService.getDepartments());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Department>getDepartmentById(@PathVariable Long id){
		log.info("Get Department Details By Id of DepartmentController ");
		return ResponseEntity.ok(departmentService.getDepartmentById(id));
	}
	
	@PostMapping
	public ResponseEntity<Department>saveDepartment(@RequestBody Department department){
		log.info("Save Department Details of DepartmentController ");
		return ResponseEntity.ok(departmentService.saveDepartment(department));
	}

}
