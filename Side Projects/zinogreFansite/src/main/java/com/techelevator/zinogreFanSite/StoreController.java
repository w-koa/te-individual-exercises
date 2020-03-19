package com.techelevator.zinogreFanSite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StoreController {
	
	@RequestMapping(path = "/store", method = RequestMethod.GET)
	public String displayStore(ModelMap map) {
		
		
		
		return "store";
	}
	
	@RequestMapping(path = "/detail", method = RequestMethod.GET)
	public String displayDetail(ModelMap map) {
		
		return "detail";
	}

}
