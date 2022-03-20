package com.example.demo.model;

public class ApplicantResponse {

	private Long id;
	private String message;
	
	
	public ApplicantResponse() {}
	
	public ApplicantResponse(Long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
