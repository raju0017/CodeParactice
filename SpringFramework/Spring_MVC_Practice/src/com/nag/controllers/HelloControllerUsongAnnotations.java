package com.nag.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerUsongAnnotations 	{

	@RequestMapping("/welcome")
	public  ModelAndView helloWorld() {
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage", "Hi..! User Welcome to the Spring MVC Practice Application using Annotations");
		return modelAndView;
	}

}
