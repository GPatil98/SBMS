package in.ganesh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


import in.ganesh.service.AccountService;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context	=SpringApplication.run(DataJpaApplication.class, args);

		
		AccountService accountService = context.getBean(AccountService.class);
		//accountService.saveAccData();
		accountService.getDataUsingPK();


		//System.out.println("Good Work Ganesh patil");
		context.close();

	}

}
