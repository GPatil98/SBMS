package in.ganesh.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {

		String msg = "Welcome To Ganesh Patil App ...!!";
		int i = 10 / 0;

		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	
	@ExceptionHandler(value = NullPointerException.class) // public
	ResponseEntity<String> HandlerNpa(NullPointerException ae){
		String error_msg = ae.getMessage(); 
		return new ResponseEntity<>("Operation Null On Is not Allowed",HttpStatus.INTERNAL_SERVER_ERROR); 
	}

	
	@ExceptionHandler(value = ArithmeticException.class) // public
	ResponseEntity<String> HandlerArithematicException(ArithmeticException ae){
		String error_msg = ae.getMessage(); 
		return new ResponseEntity<>("Number can't Devided By ZERO",HttpStatus.INTERNAL_SERVER_ERROR); 
	}

}
