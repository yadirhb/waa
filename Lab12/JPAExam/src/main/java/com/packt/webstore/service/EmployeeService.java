package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.Employee;

public interface EmployeeService {
	List<Employee> all();
	Employee getById(int number);
	Employee save(Employee employee);
}