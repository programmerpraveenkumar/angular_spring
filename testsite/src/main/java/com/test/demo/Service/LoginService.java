package com.test.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.Model.UserModel;
import com.test.demo.repository.UserRepository;

@Service
public class LoginService {
	@Autowired
	UserRepository userRepo;
	public String sampleLoginService() {
		List<UserModel> usermodel = userRepo.findAll();
		String tmpstring ="";
		for(UserModel tmp : usermodel) {
			System.out.println("date from databsase "+tmp.getId()+" "+tmp.getName()+" "+tmp.getAge());
			tmpstring = tmpstring+tmp.getId()+" "+tmp.getName()+" "+tmp.getAge();
		}
		return tmpstring;
	}
}
