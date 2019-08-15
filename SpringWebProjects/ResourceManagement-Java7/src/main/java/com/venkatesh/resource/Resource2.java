package com.venkatesh.resource;

public class Resource2 implements AutoCloseable {
	
	public void show() {
		System.out.println("Show Method is executed from Resource2...");
	}
	@Override
	public void close() throws Exception {
		System.out.println("close methods is executed from Resource2...");
	}
	
}
