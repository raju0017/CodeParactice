package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		String name = req.getParameter("name");
		Map map = new HashMap();
		map.put("message", "Hi.."+name +" using AbstractController class");
		ModelAndView mav = new ModelAndView("success",map);
		//mav.addObject(map);
		return mav;
	}

}
