package com.venkatesh.resteasy.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class MyApp extends Application{
	private Set<Object> singletons=new HashSet();
	
	public MyApp() {
		singletons.add(new PersonImpl());
	}
	@Override
	public Set<Object> getSingletons() {
		// TODO Auto-generated method stub
		return singletons;
	}
	
	
}
