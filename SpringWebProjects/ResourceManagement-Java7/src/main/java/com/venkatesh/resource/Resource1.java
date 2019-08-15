package com.venkatesh.resource;

public class Resource1 implements AutoCloseable {
	public void show() {
		System.out.println("show method is executed from Resource1...");
	}

	@Override
	public void close() throws Exception {
		System.out.println("close method is executed from Resource1...");
		
	}
	
}
