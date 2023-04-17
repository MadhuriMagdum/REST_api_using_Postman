package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Person;

@Repository
public class PersonDaoImpl implements PersonDao {
	@Autowired
	SessionFactory factory;

	@Override
	public Person createPerson(Person p) {
		System.out.println("9...inteface...dao create ");
		Session session = factory.openSession();
		System.out.println("10...sessionfactory");
		Transaction tr = session.beginTransaction();
		session.save(p);
		tr.commit();
		return p;
	}

	@Override
	public void deletePerson(int id) {
		System.out.println("9...inteface...dao delete ");
		Session session = factory.openSession();
		System.out.println("10...sessionfactory");
		Transaction tr = session.beginTransaction();
		Person p2 = session.get(Person.class, id);
		session.delete(p2);
		tr.commit();

	}

	@Override
	public void updatePerson(Person p) {
		System.out.println("9...inteface...dao update");
		Session session = factory.openSession();
		System.out.println("10...sessionfactory");
		Transaction tr = session.beginTransaction();
		Person per = session.get(Person.class, p.getId());
		session.delete(per);
		session.save(p);
		tr.commit();
		
	}

	@Override
	public Person getPersonByid(int id) {
		System.out.println("9...inteface...dao id");
		Session session = factory.openSession();
		System.out.println("10...sessionfactory");
		Person person = session.get(Person.class, id);
		return person;
	}

}
