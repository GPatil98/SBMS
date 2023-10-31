package in.ganesh.fiaentity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Data
@Entity 
@Table(name="CITIZEN_CLIENT_INFO")
public class Citizen_Plan implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer citizenId;
	private String citizenName;
	private String gender;
	private String planName;
	private String planStatus;
	private LocalDate planStart_Date;
	private LocalDate planEnd_Date;
	private Double benifit_Amt;
	private String denial_Reson;
	private LocalDate terminated_Date;
	private String termination_Reson;
	public Integer getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(Integer citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public LocalDate getPlanStart_Date() {
		return planStart_Date;
	}
	public void setPlanStart_Date(LocalDate planStart_Date) {
		this.planStart_Date = planStart_Date;
	}
	public LocalDate getPlanEnd_Date() {
		return planEnd_Date;
	}
	public void setPlanEnd_Date(LocalDate planEnd_Date) {
		this.planEnd_Date = planEnd_Date;
	}
	public Double getBenifit_Amt() {
		return benifit_Amt;
	}
	public void setBenifit_Amt(Double benifit_Amt) {
		this.benifit_Amt = benifit_Amt;
	}
	public String getDenial_Reson() {
		return denial_Reson;
	}
	public void setDenial_Reson(String denial_Reson) {
		this.denial_Reson = denial_Reson;
	}
	public LocalDate getTerminated_Date() {
		return terminated_Date;
	}
	public void setTerminated_Date(LocalDate terminated_Date) {
		this.terminated_Date = terminated_Date;
	}
	public String getTermination_Reson() {
		return termination_Reson;
	}
	public void setTermination_Reson(String termination_Reson) {
		this.termination_Reson = termination_Reson;
	}
	
	
}
