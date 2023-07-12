package in.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.ganesh.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
