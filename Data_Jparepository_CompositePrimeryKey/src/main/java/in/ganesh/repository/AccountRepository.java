package in.ganesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ganesh.entity.Account;
import in.ganesh.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
