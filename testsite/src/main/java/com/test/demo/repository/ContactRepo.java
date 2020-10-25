package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.demo.Model.ContactModel;

public interface ContactRepo extends JpaRepository<ContactModel, Long> {

}
