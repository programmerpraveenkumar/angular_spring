package com.test.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.DTO.ContactRequestDTO;
import com.test.demo.Model.ContactModel;
import com.test.demo.repository.ContactRepo;

@Service
public class ContactService {
	@Autowired
	ContactRepo contactRepo;
	public Boolean storeData(ContactRequestDTO contactDto) {
		try {
			ContactModel contactModel = new ContactModel();
			contactModel.setName(contactDto.getName());
			contactModel.setEmail(contactDto.getEmail());
			contactModel.setMessage(contactDto.getMessage());
			contactRepo.save(contactModel);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public List<ContactModel> getContactStoredInformation(){
		return contactRepo.findAll();
	}
}
