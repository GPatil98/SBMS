package in.ganesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.ganesh.dto.Contact;
import in.ganesh.service.ContactService;

@Controller
public class ContactInfoController {
	
	
	@Autowired
	private ContactService contsrv;
	
	@GetMapping(value={"/","/addContact"})
	public String  loadform (Model model) {
		Contact c = new Contact();
		model.addAttribute("contact",c); 
		
		return "index";
	}
	
	@PostMapping(value= "/saveContact")
	public String handlesubmitbtn( @ModelAttribute("contact") Contact c,  Model model) {
		
		boolean isSaved =contsrv.saveContact(c); 
		
		if(isSaved) {
			model.addAttribute("sucMsg", "Contact Saved Succesfully");
		}
		else {
			model.addAttribute("errmsg", "Contact Failed To Saved");
		}
		return "index";
	}

}
