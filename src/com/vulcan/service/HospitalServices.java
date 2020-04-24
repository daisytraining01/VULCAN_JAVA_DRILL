package com.vulcan.service;

import com.vulcan.model.Patient;

public interface HospitalServices {

	void Admitted(Patient p, String doctorName);
	void Icu(Patient p, String doctorName);
	void Discharge(Patient p);
	void Payment(String name, int amount);
	void Consultaion(Patient p, String doctorName);
	
}
