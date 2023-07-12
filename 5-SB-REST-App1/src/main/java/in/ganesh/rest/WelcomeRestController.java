package in.ganesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	/*
	 * @GetMapping("/welcome") public String welcomemsg() { return
	 * " Welcome to Rest Api Development Zone !!!"; }
	 */
	
	 @GetMapping("/welcome")
	public ResponseEntity<String> welcomemsg( @RequestParam ("name" )String str){
		
		
		String msg = str +", Welcome to Ganeh Patil App..!!";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		
	}
}
