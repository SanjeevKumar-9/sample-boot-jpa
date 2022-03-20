package com.example.demo.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

}
