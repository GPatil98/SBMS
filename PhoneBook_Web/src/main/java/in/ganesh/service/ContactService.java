package in.ganesh.service;

import java.util.List;

import in.ganesh.dto.Contact;


public interface ContactService {
	
	boolean saveContact(Contact c);
	List<Contact> getAllContacts();
	
	Contact getContactById(Integer cid);
	
	boolean updatecontact(Contact c);
	
	boolean deleteContact(Integer cid);

}
