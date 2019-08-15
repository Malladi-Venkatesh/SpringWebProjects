package com.venkatesh.resource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ResourceManagementJava7 {

	public static void main(String[] args) {
		java.io.BufferedReader br;
		String str=null;
		System.out.println("Enter File Path");
		br=new BufferedReader(new InputStreamReader(System.in));
		try {
			str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(BufferedReader b=new BufferedReader(new FileReader(str))){
			String s;
			while((s=b.readLine())!=null){
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void whiel(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
