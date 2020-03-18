package com.techelevator.zinogreFanSite;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {

	@RequestMapping("/")
	public String displayHome() {
		
		return "home";
	}
	
	@RequestMapping("/about")
	public String displayAbout() {
		return "about";
	}
}
