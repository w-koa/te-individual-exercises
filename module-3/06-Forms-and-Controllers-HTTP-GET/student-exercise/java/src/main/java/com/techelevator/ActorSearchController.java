package com.techelevator;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping({"/actorList", "/"})
	/* What request mapping do we want here */
	public String showSearchActorForm() {
		
		return "actorList";
	}

	@RequestMapping("/actorSearchResult")
	/* What about here? */
	public String searchActors(/* What arguments go here to get parameters from the page? */
			@RequestParam String lastName, ModelMap actorMap) {
		/* Call the model and pass values to the jsp */
		
		List<Actor> matchingActors = actorDao.getMatchingActors(lastName);
		
		actorMap.put("matchingActors", matchingActors);
		return "actorList";
	}
}
