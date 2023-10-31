package in.ganesh.dto;


import java.io.Serializable;

import lombok.Data;



@Data
public class Contact implements Serializable {
	
	private Integer contactId;
	
	private String contactName;
	
	private String contactEmail;
	
	private Long contactNumber;
	
	private Data createdDate;
	
	private Data updateDate;
	
	
	

}
