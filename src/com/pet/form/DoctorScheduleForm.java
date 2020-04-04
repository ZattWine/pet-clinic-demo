package com.pet.form;

import java.util.List;

import com.pet.model.DoctorSchedule;

public class DoctorScheduleForm {
	private int scheduleId;
	private String dayName;

	public String getDayName() {
		return dayName;
	}

	public void setDayName(String dayName) {
		this.dayName = dayName;
	}

	private String startTime;
	private String endTime;
	private String doctorId;
	private List<DoctorSchedule> scheduleList;

	public List<DoctorSchedule> getScheduleList() {
		return scheduleList;
	}

	public void setScheduleList(List<DoctorSchedule> scheduleList) {
		this.scheduleList = scheduleList;
	}

	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

}
