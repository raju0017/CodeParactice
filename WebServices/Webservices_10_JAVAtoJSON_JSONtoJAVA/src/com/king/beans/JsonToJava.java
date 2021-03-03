package com.king.beans;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonToJava {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper mapper = new ObjectMapper();
		Student st =mapper.readValue(new File("Student.json"), Student.class);
		
		System.out.println(st.getSid());
		System.out.println(st.getSname());
		
		Address addr = st.getAddress();
		
		System.out.println("\nAddress.....");
		System.out.println(addr.getDno());
		System.out.println(addr.getCity());
		System.out.println(addr.getMandal());
		System.out.println(addr.getDistrict());
		
	} 

}
