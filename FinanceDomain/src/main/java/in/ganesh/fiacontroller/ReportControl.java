package in.ganesh.fiacontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.ganesh.fiaservices.ReportService;

@Controller
public class ReportControl {
	
	/*
	 * @Autowired(required = true) private ReportService service;
	 */
	public ReportControl() {
		// TODO Auto-generated constructor stub
	}
	
	

	@GetMapping("/")
	public String indexPage() {
		
		return "index";
	}
}
