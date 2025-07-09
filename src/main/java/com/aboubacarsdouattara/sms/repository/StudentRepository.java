package com.aboubacarsdouattara.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aboubacarsdouattara.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
