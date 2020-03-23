package com.techelevator.zinogreFanSite;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.zinogreFanSite.daomodel.JDBCProductDao;
import com.techelevator.zinogreFanSite.daomodel.Product;

@Controller
public class StoreController {
	
	@Autowired
	private JDBCProductDao productDao;
	
	@RequestMapping(path = "/store", method = RequestMethod.GET)
	public String displayStore(ModelMap map) {
		
		List<Product> productList = productDao.getAllProducts();
		
		map.addAttribute("productList", productList);
		
		return "store";
	}
	
	@RequestMapping(path = "/detail", method = RequestMethod.GET)
	public String displayDetail(ModelMap map) {
		
		return "detail";
	}

}
