package com.test.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.DTO.ContactRequestDTO;
import com.test.demo.Service.ContactService;

@RestController
@RequestMapping("contact")
public class ContactController {
	@Autowired
	ContactService contactservice;
	@PostMapping("/store")
	public ResponseEntity<?> storeTheContactDetail(@RequestBody ContactRequestDTO contactDto) {
		try {
			if(contactDto.getName().equals("")) {
				throw new Exception("Name should not be empty");
			}else if(contactDto.getEmail().equals("")) {
				throw new Exception("Email should not be empty");
			}
			contactservice.storeData(contactDto);
			//service class has to call..
			return ResponseEntity.ok("your details stored successfully....");
		}catch(Exception e) {
			return ResponseEntity.badRequest().body("Error :: "+e.getMessage());
		}
	}
	@GetMapping("/get")
	public ResponseEntity<?> getTheContactDetails(){
		return ResponseEntity.ok(contactservice.getContactStoredInformation());
	}
}
