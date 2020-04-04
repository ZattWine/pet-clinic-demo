package com.pet.model;

public class DrugType {
	private int drugId;
	private String drugName;
	private int drugDuration;
	private String drugdurationType;

	public int getDrugId() {
		return drugId;
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
