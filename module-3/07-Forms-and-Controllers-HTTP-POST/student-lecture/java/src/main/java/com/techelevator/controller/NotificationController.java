package com.techelevator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotificationController {

	/* The `method` attribute of the @RequestMapping annotation allows us to specify that this method
	 * only handles requests for a specific HTTP method. The mapping below specifies that this method
	 * is only invoked for HTTP GET requests
	 *
	 * If the request method is specified, the path must be specified using the `path` attribute rather
	 * than just passing it as the default attribute	*/
	@RequestMapping(path = "/notificationSignupInput", method = RequestMethod.GET)
	public String showNotificationSignupForm() {

		return "notificationSignupInput";
	}


	@RequestMapping(path = "/notificationSignupInput", method = RequestMethod.POST)
	public String processNotificationSignupForm(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String emailAddress, @RequestParam int age) {
		
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(emailAddress);
		
		
		return "redirect:/notificationSignupResult";
	}
	
	@RequestMapping(path = "/notificationSignupResult", method = RequestMethod.GET)
	public String showNotificationResult() {
		return "notificationSignupResult";
	}
	
	
}
