package com.pet.form;

import java.util.Date;
import java.util.List;

import com.pet.model.PetDrug;

public class PetDrugForm {
	private int petdrugId;
	private Date drugDate;
	private Date drugnextDate;
	private String drugDesc;
	private String petId;
	private int drugId;
	private String doctorId;

	public Date getDrugnextDate() {
		return drugnextDate;
	}

	public void setDrugnextDate(Date drugnextDate) {
		this.drugnextDate = drugnextDate;
	}

	public List<PetDrug> getDrugList() {
		return drugList;
	}

	public void setDrugList(List<PetDrug> drugList) {
		this.drugList = drugList;
	}

	private List<PetDrug> drugList;

	public int getPetdrugId() {
		return petdrugId;
	}

	public void setPetdrugId(int petdrugId) {
		this.petdrugId = petdrugId;
	}

	public Date getDrugDate() {
		return drugDate;
	}

	public void setDrugDate(Date drugDate) {
		this.drugDate = drugDate;
	}

	public Date getDrugNextDate() {
		return drugnextDate;
	}

	public void setDrugNextDate(Date drugNextDate) {
		this.drugnextDate = drugNextDate;
	}

	public String getDrugDesc() {
		return drugDesc;
	}

	public void setDrugDesc(String drugDesc) {
		this.drugDesc = drugDesc;
	}

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public int getDrugId() {
		return drugId;
	}

	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

}
