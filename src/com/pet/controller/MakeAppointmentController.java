package com.pet.controller;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.form.MakeAppointmentForm;
import com.pet.form.RegisterDoctorForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/makeappointmentPath" })
public class MakeAppointmentController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MakeAppointmentForm myForm = new MakeAppointmentForm();
		String pid = req.getParameter("appid");
		String oid = req.getParameter("ownerid");
		String time = req.getParameter("time");

		Date date = null;
		try {
			date = new SimpleDateFormat("dd-MM-yyyy").parse(req.getParameter("date"));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		myForm.setAppId(Integer.parseInt(pid));
		myForm.setOwnerId(oid);
		myForm.setAppDate(date);
		myForm.setAppTime(time);
		this.myPetService.processmakeAppointment(myForm);
		RequestDispatcher rd = req.getRequestDispatcher("owner.jsp");
		rd.forward(req, resp);

	}
}
