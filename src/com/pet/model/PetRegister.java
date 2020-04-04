package com.pet.model;

import java.util.Date;

public class PetRegister {
	private String petId;
	private int speciesId;

	private String speciesName;
	private String petName;
	private String petSex;
	private Date petBirth;
	private Date petDeath;
	private String ownerID;

	public String getPetId() {
		return petId;
	}

	public void setPetId(String petId) {
		this.petId = petId;
	}

	public int getSpeciesId() {
		return speciesId;
	}

	public void setSpeciesId(int speciesId) {
		this.speciesId = speciesId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getPetSex() {
		return petSex;
	}

	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}

	public Date getPetBirth() {
		return petBirth;
	}

	public void setPetBirth(Date petBirth) {
		this.petBirth = petBirth;
	}

	public Date getPetDeath() {
		return petDeath;
	}

	public void setPetDeath(Date petDeath) {
		this.petDeath = petDeath;
	}

	public String getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String speciesName) {
		this.speciesName = speciesName;
	}

}
