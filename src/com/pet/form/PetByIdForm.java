package com.pet.form;

import java.util.List;

import com.pet.model.PetById;
import com.pet.model.PetUpdate;

public class PetByIdForm {
	private String petId;

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	private List<PetById> totalpetList;

	public List<PetById> getTotalpetList() {
		return totalpetList;
	}

	public void setTotalpetList(List<PetById> totalpetList) {
		this.totalpetList = totalpetList;
	}

	public List<PetById> gettotalpetList() {
		return totalpetList;
	}

	public void settotalpetList(List<PetById> list) {
		this.totalpetList = list;
	}
}
