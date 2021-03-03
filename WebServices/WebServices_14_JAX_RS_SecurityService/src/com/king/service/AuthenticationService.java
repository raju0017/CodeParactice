package com.king.service;

import java.util.StringTokenizer;

import com.sun.org.apache.xml.internal.security.utils.Base64;

public class AuthenticationService {

	//Basic enscriptedusername:encriptedpassword
	
	public Boolean isAuthenticate(String authenticateString)
	{
		if(authenticateString == null)
		{
			return false;
		}
		String encodedUsernamePassword = authenticateString.replaceFirst("Basic", "");
		
		try {
			byte[] decodedUsernamePassword = Base64.decode(encodedUsernamePassword);//abc:xyz
			
			String decodeUsernamePassword = new String(decodedUsernamePassword, "UTF-8");//un:pass
			StringTokenizer tokenizer = new StringTokenizer(decodeUsernamePassword, ":");
			
			String userName = tokenizer.nextToken();
			String passWord = tokenizer.nextToken();
			
			if(userName.equals("king") && passWord.equals("0017"))
			{
				return true;
			} else{
				return false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
			return false;
		}
	}
}
