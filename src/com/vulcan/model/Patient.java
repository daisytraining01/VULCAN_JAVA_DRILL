package com.vulcan.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;


public class Patient{
	private String name;
	private int age;
	private long id = new Random().nextLong();
	private String gender;
	
	private String address;
	private String dateOfbirth;
	private String mobileNumber;
	private Date dateOfConsultation;
	private String consultingDocter;
	private String reasonForVisit;
	private ArrayList<String> symptoms;
	private ArrayList<String> diseaseName;
	private static int count =100;
	
	
	public Patient(String name, int age,  String gender, String address, String dateOfbirth, String mobileNumber,
			Date dateOfConsultation, String consultingDocter, String reasonForVisit) {
		this.name = name;
		this.age = age;
		
		this.gender = gender;
		this.address = address;
		this.dateOfbirth = dateOfbirth;
		this.mobileNumber = mobileNumber;
		this.dateOfConsultation = new Date();
		this.consultingDocter = consultingDocter;
		this.reasonForVisit = reasonForVisit;
	}
	public Patient() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDateOfConsultation() {
		return dateOfConsultation;
	}
	public void setDateOfConsultation(Date dateOfConsultation) {
		this.dateOfConsultation = dateOfConsultation;
	}
	public String getConsultingDocter() {
		return consultingDocter;
	}
	public void setConsultingDocter(String consultingDocter) {
		this.consultingDocter = consultingDocter;
	}
	public String getReasonForVisit() {
		return reasonForVisit;
	}
	public void setReasonForVisit(String reasonForVisit) {
		this.reasonForVisit = reasonForVisit;
	}
	public ArrayList<String> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(ArrayList<String> symptoms) {
		this.symptoms = symptoms;
	}
	public ArrayList<String> getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(ArrayList<String> diseaseName) {
		this.diseaseName = diseaseName;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Patient.count = count;
	}
	
	
	
	
	 
	 
}
