package com.ashokit.studentenquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.studentenquiry.entities.UserDtlsEntity;

public interface UserRepository extends JpaRepository<UserDtlsEntity, Integer> {
	
	UserDtlsEntity findByEmail(String email);
	
	UserDtlsEntity findByEmailAndPassword(String email,String password);

}

