package com.venkatesh;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp=getEmployee(emp);
		ObjectMapper obj=new ObjectMapper();
		try {
			String json=obj.writeValueAsString(emp);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Employee getEmployee(Employee emp) {
		emp.setId(231);
		emp.setName("Venkatesh");
		return emp;
	}

}
