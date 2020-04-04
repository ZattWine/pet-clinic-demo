package com.pet.form;

import java.util.List;

import com.pet.model.PetRegister;
import com.pet.model.PetUpdate;

public class UpdatePetForm {

	public List<PetUpdate> getTotalpetList() {
		return totalpetList;
	}

	public void setTotalpetList(List<PetUpdate> totalpetList) {
		this.totalpetList = totalpetList;
	}

	private List<PetUpdate> totalpetList;

	public List<PetUpdate> gettotalpetList() {
		return totalpetList;
	}

	public void settotalpetList(List<PetUpdate> list) {
		this.totalpetList = list;
	}
}
