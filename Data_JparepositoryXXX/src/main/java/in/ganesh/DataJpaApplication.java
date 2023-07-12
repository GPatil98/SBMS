package in.ganesh;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.User;
import in.ganesh.repository.UserRepository;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context	=SpringApplication.run(DataJpaApplication.class, args);

		UserRepository userRepository =context.getBean(UserRepository.class);



	

		User entity = new User();
		//entity.setUserId(108);
		entity.setUserName("Nagesh");
		entity.setUserAge(27);
		entity.setUserPhone("8788466426");

		entity.setUerCountry("India");
		
		userRepository.save(entity);


//		List<User> findAll= userRepository.findByUserAge(23);
//		for(User user : findAll)
//		{
//			System.out.println(user);
//		}
		System.out.println("Good Work Ganesh patil");

	}

}
