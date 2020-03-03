package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

    @RequestMapping("/customerList")
    public String displayCustomerSearch() {
    	return "customerList";
    }
    
    
    @RequestMapping("/customerSearchResults")
    public String displayCustomerSearchResults(
    		@RequestParam String search, @RequestParam String sort, ModelMap customerMap) {
    	
    	
    	List<Customer> customers = customerDao.searchAndSortCustomers(search, sort);
    	customerMap.put("customers", customers);
    	
    	return "customerList";
    }
    
    
}