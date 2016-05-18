package myspring.controller;

import myspring.entity.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public void home(String id, Model model) {
		model.addAttribute("id", id);
		model.addAttribute("message", "BaoXuebin");
	}
	
	@RequestMapping(value="/input", method=RequestMethod.GET)
	public User input() {
		User user = new User();
		return user;
	}
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public User show(User user) {
		return user;
	}
}
