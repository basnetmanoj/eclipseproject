package com.themakers.employmentmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.themakers.employmentmanagement.model.Employee;
import com.themakers.employmentmanagement.repository.EmployeeRepository;
import com.themakers.employmentmanagement.repository.EmployeeRepositoryImpl;

	@Service
public class EmployeeServiceImpl implements EmployeeService {

		private static EmployeeRepository employeeRepository;
	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.saveEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.updateEmployee(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		employeeRepository.deleteEmployee(id);
		
	}

	@Override
	public Employee get_All_Info_ById(int id) {
		return employeeRepository.get_All_Info_ById(id);
		 
	}

	@Override
	public List<Employee> get_All_Info() {
		
		return employeeRepository.get_All_Info();
	}

}
