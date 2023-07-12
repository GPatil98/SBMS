package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ganesh.bindings.LoginForm;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String loginpage(Model model) {
		
		LoginForm loginFormobj = new LoginForm();
		
		model.addAttribute("LoginForm",loginFormobj);
		return "index";
	}
	@PostMapping("/CheckLogin")
	public String CheckLogin(LoginForm formObj, Model model) {
		if(formObj.getEmail().equals("ganesh@123") && formObj.getPswd().equals("Sara@123")) {
			model.addAttribute("msg", "Welcome To my Page");
			
			return "dashbord";
		}
		else {
			
			model.addAttribute("msg", "Bhag Bhosdike");
			return "index";
		}
	}

}
