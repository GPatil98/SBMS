package in.ganesh.repository;

import org.springframework.data.repository.CrudRepository;

import in.ganesh.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
