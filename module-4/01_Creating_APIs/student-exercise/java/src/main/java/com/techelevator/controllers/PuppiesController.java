package com.techelevator.controllers;

import com.techelevator.daos.PuppyDao;
import com.techelevator.models.Puppy;

import java.io.IOException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

/**
 * Puppies API Controller
 * 
 * This controller should handle the following API requests:
 * 
 * GET - /api/allPuppies - return all Puppies in the data base as an array of JSON objects
 * 
 * GET - /api/puppy/# - Returns the Puppy from the data based whose id matches the # specified
 * 
 * POST - /api/newPuppy - Add a Puppy to the database using the Puppy information in the API request
 * 
 * DELETE - /api/removePuppy/# - Delete the Puppy from the database whose id matches the # specified 
 * 
 */

public class PuppiesController {
	
	@Autowired
	PuppyDao thePuppies;
	
}
