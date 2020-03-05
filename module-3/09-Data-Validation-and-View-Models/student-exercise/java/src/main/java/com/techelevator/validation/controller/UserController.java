package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String getRegisterPage(ModelMap modelHolder) {
		
		if (!modelHolder.containsAttribute("register")) {
			modelHolder.put("register", new Registration());
		}
		return "register";
	}

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)

	@RequestMapping(path="/register", method=RequestMethod.POST)
	public String processRegistration(@Valid @ModelAttribute Registration register,
			BindingResult result, RedirectAttributes flash) {
		
		flash.addFlashAttribute("register", register);
		if (result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "register", result);
			return "redirect:/register";
		}
		
		return "redirect:/registrationSuccess";
	}
	
	@RequestMapping(path="/registrationSuccess", method = RequestMethod.GET)
	public String registrationSuccess() {
		return "registrationSuccess";
	}
	// GET: /login
	// Return the empty login view
	
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String getLoginPage(ModelMap modelHolder) {
		
		if (!modelHolder.containsAttribute("login")) {
			modelHolder.put("login", new Login());
		}
		
		return "login";
	}

	// POST: /login
	// Validate the model and redirect to a confirmation page if validation is
	// successful. Return the login view (if validation fails).

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String processLoginPage(@Valid @ModelAttribute Login login,
			BindingResult result, RedirectAttributes flash) {
		
		flash.addFlashAttribute("login", login);
		if (result.hasErrors()) {
			flash.addFlashAttribute(BindingResult.MODEL_KEY_PREFIX + "login", result);
			return "redirect:/login";
		}
		
		return "redirect:/loginSuccess";
	}
	
	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path = "/loginSuccess", method = RequestMethod.GET)
	public String getLoginSuccessPage() {
		return "loginSuccess";
	}
}
