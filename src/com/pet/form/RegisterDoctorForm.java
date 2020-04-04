package com.pet.form;

import java.util.List;

import com.pet.model.RegisterDoctor;

public class RegisterDoctorForm {
	private String doctorId;
	private String doctorName;
	private String doctorRank;
	private List<RegisterDoctor> doctorList;

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorRank() {
		return doctorRank;
	}

	public void setDoctorRank(String doctorRank) {
		this.doctorRank = doctorRank;
	}

}
