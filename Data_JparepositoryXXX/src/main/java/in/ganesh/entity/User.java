package in.ganesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DTLS")

public class User {
	@Id
	@SequenceGenerator(name = " abc", sequenceName = "User_id_Sequence", allocationSize = 1)
	@GeneratedValue(generator = "abc",  strategy = GenerationType.SEQUENCE)
	@Column(name= "USERID")
	private Integer userId;
	
	@Column(name= "UserNAME")
	private String userName;
	
	@Column(name= "USERAGE")
	private Integer userAge;
	
	@Column(name= "USERPHONE")
	private String userPhone;
	
	@Column(name= "USERCOUNTRY")
	private String userCountry;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUerCountry() {
		return userCountry;
	}
	public void setUerCountry(String uerCountry) {
		this.userCountry = uerCountry;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userPhone=" + userPhone
				+ ", uerCountry=" + userCountry + "]";
	}
	
	
	
	
	

}
