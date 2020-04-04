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

import com.pet.form.MakeAppointmentForm;
import com.pet.form.PetSpeciesForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/checkappointmentPath", "/checkspeciesPath" })
public class CheckAppointmentController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String app = req.getParameter("appointment");
		String species = req.getParameter("species");
		if (app != null) {
			System.out.println(req.getParameter("appointment"));
			MakeAppointmentForm form = new MakeAppointmentForm();
			this.myPetService.processAppointment(form);
			req.setAttribute("appointment", 1);
			req.setAttribute("appointmentList", form);

			RequestDispatcher rd = req.getRequestDispatcher("clinicservices.jsp");
			rd.forward(req, resp);

		}
		if (species != null) {
			PetSpeciesForm form = new PetSpeciesForm();
			this.myPetService.processSpecies(form);
			req.setAttribute("species", 1);
			req.setAttribute("speciesList", form);
			RequestDispatcher rd = req.getRequestDispatcher("clinicservices.jsp");
			rd.forward(req, resp);
		}
	}

}
