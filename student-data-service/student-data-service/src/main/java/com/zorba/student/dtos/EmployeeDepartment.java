package com.zorba.student.dtos;

import com.zorba.student.entities.Employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeDepartment {
	
	private Employee employee;
	private Department department;

}
