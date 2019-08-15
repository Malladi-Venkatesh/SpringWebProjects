package com.venkatesh;

import org.json.simple.JSONObject;

public class ObjectToJsonEx1 {
	public static void main(String[] args) {
		JSONObject obj=new JSONObject();
		obj.put("name", "Venkatesh");
		obj.put("id", 231);
		System.out.println(obj);
	}
}
