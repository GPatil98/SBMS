package in.ganesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ganesh.binding.Student;

@Controller
public class StudentController {

	
	@GetMapping("/student")
	public String loadform(Model model) {
		
		model.addAttribute("student" , new Student());
		
		return "index";
	}
	
	@PostMapping("/saveStudent")
	public String handleRegisterBtn(Student student, Model model) {
	
		
		System.out.println(student);
		String name =student.getName();
		String msgtxt = name + " , Your registration Complited Succesfully .. !!";
		model.addAttribute("msg" , msgtxt);
		
		return "success";
	}

}
