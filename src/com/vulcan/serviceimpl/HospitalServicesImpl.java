package com.vulcan.serviceimpl;

import java.util.List;

import com.vulcan.model.Doctor;
import com.vulcan.model.Patient;
import com.vulcan.service.HospitalServices;
import com.vulcan.system.Start;

public class HospitalServicesImpl implements HospitalServices{

	List<Doctor> doctors = Start.hospital.getDoctors();
	
	
	@Override
	public void Consultaion(Patient p,String doctorName) {
		
		for(Doctor eachdoctor : doctors) {
			if(eachdoctor.isStatus()){
				eachdoctor.setStatus(false);
				eachdoctor.setHandlingPatient(p);
				break;
			
			}
		}
		Payment(p.getName(), 1000);
	}

	@Override
	public void Admitted(Patient p, String doctorName) {
		for(Doctor eachdoctor : doctors) {
			if(eachdoctor.isStatus()){
				eachdoctor.setStatus(false);
				eachdoctor.setHandlingPatient(p);
				break;
			
			}
		}
		Payment(p.getName(), 2000);
		
	}

	@Override
	public void Icu(Patient p, String doctorName) {
		for(Doctor eachdoctor : doctors) {
			if(eachdoctor.isStatus()){
				eachdoctor.setStatus(false);
				eachdoctor.setHandlingPatient(p);
				break;
			
			}
		}
		Payment(p.getName(), 10000);
		
	}

	@Override
	public void Discharge(Patient p) {
		System.out.println("Successfully "+p.getName()+" recoved Please stay safe");
		
	}
	
	

	@Override
	public void Payment(String name, int amount) {
		System.out.println("Please pay the amount "+amount);
		int Paidamount  = Start.sc.nextInt();
		
		System.out.println("Patient "+name +" has paid the amount "+ Paidamount);
		if(Paidamount == amount) {
			Start.hospital.setBalance(amount);
		}else {
			Start.hospital.setBalance(Paidamount);
		}
		
		
	}

	

	

	

}
