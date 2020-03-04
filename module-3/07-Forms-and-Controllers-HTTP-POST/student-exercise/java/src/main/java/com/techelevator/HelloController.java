package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.JdbcReviewDao;
import com.techelevator.model.Review;

@Controller
public class HelloController {

	@Autowired
	private JdbcReviewDao reviewDao;
	
	@RequestMapping("/greeting")
	public String displayGreeting(HttpSession session, ModelMap map) {

		List<Review> reviews = reviewDao.getAllReviews();
		map.put("reviews", reviews);
		
		return "greeting";
	}
	
	@RequestMapping(path = "/reviewInput", method = RequestMethod.POST)
	public String inputReviewPage(@RequestParam String username, @RequestParam String title,
			@RequestParam String reviewText, @RequestParam int rating, ModelMap map) {
		
		Review review = new Review();
		review.setUsername(username);
		review.setTitle(title);
		review.setRating(rating);
		review.setText(reviewText);
		review.setDateSubmitted(LocalDateTime.now());
		
		reviewDao.save(review);
		
		map.put("review", review);
		return "redirect:/greeting";
	}
}
