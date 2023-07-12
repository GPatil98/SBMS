package in.ganesh.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="BANK_ACCOUNTS")
public class Account {
	
	@Column (name = "BARNCH_NAME")
	private String branchName;
	
	@Column (name = "MIN_BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPK accpk;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}

	public AccountPK getAccpk() {
		return accpk;
	}

	public void setAccpk(AccountPK accpk) {
		this.accpk = accpk;
	}
	
	

}
