package com.pet.form;

import java.util.List;

import com.pet.model.DrugType;
import com.pet.model.PetDrug;

public class DrugTypeForm {
	private int drugId;
	private String drugName;
	private int drugDuration;
	private String drugdurationType;
	private List<DrugType> petdrugList;

	public int getDrugId() {
		return drugId;
	}

	public List<DrugType> getPetdrugList() {
		return petdrugList;
	}

	public void setPetdrugList(List<DrugType> petdrugList) {
		this.petdrugList = petdrugList;
	}

	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public int getDrugDuration() {
		return drugDuration;
	}

	public void setDrugDuration(int drugDuration) {
		this.drugDuration = drugDuration;
	}

	public String getDrugdurationType() {
		return drugdurationType;
	}

	public void setDrugdurationType(String drugdurationType) {
		this.drugdurationType = drugdurationType;
	}

}
