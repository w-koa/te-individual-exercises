package com.techelevator.controller;

import com.techelevator.authentication.AuthProvider;
import com.techelevator.authentication.UnauthorizedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SiteController
 */
@Controller
public class SiteController {
	
    @Autowired
    private AuthProvider auth;

    // Add a mapping to the private page.

    @RequestMapping(path = "/about", method = RequestMethod.GET)
    public String aboutPage() throws UnauthorizedException {
        return "about";
    }
}