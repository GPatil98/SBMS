package in.ganesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreatRestController {

	@GetMapping("/info")
	public ResponseEntity<String> getData(@RequestParam ("cname" )String cname,
			@RequestParam("tname") String tname){
		String responseMsg = "";
		if (cname.equals("SBMS")& tname.equals("Gaesh")) {
			responseMsg = "New Batch" + cname + " will start by "+tname + "with in a week ..!!";
		}
			else {
				responseMsg= "please visit www.ganeshtech.com for more Details";
			}
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		
	}
}
