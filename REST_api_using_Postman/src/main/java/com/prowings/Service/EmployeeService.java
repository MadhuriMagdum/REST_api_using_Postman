package com.prowings.Service;

import java.util.List;

import com.prowings.Model.Employee;

public interface EmployeeService {
	
// public Employee[] createEmployee(Employee[] employee);
public void createEmployee(Employee employee);
public int deleteEmployee(int id);

public Employee updateEmployee(Employee employee);

public Employee getEmployee(int id);
public List<Employee> getEmployee();
}
