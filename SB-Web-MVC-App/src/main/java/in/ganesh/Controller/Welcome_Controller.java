package in.ganesh.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Welcome_Controller {

	@GetMapping("/welcome")
	public ModelAndView Welcomemsg() {
		ModelAndView mvc = new ModelAndView();
		mvc.addObject("msg" , "Welcome to spring web mvc..!!");
		mvc.setViewName("index");
	
		return mvc;
	}
	
}
