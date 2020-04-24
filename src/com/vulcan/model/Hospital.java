package com.vulcan.model;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private List<Patient> patients = new ArrayList<Patient>();
	public List<Doctor> doctors = new ArrayList<Doctor>();
	private int Balance=0;
	
	
	
	public Hospital() {
		List<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(new Doctor("Mohan", "RPM", "10", "06.00 PM to 10.00PM"));
		doctors.add(new Doctor("Kevin", "RPM", "10", "06.00 PM to 10.00PM"));
		
		this.doctors = doctors;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = Balance + balance;
	}
	
	public void printDoctorsdata() {
		for(Doctor doctor: doctors) {
			
			if(doctor.isStatus()) {
				System.out.println(doctor.getName() + " is Available \n");
			}else {
				System.out.println(doctor.getName() + " is Not Available \n");
			}
			
		}
	}
	public void ResetDoctors() {
		for(Doctor doctor: doctors) {
			
			doctor.setStatus(true);
			
		}
	}
			
	
}
