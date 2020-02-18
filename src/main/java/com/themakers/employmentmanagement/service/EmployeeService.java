package com.themakers.employmentmanagement.service;

import java.util.List;

import com.themakers.employmentmanagement.model.Employee;

public interface EmployeeService {
	
void saveEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployee(int id);
	
	Employee get_All_Info_ById(int id);
	
	List<Employee> get_All_Info();

}
