package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.ganesh.binding.User;

@Controller
public class UserController {
	
	@GetMapping("/user")
	public String getUserData(Model model) {
		
		
		User userobj = new User (101, "Ganesh", "ganesh@gmail.com");
		model.addAttribute("user", userobj);
		return "user-data";
		
	}

}
