package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Applicant;
import com.example.demo.respository.ApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService {

	@Autowired
	private ApplicantRepository applicantRepository;
	
	@Override
	public Applicant addApplicant(Applicant applicant) {
		return applicantRepository.save(applicant);
	}

}
