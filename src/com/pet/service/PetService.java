package com.pet.service;

import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.dao.PetDao;
import com.pet.form.AdminPasswordForm;
import com.pet.form.DoctorScheduleForm;
import com.pet.form.DrugTypeForm;
import com.pet.form.MakeAppointmentForm;
import com.pet.form.PetByIdForm;
import com.pet.form.PetDrugForm;
import com.pet.form.PetDrugForm2;
import com.pet.form.PetLoginForm;
import com.pet.form.PetRegisterForm;
import com.pet.form.PetSpeciesForm;
import com.pet.form.RegisterDoctorForm;
import com.pet.form.RegisterOwnerForm;
import com.pet.form.UpdatePetForm;
import com.pet.model.AdminPassword;
import com.pet.model.DrugType;
import com.pet.model.Login;
import com.pet.model.MakeAppointment;
import com.pet.model.PetDrug;
import com.pet.model.PetRegister;
import com.pet.model.PetUpdate;
import com.pet.model.RegisterDoctor;
import com.pet.model.RegisterOwner;

public class PetService {
	private PetDao petDao;

	public PetService(SqlSessionFactory sf) {
		this.petDao = new PetDao(sf);

	}

	public void processPet(UpdatePetForm myForm) {
		myForm.settotalpetList(this.petDao.getPetList(0));
	}

	public void processSpecies(PetSpeciesForm myForm) {
		myForm.setSpeciesName(this.petDao.getSpeciesList(0));
	}

	public void processLoad(PetLoginForm myForm) {
		myForm.setLoginList(this.petDao.getLoginList(0));
	}

	public void processSchedule(DoctorScheduleForm myForm) {
		myForm.setScheduleList(this.petDao.getScheduleList(0));
	}

	public void processPetDrugList(PetDrugForm2 myForm) {
		myForm.setDrugList(this.petDao.getdrugList((0)));
	}

	public void processPetDrugTime(DrugTypeForm myForm) {
		myForm.setPetdrugList(this.petDao.getDrugTime(0));
	}

	public void processAppointment(MakeAppointmentForm myForm) {
		myForm.setAppList(this.petDao.getAppointmentList(0));
	}

	public void registerOwner(RegisterOwnerForm myForm) {
		RegisterOwner owner = new RegisterOwner();
		owner.setOwnerName(myForm.getOwnerName());
		owner.setOwnerEmail(myForm.getOwnerEmail());
		owner.setOwnerAddress(myForm.getOwnerAddress());
		owner.setOwnerId(myForm.getOwnerId());
		owner.setOwnerPhone(myForm.getOwnerPhone());
		this.petDao.processSavebyOwner(owner);
	}

	public void registerDoctor(RegisterDoctorForm myForm) {
		RegisterDoctor doctor = new RegisterDoctor();
		doctor.setDoctorId(myForm.getDoctorId());
		doctor.setDoctorName(myForm.getDoctorName());
		doctor.setDoctorRank(myForm.getDoctorRank());
		this.petDao.processSavebyDoctor(doctor);

	}

	public void registerPet(PetRegisterForm myForm) {
		PetRegister pet = new PetRegister();
		pet.setOwnerID(myForm.getOwnerID());
		pet.setPetId(myForm.getPetId());
		pet.setPetName(myForm.getPetName());
		pet.setPetBirth(myForm.getPetBirth());
		pet.setPetDeath(myForm.getPetDeath());
		pet.setPetSex(myForm.getPetSex());
		pet.setSpeciesId(myForm.getSpeciesId());
		this.petDao.processSavebyPet(pet);

	}

	public void processmakeAppointment(MakeAppointmentForm form) {
		MakeAppointment app = new MakeAppointment();
		app.setOwnerId(form.getOwnerId());
		app.setAppId(form.getAppId());
		app.setAppDate(form.getAppDate());
		app.setAppTime(form.getAppTime());
		this.petDao.processmakeAppointment(app);
	}

	public void processDrugType(DrugTypeForm form) {
		DrugType d = new DrugType();
		d.setDrugDuration(form.getDrugDuration());
		d.setDrugdurationType(form.getDrugdurationType());
		d.setDrugId(form.getDrugId());
		d.setDrugName(form.getDrugName());
		this.petDao.processSaveDrugType(d);
	}

	public void processPetDrug(PetDrugForm form) {
		PetDrug d = new PetDrug();
		d.setDoctorId(form.getDoctorId());
		d.setDrugDate(form.getDrugDate());
		d.setDrugDesc(form.getDrugDesc());
		d.setDrugId(form.getDrugId());
		d.setDrugNextDate(form.getDrugNextDate());
		d.setPetdrugId(form.getPetdrugId());
		d.setPetId(form.getPetId());
		this.petDao.processSavePetDrug(d);
	}

	public void processupdateAdmin(AdminPasswordForm myForm) {
		AdminPassword pas = new AdminPassword();
		pas.setAdminId(myForm.getAdminId());
		pas.setAdminPassword(myForm.getAdminPassowrd());
		this.petDao.processupdateAdmin(pas);
	}

	public void processselectPetbyId(PetByIdForm form) {

		String id = form.getPetId();

		form.settotalpetList(this.petDao.getPetbyId((id)));
	}

	public void processupdatePet(PetRegisterForm myForm) {
		PetUpdate pet = new PetUpdate();
		pet.setPetId(myForm.getPetId());
		pet.setPetName(myForm.getPetName());
		pet.setPetSex(myForm.getPetSex());

		this.petDao.processupdatePet(pet);

	}

}
