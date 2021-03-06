package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
 * Types of HandlerMapping Classes example
 * 
 */

public class HelloWorld_Controller implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		String name = req.getParameter("name");
		Map map = new HashMap();
		map.put("msg", "Hello.. "+ name);
		ModelAndView mav = new ModelAndView("success", map);
		
		return mav;
	}

}
