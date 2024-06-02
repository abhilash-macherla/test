package com.ashokit.studentenquiry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.studentenquiry.entities.StudentEnqEntity;

public interface StudentEnquiriesRepository extends JpaRepository<StudentEnqEntity, Integer> {
   
}
