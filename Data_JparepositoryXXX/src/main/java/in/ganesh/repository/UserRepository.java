package in.ganesh.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ganesh.entity.User;

//@EnableAutoConfiguration
public interface UserRepository extends JpaRepository<User, Integer> {

//	// we use below findB y method
//	
//	//select * from users_tbl where user_age=?
//	
//	public List<User> findByUserAge(Integer age);
//	
//	//select * from users_tbl where user_Country=?
//	public List<User> findByUserCountry(String userCountry);
//	
//	//select * from users_tbl where UserAgeAnduser_Country=?
//	public List<User> findByUserAgeAndUserCountry(Integer age, String userCountry);
//	
//
//	// if we want to create custom query thats time we use  this type of method
//	 // to execute custom queries we will use @Query annotation
//	@Query (value = "from user where userAge=:age")
//	public List<User> getByAge (Integer age);
//	
}
