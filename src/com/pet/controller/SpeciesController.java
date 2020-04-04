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

import com.pet.form.PetSpeciesForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/petPath" })
public class SpeciesController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PetSpeciesForm form = new PetSpeciesForm();
		this.myPetService.processSpecies(form);
		req.setAttribute("speciesList", form);
		req.setAttribute("register", 0);
		RequestDispatcher rd = req.getRequestDispatcher("ownerlogin.jsp");
		rd.forward(req, resp);
	}

}
