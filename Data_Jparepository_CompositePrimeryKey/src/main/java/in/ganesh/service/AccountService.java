package in.ganesh.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.ganesh.entity.Account;
import in.ganesh.entity.AccountPK;
import in.ganesh.repository.AccountRepository;

@Service
public class AccountService {
	
	private AccountRepository accRepo;
	
	
	public AccountService(AccountRepository accRepo) {
	
	this.accRepo=accRepo;
	
	}
	
	public void getDataUsingPK() {
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("Current");
		pk.setAccName("IBM");
		
		Optional<Account> findById = accRepo.findById(pk);
		
		if (findById.isPresent()) {
			System.out.println(findById.get());
		}
		
        }
        
	public void saveAccData() {
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("Seving");
		pk.setAccName("Infosys");
		
		
		Account acc= new Account();
		
		acc.setBranchName("Matul");
		acc.setMinBal(50000.23);
		acc.setAccpk(pk);
		
		accRepo.save(acc);
		
		
	}
}
