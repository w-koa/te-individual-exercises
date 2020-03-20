package com.techelevator.zinogreFanSite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.zinogreFanSite.daomodel.HitzoneData;
import com.techelevator.zinogreFanSite.daomodel.JDBCHitzoneDataDao;

@Controller 
public class HomeController {

	@Autowired
	private JDBCHitzoneDataDao hitzoneDao;
	
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String displayHome() {
		
		return "home";
	}
	
	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String displayAbout(ModelMap map) {
		
		List<HitzoneData> hitzoneDataList = hitzoneDao.getAllHitzoneData();
		
		map.addAttribute("allHitzoneData", hitzoneDataList);
		
		
		
		return "about";
	}
	

}
