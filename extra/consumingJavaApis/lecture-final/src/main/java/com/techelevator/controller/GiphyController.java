package com.techelevator.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class GiphyController {

	@RequestMapping("/giftime")
	public String wasteTime(@RequestParam String searchParam, @RequestParam Integer limits, HttpServletRequest request) throws JsonProcessingException, IOException {
		
		// 1. Construct the request
		String apiURL = "https://api.giphy.com/v1/gifs/search?";
		String keyValue = "nope";
		String exchange = apiURL + "api_key=" + keyValue + "&q=" + searchParam + "&limit=" + limits.toString();
		
		
		// 2. Helper objects you need, look at the import section a well:
		HttpEntity<String> httpEntity = new HttpEntity<>("");
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		// 3. The .exchange method makes the call, send the request from step 1.
		ResponseEntity<String> response = restTemplate.exchange(exchange, HttpMethod.GET, httpEntity, String.class);		
		
		
		// 4. Read the response into a format I can understand.
		JsonNode jsonNode = objectMapper.readTree(response.getBody());
		
		
		// 5. Parse the data to get what you want.
		// The path method applied to a JsonNode gets you to a node on a tree, you can chain them too!
		// In this case want to loop up to the limit.	
		System.out.println(jsonNode.path("data").size());
		System.out.println(jsonNode.path("data").path(0).path("type"));
		System.out.println(jsonNode.path("data").path(0).path("slug"));
		
		
		// 6. Let's try something more complicated, let's loop through all the nodes and pick up the
		// gifs associated with each node. The total number of nodes depends on the "limits" parameter.
		List <String> gifResults = new ArrayList<>();
		
		for (int i =0; i < jsonNode.path("data").size(); i++) {
		
			// Compare these chained path calls to the structure of the JSON from POSTMAN, do you see a pattern?
			gifResults.add(jsonNode.path("data").path(i).path("images").path("fixed_width").findPath("url").toString());
		}
		
		request.setAttribute("listOfGifs",gifResults);
		
		return "gifpage";
	}
}
