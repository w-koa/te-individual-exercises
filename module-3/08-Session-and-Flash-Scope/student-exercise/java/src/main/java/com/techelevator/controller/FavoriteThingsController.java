package com.techelevator.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.FavoriteThings;

@Controller
@RequestMapping("/FavoriteThings")
public class FavoriteThingsController {

	@RequestMapping(path = "/Page1", method = RequestMethod.GET)
	public String getPage1(ModelMap map) {
		return "page1";
	}
	
	@RequestMapping(path = "/Page1", method = RequestMethod.POST)
	public String page1Input(@RequestParam String favoriteColor, HttpSession session) {
		
		FavoriteThings favorites = new FavoriteThings();
		favorites.setFavoriteColor(favoriteColor);
		session.setAttribute("favoriteThings", favorites);
		
		return "redirect:/FavoriteThings/Page2";
	}
	
	@RequestMapping(path = "/Page2", method = RequestMethod.GET)
	public String getPage2(ModelMap map) {
		return "page2";
	}
	
	@RequestMapping(path = "/Page2", method = RequestMethod.POST)
	public String page2Input(@RequestParam String favoriteFood, HttpSession session) {
		
		FavoriteThings favorites = (FavoriteThings) session.getAttribute("favoriteThings");
		favorites.setFavoriteFood(favoriteFood);
		session.setAttribute("favoriteThings", favorites);
		
		return "redirect:/FavoriteThings/Page3";
	}
	
	@RequestMapping(path = "/Page3", method = RequestMethod.GET)
	public String getPage3() {
		return "page3";
	}
	
	@RequestMapping(path = "/Page3", method = RequestMethod.POST)
	public String page3Input(@RequestParam String favoriteSeason, HttpSession session) {
		
		FavoriteThings favorites = (FavoriteThings) session.getAttribute("favoriteThings");
		favorites.setFavoriteSeason(favoriteSeason);
		System.out.println(favoriteSeason);
		session.setAttribute("favoriteThings", favorites);
		
		return "redirect:/FavoriteThings/favoritesSummary";
	}
	
	@RequestMapping(path = "/favoritesSummary", method = RequestMethod.GET)
	public String getFavoritesSummary(HttpSession session) {
		//FavoriteThings favorites = (FavoriteThings) session.getAttribute("favoriteThings");
		
		return "favoritesSummary";
	}

}
