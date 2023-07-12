package in.ganesh;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ganesh.entity.User;
import in.ganesh.repository.UserRepository;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context	=SpringApplication.run(DataJpaApplication.class, args);
	
	UserRepository userRepo =context.getBean(UserRepository.class);
	
	// System.out.println(userRepo.getClass().getName());
//	User entity = new User();
//	entity.setUserId(103);
//	entity.setUserName("Nagesh");
//	entity.setUserPhone("9890666437");
//	entity.setUserAge(25);
//	entity.setUerCountry("India");
//	
//	
//	User entity1 = new User();
//	entity1.setUserId(104);
//	entity1.setUserName("Amol");
//	entity1.setUserPhone("9890666459");
//	entity1.setUserAge(24);
//	entity1.setUerCountry("India");
//	
//	User entity2 = new User();
//	entity2.setUserId(106);
//	entity2.setUserName("Golu");
//	entity2.setUserPhone("9890666457");
//	entity2.setUserAge(24);
//	entity2.setUerCountry("India");
//	
//	
//	List<User> enti = Arrays.asList(entity,entity1,entity2);
//	
//	userRepo.saveAll(enti);
//	 
//Optional<User> findbyId	=userRepo.findById(102);
//	if(findbyId.isPresent()) {
//		System.out.println(findbyId.get());
//}
	 
	
//	Iterable<User> findAllById = userRepo.findAllById(Arrays.asList(101,102));
//	findAllById.forEach(user -> {
//		System.out.println(user);
//	});
	
//	Iterable<User> findAll= userRepo.findAll();
//	findAll.forEach(user -> {
//	System.out.println(user);
//	});
	
	//System.out.println("Total record : : "+ userRepo.count());
	//userRepo.deleteById(102);
	
	
	
	
	System.out.println("*** Recorded Inserted Succesfully ***");
	}

}
