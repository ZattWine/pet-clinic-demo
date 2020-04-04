package com.pet.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.form.RegisterOwnerForm;
import com.pet.mapper.PetMapper;
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

public class PetDao {
	private SqlSessionFactory sfactory;

	public PetDao(SqlSessionFactory sf) {
		this.sfactory = sf;
	}

	public List<Login> getLoginList(int userId) {
		List<Login> l = new ArrayList<Login>();
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			if (userId == 0)
				l = um.getAll();
			s.commit();
			s.close();
		} catch (Exception e) {
		}
		return l == null || l.isEmpty() || l.get(0) == null ? null : l;
	}

	public List<DoctorSchedule> getScheduleList(int userId) {
		List<DoctorSchedule> l = new ArrayList<DoctorSchedule>();
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			if (userId == 0)
				l = um.getAllSchedule();
			s.commit();
			s.close();
		} catch (Exception e) {
		}
		return l == null || l.isEmpty() || l.get(0) == null ? null : l;
	}

	public List<PetDrug> getdrugList(int userId) {
		List<PetDrug> l = new ArrayList<PetDrug>();
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			if (userId == 0)
				l = um.getAllDrugList();
			s.commit();
			s.close();
		} catch (Exception e) {
		}
		return l == null || l.isEmpty() || l.get(0) == null ? null : l;
	}

	public List<PetSpecies> getSpeciesList(int userId) {
		List<PetSpecies> l = new ArrayList<PetSpecies>();
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			if (userId == 0)
				l = um.getAllSpecies();
			s.commit();
			s.close();
		} catch (Exception e) {
		}
		return l == null || l.isEmpty() || l.get(0) == null ? null : l;
	}

	public List<PetUpdate> getPetList(int userId) {
		List<PetUpdate> l = new ArrayList<PetUpdate>();
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			if (userId == 0)
				l = um.getAllPet();
			s.commit();
			s.close();
		} catch (Exception e) {
		}
		System.out.println("pet list" + l);
		return l == null || l.isEmpty() || l.get(0) == null ? null : l;
	}

	public List<DrugType> getDrugTime(int userId) {
		List<DrugType> l = new ArrayList<DrugType>();
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			if (userId == 0)
				l = um.getAllDrugTime();
			s.commit();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("pet list" + l.get(0).getDrugDuration());
		return l == null || l.isEmpty() || l.get(0) == null ? null : l;
	}

	public List<MakeAppointment> getAppointmentList(int userId) {
		List<MakeAppointment> l = new ArrayList<MakeAppointment>();
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			if (userId == 0)
				l = um.getAllAppointment();
			s.commit();
			s.close();
		} catch (Exception e) {
		}
		System.out.println("pet list" + l);
		return l == null || l.isEmpty() || l.get(0) == null ? null : l;
	}

	public void processSavebyOwner(RegisterOwner c) {
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			um.processSaveOwner(c);

			s.commit();
			s.close();
		} catch (Exception e) {
		}

	}

	public void processSavebyDoctor(RegisterDoctor d) {
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			um.processSaveDoctor(d);

			s.commit();
			s.close();
		} catch (Exception e) {
		}
	}

	public void processSaveDrugType(DrugType d) {
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			um.processSaveDrugType(d);

			s.commit();
			s.close();
		} catch (Exception e) {
		}
	}

	public void processSavePetDrug(PetDrug d) {
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			um.processSavePetDrug(d);

			s.commit();
			s.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void processSavebyPet(PetRegister c) {
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			um.processSavePet(c);

			s.commit();
			s.close();
		} catch (Exception e) {
		}

	}

	public void processmakeAppointment(MakeAppointment p) {
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			um.processMakeAppointment(p);

			s.commit();
			s.close();
		} catch (Exception e) {
		}
	}

	public void processupdateAdmin(AdminPassword p) {
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			um.processUpdateDoctor(p);

			s.commit();
			s.close();
		} catch (Exception e) {
		}
	}

	public void processupdatePet(PetUpdate p) {
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);
			um.processUpdatePet(p);

			s.commit();
			s.close();
		} catch (Exception e) {
		}
	}

	public List<PetById> getPetbyId(String Id) {
		List<PetById> l = new ArrayList<PetById>();
		try {
			SqlSession s = this.sfactory.openSession();
			PetMapper um = s.getMapper(PetMapper.class);

			l = um.getPetById(Id);
			s.commit();
			s.close();
		} catch (Exception e) {
		}
		return l == null || l.isEmpty() || l.get(0) == null ? null : l;
	}
}
