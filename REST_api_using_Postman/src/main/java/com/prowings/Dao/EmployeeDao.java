package com.prowings.Dao;

import java.util.List;

import com.prowings.Model.Employee;

public interface EmployeeDao {
//	public Employee[] createEmployee(Employee[] employee);
	public void createEmployee(Employee employee);
	public Employee getEmployee(int id);
	public Employee updateEmployee(Employee employee);
	public int deleteEmployee(int id);
	public List<Employee> getEmployee();
}
