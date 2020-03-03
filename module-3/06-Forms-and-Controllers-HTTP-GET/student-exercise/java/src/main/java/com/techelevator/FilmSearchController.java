package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.CategoryDao;
import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Category;

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
    public String searchFilms(@RequestParam String minLength, @RequestParam String maxLength, @RequestParam String genre) {
    	
    	
    	
        return null;
    }

}