package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController  {
	  @GetMapping("/welcome")  
	  
	  //Model is Interface which is used to send the data to ui in key- value pair
	  //model interface having bindingAwareModelMap as the  class
	  // bindingAwareModelMap internally use linkedHashmap to store the data
	public String welcomemsg(Model model) {
		
		  System.out.println(model.getClass().getName());
		  model.addAttribute("msg", "Welcome to Ganesh Patil");
		  return "index";
	  }
	

}
