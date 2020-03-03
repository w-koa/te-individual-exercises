package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.CategoryDao;
import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;
    @Autowired
    CategoryDao categoryDao;

    @RequestMapping("/filmList")
    public String showFilmSearchForm() {
    	
        return "filmList";
    }

    
    
    @RequestMapping("/filmSearchResults")
    public String searchFilms(@RequestParam String genre, @RequestParam String minLength, @RequestParam String maxLength,
    		 ModelMap filmMap) {
    	
    	int minLengthInt = Integer.parseInt(minLength);
    	int maxLengthInt = Integer.parseInt(maxLength);
    	List<Film> matchingFilms = filmDao.getFilmsBetween(genre, minLengthInt, maxLengthInt);
    	
    	filmMap.put("matchingFilms", matchingFilms);
    	
        return "filmList";
    }

}