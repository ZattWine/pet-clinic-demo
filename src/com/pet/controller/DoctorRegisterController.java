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

import com.pet.form.RegisterDoctorForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/doctorPath" })
public class DoctorRegisterController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RegisterDoctorForm myForm = new RegisterDoctorForm();
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String rank = req.getParameter("rank");
		myForm.setDoctorId(id);
		myForm.setDoctorName(name);
		myForm.setDoctorRank(rank);
		this.myPetService.registerDoctor(myForm);
		RequestDispatcher rd = req.getRequestDispatcher("adminsite.jsp");
		rd.forward(req, resp);

	}

}
