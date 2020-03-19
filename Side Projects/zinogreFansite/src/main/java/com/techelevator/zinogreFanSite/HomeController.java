package com.techelevator.zinogreFanSite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class HomeController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String displayHome() {
		
		return "home";
	}
	
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String displayAbout() {
		return "about";
	}
	
//	@RequestMapping(path = "/store", method = RequestMethod.GET)
//	public String displayStore() {
//		return "store";
//	}
}
