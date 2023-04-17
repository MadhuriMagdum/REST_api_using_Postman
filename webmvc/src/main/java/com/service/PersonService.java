package com.service;

import com.model.Person;

public interface PersonService {
	
	public Person createPerson(Person p);
	public void deletePerson(int id);
	public void updatePerson(Person p);
	public Person getPersonByid(int id);



}
