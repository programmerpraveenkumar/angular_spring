package com.test.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.demo.Model.UserModel;
//crud -- create update read delete
@Repository
public interface UserRepository extends JpaRepository<UserModel, Long>{

}
