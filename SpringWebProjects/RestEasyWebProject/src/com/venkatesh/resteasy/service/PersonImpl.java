package com.venkatesh.resteasy.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.venkatesh.resteasy.model.Person;
import com.venkatesh.resteasy.model.Response;

@Path("/person")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class PersonImpl implements PersonService {
	private static Map<Integer, Person> persons = new HashMap();

	@Override
	@POST
	@Path("/add")
	public Response addPerson(Person p) {
		Response response = new Response();
		if (persons.get(p.getId()) != null) {
			response.setStatus(false);
			response.setMessage("Person already exists");
			return response;
		}
		persons.put(p.getId(), p);
		response.setStatus(true);
		response.setMessage("Person is created successfully");
		return response;
	}

	@Override
	@GET
	@Path("/{id}/delete")
	public Response deletePerson(@PathParam("id") int id) {
		Response response = new Response();
		if (persons.get(id) == null) {
			response.setStatus(false);
			response.setMessage("Person doesn't exist");
			return response;
		}
		persons.remove(id);
		response.setStatus(true);
		response.setMessage("Person deleted successfully");
		return response;
	}

	@Override
	@GET
	@Path("{id}/get")
	public Person getPerson(@PathParam("id") int id) {
		return persons.get(id);
	}

	@Override
	@GET
	@Path("{id}/getDummy")
	public Person getDummyPerson(@PathParam("id") int id) {
		Person p = new Person();
		p.setId(id);
		p.setName("Dummy");
		p.setAge(20);
		return p;
	}

	@Override
	@GET
	@Path("/getAll")
	public Person[] getAllPersons() {
		Person[] p = new Person[persons.size()];
		Set<Integer> personIds = persons.keySet();
		int i = 0;
		for (Integer id : personIds) {
			p[i++] = persons.get(id);
		}
		return p;
	}
}