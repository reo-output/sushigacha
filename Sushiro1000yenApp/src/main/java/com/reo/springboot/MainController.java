package com.reo.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(value="/")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public String get_menus() {
		return "show_menus";
	}

}