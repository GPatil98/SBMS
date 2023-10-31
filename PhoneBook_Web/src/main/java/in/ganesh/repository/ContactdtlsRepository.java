package in.ganesh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ganesh.entity.ContactEntity;


public interface ContactdtlsRepository extends JpaRepository<ContactEntity, Serializable> {
	
	

}
