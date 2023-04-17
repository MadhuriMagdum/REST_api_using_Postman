package com.prowings.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prowings.Dao.EmployeeDao;
import com.prowings.Model.Employee;
@Service
public class EmployeeServiceImplement implements EmployeeService {
	@Autowired
	EmployeeDao dao;
//	@Override
//	public Employee[] createEmployee(Employee[] employee) {
//		// TODO Auto-generated method stub
//		System.out.println("service"	);
//		Employee[] emp= dao.createEmployee(employee);
//		return emp;
//	}
	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("service"	);
	dao.createEmployee(employee);
//		return emp;
	}
	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.getEmployee(id);
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 return dao.updateEmployee(employee);
	}
	
	@Override
	public int deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(id);
	}
	

	
	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return dao.getEmployee();
	}

}
