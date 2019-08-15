package com.venkatesh.resource;

public class MultipleResourceManagement {

	public static void main(String[] args) {
		try (Resource1 r1=new Resource1(); Resource2 r2=new Resource2()){
			int x=10/0;
			r1.show();
			r2.show();
		} catch(ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
