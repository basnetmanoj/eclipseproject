package com.themakers.employmentmanagement.repository;

import java.util.List;

import com.themakers.employmentmanagement.model.Employee;

public interface EmployeeRepository {
	
	void saveEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	void deleteEmployee(int id);
	
	Employee get_All_Info_ById(int id);
	
	List<Employee> get_All_Info();

}
