package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Applicant;
import com.example.demo.model.ApplicantRequest;
import com.example.demo.model.ApplicantResponse;
import com.example.demo.service.ApplicantService;

@RestController
public class ApplicantController {

	@Autowired
	ApplicantService applicantService;
	
	@PostMapping(path = "/add",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	ApplicantResponse addApplicant(@RequestBody ApplicantRequest applicant){
		
		String name = applicant.getName();
		String descripton = applicant.getDescription();		
		
		System.out.println(applicant.toString());
		
		Applicant response = applicantService.addApplicant(new Applicant(name, descripton));
		
		System.out.println(response.toString());
		
		return new ApplicantResponse(response.getId(),"Application submitted");	
	}
	
}
