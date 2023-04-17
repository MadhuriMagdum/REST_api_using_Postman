package com.prowings.Dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.Model.Employee;
@Repository
public class EmployeeDaoImplement  implements EmployeeDao{
@Autowired
SessionFactory sessionFactory;
//	@Override
//	public Employee[] createEmployee(Employee[] employee) {
//		System.out.println("dao");
//		for(Employee e: employee)
//		{	Session session=sessionFactory.openSession();
//		Transaction tx= session.beginTransaction();
//		Serializable  serilizableEmp=session.save(e);
//		tx.commit();
//		}
//		return employee;
//	}
@Override
public void createEmployee(Employee employee) {
	Session session=sessionFactory.openSession();
	Transaction tx= session.beginTransaction();
	 session.save(employee);
	tx.commit();
}
	@Override
	public Employee getEmployee(int id) {
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		Employee e = session.get(Employee.class ,id);
		tx.commit();
		return e;
	}
	@Override
	public Employee updateEmployee(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		session.saveOrUpdate(employee);
		Employee e = session.get(Employee.class ,employee.getId());
		tx.commit();
		return e;
	}
	@Override
	public int deleteEmployee(int id) {
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		session.delete(session.get(Employee.class,id));
		tx.commit();
		return id;
	}
	@Override
	public List<Employee> getEmployee() {
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
	    List<Employee> eList = session.createQuery("from Employee").list();
		tx.commit();
		return eList;
	}

}
