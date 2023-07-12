package in.ganesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbWebBookStoreAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbWebBookStoreAppApplication.class, args);
		/*
		 * new SpringApplicationBuilder(SbWebBookStoreAppApplication.class)
		 * .web(WebApplicationType.NONE) .run(args);
		 */
	}

}
