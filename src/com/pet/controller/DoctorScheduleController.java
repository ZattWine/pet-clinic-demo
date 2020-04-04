package com.pet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.form.DoctorScheduleForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = "/checkSchedulePath")
public class DoctorScheduleController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DoctorScheduleForm myForm = new DoctorScheduleForm();
		this.myPetService.processSchedule(myForm);
		System.out.println(myForm.getScheduleList());
		req.setAttribute("schedule", 1);
		req.setAttribute("scheduleList", myForm);
		RequestDispatcher rd = req.getRequestDispatcher("clinicservices.jsp");

		rd.forward(req, resp);
	}

}
