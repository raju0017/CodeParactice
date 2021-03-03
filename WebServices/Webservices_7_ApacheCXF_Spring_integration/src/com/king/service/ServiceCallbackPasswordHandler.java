package com.king.service;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ServiceCallbackPasswordHandler implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		
		if(pc.getUsage() == WSPasswordCallback.USERNAME_TOKEN){
			
			if(pc.getIdentifier().equals("king")){
				pc.setPassword("0017");
			}
		}
	}

}
