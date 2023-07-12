package in.ganesh;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import in.ganesh.entity.User;
import in.ganesh.repository.UserRepository;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	=SpringApplication.run(DataJpaApplication.class, args);
	
	 UserRepository userRepository =context.getBean(UserRepository.class);
	 
	 // if we want to retrieve the all data thats time we use findAll ();
	 
	 // if we want to retrieve ascending order data thats time we use sort.by ().ascending() method
	// List<User> findAll = userRepository.findAll(Sort.by("userId").ascending());
	 
	// if you want 0 to 3 number of data retrieve that time we use page request paggingSorting ( Pagination )
	// List<User> findAll = userRepository.findAll( PageRequest.of(0, 3)).getContent();
	 
	 
	 User  userEntity = new User();
	 userEntity.setUerCountry("India");
	 Example<User> example = Example.of(userEntity);
	 
	 List<User> findAll = userRepository.findAll(example);
	 for(User user : findAll)
	 {
		 System.out.println(user);
	 }
	System.out.println("Good Work Ganesh patil");
	
	}

}
