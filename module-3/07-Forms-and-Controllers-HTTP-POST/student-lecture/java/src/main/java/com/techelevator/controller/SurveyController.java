package com.techelevator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Survey;
import com.techelevator.model.SurveyDAO;

@Controller
public class SurveyController {

	@Autowired
	private SurveyDAO surveyDao;
	
	
	@RequestMapping(path = "/surveyInput", method = RequestMethod.GET)
	public String showSurveyInput() {
		return "surveyInput";
	}


}
