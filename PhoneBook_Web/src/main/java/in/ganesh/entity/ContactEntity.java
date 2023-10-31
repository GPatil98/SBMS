package in.ganesh.entity;

import java.io.Serializable;

import javax.xml.crypto.Data;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="CONTACT_DTLS")
public class ContactEntity implements Serializable{
	
	
	@Id
	@Column(name="CONTACT_ID")
	@SequenceGenerator(name="cid_seq_gen",
	sequenceName = "CONTACT_ID_SEQ",
	allocationSize = 1
			)
	
	@GeneratedValue(
			generator = "cid_seq_gen",
			strategy = GenerationType.SEQUENCE
			
			)
	private Integer contactId;
	
	@Column(name="CONTACT_ID")
	private String contactName;
	
	@Column(name="CONTACT_EMAIL")
	private String contactEmail;
	
	@Column(name="CONTACT_NUMBER")
	private Long contactNumber;

	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Data createdDate;
	
	
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="PDATED_DATE")
	private Data updateDate;


	public Integer getContactId() {
		return contactId;
	}


	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	public Long getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}


	public Data getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Data createdDate) {
		this.createdDate = createdDate;
	}


	public Data getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Data updateDate) {
		this.updateDate = updateDate;
	}
	
	

	
	

}
