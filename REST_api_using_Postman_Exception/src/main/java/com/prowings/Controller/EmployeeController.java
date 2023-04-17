package com.prowings.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prowings.Model.Employee;
import com.prowings.Service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
//	@PostMapping("/employees")
//public  @ResponseBody Employee[] createEmployee(@RequestBody Employee []  employee)
//{  
//	Employee [] emp=service.createEmployee(employee);
//	return emp;
//	}
	@PostMapping("/employees")
	public  @ResponseBody String createEmployee(@RequestBody Employee   employee)
	{  
		service.createEmployee(employee);
		return "create ok";
	}
	@GetMapping("/employees/{id}")
	public  @ResponseBody Employee getEmployee(@PathVariable("id") int id) {
	return service.getEmployee(id);
	}
	@PutMapping("/employees")
	public @ResponseBody   Employee updateEmployee(@RequestBody Employee employee) {
		Employee emp=service.updateEmployee(employee);
		return emp ;
	}
	
	@DeleteMapping("/employee/{id}")
	public  @ResponseBody  int deleteEmployee(@PathVariable("id") int id)
	{//	int emp=service.deleteEmployee(id);
		return  service.deleteEmployee(id) ;
	}
	
	
	@GetMapping("/employees")
	public  @ResponseBody List<Employee> getEmployee() {
		return service.getEmployee();
	}
	
	
	
	}




