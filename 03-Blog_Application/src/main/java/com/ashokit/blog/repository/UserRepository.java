package com.ashokit.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.blog.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
        public User findByEmailAndPassword(String email,String password);
        
}
