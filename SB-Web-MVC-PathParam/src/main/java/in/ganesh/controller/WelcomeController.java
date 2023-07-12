package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	
	@GetMapping("/welcome/{name}")
	public String welcomemsg( @PathVariable ("name")String name, Model model) {
		
		
		String msgtxt = name + " , welcome to Spring web mvc";
		model.addAttribute("msg", msgtxt);
		
		return "index";
		
		
	}
}
