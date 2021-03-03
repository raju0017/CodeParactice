package com.king.beans;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Student st = new Student();
		st.setSid(100);
		st.setSname("king");
		
		Address addr = new Address();
		addr.setDno(77);
		addr.setCity("Molagavalli");
		addr.setMandal("Alur");
		addr.setDistrict("kurnool");
		
		st.setAddress(addr);
	
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("Student.json"), st);
		
		System.out.println("Json generated");
	}
}
