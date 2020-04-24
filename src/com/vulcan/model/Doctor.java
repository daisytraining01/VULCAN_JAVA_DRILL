package com.vulcan.model;

public class Doctor {
	
	
	String name;
	String speciality;
	String exprience;
	String availableTime;
	Patient HandlingPatient;
	boolean Status;
	
	
	
	public Patient getHandlingPatient() {
		return HandlingPatient;
	}
	public void setHandlingPatient(Patient handlingPatient) {
		HandlingPatient = handlingPatient;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	public Doctor(String name, String speciality, String exprience, String availableTime) {
		this.name = name;
		this.speciality = speciality;
		this.exprience = exprience;
		this.availableTime = availableTime;
		this.Status=true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getExprience() {
		return exprience;
	}
	public void setExprience(String exprience) {
		this.exprience = exprience;
	}
	public String getAvailableTime() {
		return availableTime;
	}
	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}
	
	
	

}
