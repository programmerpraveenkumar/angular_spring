package com.test.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="contact")		
public class ContactModel {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	String name,message,email;
	@Column(insertable=false,updatable= false)
	String requested_date;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRequested_date() {
		return requested_date;
	}
	public void setRequested_date(String requested_date) {
		this.requested_date = requested_date;
	}
	
}
