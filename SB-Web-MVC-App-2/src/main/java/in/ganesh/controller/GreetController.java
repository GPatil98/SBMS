package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetController {
	
	@GetMapping("/welcome")
	public ModelAndView greetmsg() {
		ModelAndView mvc =new ModelAndView();
		
		mvc.addObject("msg", "Hello Good Morning");
		mvc.setViewName("dashbord");
		return mvc;
		
	}

}
