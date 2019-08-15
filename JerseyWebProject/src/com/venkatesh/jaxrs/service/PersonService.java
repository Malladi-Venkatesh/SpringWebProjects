package com.venkatesh.jaxrs.service;
import com.venkatesh.jaxrs.model.Response;
import com.venkatesh.jaxrs.model.Person;

public interface PersonService {
	public Response addPerson(Person p);
	public Response deletePerson(int id);
	public Person getPerson(int id);
	public Person getDummyPerson(int id);
	public Person[] getAllPersons();
	
}
