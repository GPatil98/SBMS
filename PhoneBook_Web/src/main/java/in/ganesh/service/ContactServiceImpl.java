package in.ganesh.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ganesh.entity.ContactEntity;
import in.ganesh.repository.ContactdtlsRepository;

@Service
public class ContactServiceImpl implements ContactService{
	
	
	@Autowired
	private ContactdtlsRepository contectrepo;

	@Override
	public boolean saveContact(in.ganesh.dto.Contact c) {
		
		ContactEntity entity = new ContactEntity();
		BeanUtils.copyProperties(c, entity);
		ContactEntity savedEntity =  contectrepo.save(entity);
		return savedEntity.getContactId() != null;
	}

	@Override
	public List<in.ganesh.dto.Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public in.ganesh.dto.Contact getContactById(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatecontact(in.ganesh.dto.Contact c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return false;
	}


}
