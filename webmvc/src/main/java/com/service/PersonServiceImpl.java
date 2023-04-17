package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.PersonDao;
import com.model.Person;

@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonDao personDao;

	@Override
	public Person createPerson(Person p) {
		System.out.println("8...inteface...service create ");
		Person person = personDao.createPerson(p);
		return person;
	}

	@Override
	public void deletePerson(int id) {
		System.out.println("8...inteface...service delete");
		personDao.deletePerson(id);
	}

	@Override
	public void updatePerson(Person p) {
		System.out.println("8...inteface...service update");
		personDao.updatePerson(p);
	}

	@Override
	public Person getPersonByid(int id) {
		System.out.println("8...inteface...serviceid ");
		Person person = personDao.getPersonByid(id);
		return person;
		
	}

//	@Override
//	public Person getPersonByidPerson(int id) {
//		Person person = personDao.createPerson(id);
//		return person;
//	}

}
