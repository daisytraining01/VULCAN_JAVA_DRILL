package com.vulcan.system;

import java.util.Scanner;

import com.vulcan.model.Hospital;
import com.vulcan.model.Patient;
import com.vulcan.serviceimpl.HospitalServicesImpl;

public class Start {

	public static Hospital hospital = new Hospital();
	public static HospitalServicesImpl services = new HospitalServicesImpl();
	public static  Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		while (true) {
			
			System.out.println("****************Welcome to Hospital*************\n");
			System.out.println("Below are the doctors list\n");
			
			hospital.printDoctorsdata();
			System.out.println("Please enter the Reason For Visit \n1.Consulation \n2.Admission");
			int reason = sc.nextInt();
			System.out.println("please enter the below details");
			
			Patient newPatient1 = new Patient();
			System.out.println("Please enter the name");
			newPatient1.setName(sc.next());
			System.out.println("Please enter the Age");
			newPatient1.setAge(sc.nextInt());

			System.out.println("Please enter the Gender");
			newPatient1.setGender(sc.next());

			System.out.println("Please enter the Address");
			newPatient1.setAddress(sc.next());

			System.out.println("Please enter the MobileNumber");
			newPatient1.setMobileNumber(sc.next());

			System.out.println("Please enter the Date of Birth");
			newPatient1.setDateOfbirth(sc.next());
			
			hospital.getPatients().add(newPatient1);
			switch (reason) {
			case 1:
				newPatient1.setReasonForVisit("Consultation");
				services.Consultaion(newPatient1, "Mohan");
				
				break;
			case 2:
				newPatient1.setReasonForVisit("Admission");
				services.Admitted(newPatient1, "Kevin");
				break;

			}
			
			services.Discharge(newPatient1);
			System.out.println("Hospital has got amount of " + hospital.getBalance());
			hospital.ResetDoctors();
			
		}
		
		
	}

}
