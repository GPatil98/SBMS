package in.ganesh.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ganesh.binding.Person;

@Controller
public class PersonController {
	
	@GetMapping("/person")
	public String displayForm(Model model) {
		
		
		Person personobj= new Person();
		model.addAttribute("person", personobj);
		
		
		return "index";
	}
	
	@PostMapping("/savePerson")
	public String savePerson(@Valid  Person person, BindingResult result, Model model) {
		System.out.println(person);
		
		if (result.hasErrors()) {
			return "index";
		}
		model.addAttribute("msg", person.getName()+ " record saved succeesfully !!!");
		return "data";
	}
	
	

}
