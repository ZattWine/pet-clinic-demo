package com.pet.form;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import com.pet.model.MakeAppointment;

public class MakeAppointmentForm {
	private int appId;
	private String ownerId;
	private Date appDate;
	private String appTime;

	public List<MakeAppointment> getAppList() {
		return appList;
	}

	public void setAppList(List<MakeAppointment> appList) {
		this.appList = appList;
	}

	private List<MakeAppointment> appList;

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public String getAppTime() {
		return appTime;
	}

	public void setAppTime(String appTime) {
		this.appTime = appTime;
	}

}
