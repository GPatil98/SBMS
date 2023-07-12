package in.ganesh.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable

public class AccountPK  implements Serializable{
	
	private Integer accId;
	private String accType;
	private String accName;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
	

}
