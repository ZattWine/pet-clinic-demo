package com.pet.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.form.PetSpeciesForm;
import com.pet.form.RegisterOwnerForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/ownerPath" })
public class OwnerRegisterController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RegisterOwnerForm myForm = new RegisterOwnerForm();
		HttpSession session = req.getSession();

		String id = req.getParameter("id");
		session.setAttribute("ownerid", id);
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		myForm.setOwnerId(id);
		myForm.setOwnerName(name);
		myForm.setOwnerEmail(email);
		myForm.setOwnerAddress(address);
		myForm.setOwnerPhone(phone);
		this.myPetService.registerOwner(myForm);
		PetSpeciesForm form = new PetSpeciesForm();
		this.myPetService.processSpecies(form);
		req.setAttribute("speciesList", form);
		RequestDispatcher rd = req.getRequestDispatcher("registerpet.jsp");
		rd.forward(req, resp);
	}

}
