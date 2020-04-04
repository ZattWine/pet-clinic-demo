package com.pet.mapper;

import java.util.List;

import com.pet.model.AdminPassword;
import com.pet.model.DoctorSchedule;
import com.pet.model.DrugType;
import com.pet.model.Login;
import com.pet.model.MakeAppointment;
import com.pet.model.PetById;
import com.pet.model.PetDrug;
import com.pet.model.PetRegister;
import com.pet.model.PetSpecies;
import com.pet.model.PetUpdate;
import com.pet.model.RegisterDoctor;
import com.pet.model.RegisterOwner;

public interface PetMapper {
	public List<Login> getAll();

	public List<PetSpecies> getAllSpecies();

	public List<DoctorSchedule> getAllSchedule();

	public void processSaveOwner(RegisterOwner o);

	public void processSaveDoctor(RegisterDoctor d);

	public void processSavePet(PetRegister p);

	public void processMakeAppointment(MakeAppointment p);

	public void processUpdateAdmin(AdminPassword p);

	public void processUpdateDoctor(AdminPassword p);

	public void processUpdateOwner(AdminPassword p);

	public void processUpdatePet(PetUpdate p);

	public void processSaveDrugType(DrugType d);

	public void processSavePetDrug(PetDrug p);

	public List<PetById> getPetById(String Id);

	public List<MakeAppointment> getAllAppointment();

	public List<PetUpdate> getAllPet();

	public List<PetDrug> getAllDrugList();

	public List<DrugType> getAllDrugTime();

}
