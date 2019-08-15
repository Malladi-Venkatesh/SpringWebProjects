package com.venkatesh.resteasy.service;
import com.venkatesh.resteasy.model.Person;
import com.venkatesh.resteasy.model.Response;

public interface PersonService {
	public Response addPerson(Person p);
	public Response deletePerson(int id);
	public Person getPerson(int id);
	public Person getDummyPerson(int id);
	public Person[] getAllPersons();
	
}
