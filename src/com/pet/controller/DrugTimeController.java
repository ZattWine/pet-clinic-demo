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

import com.pet.form.DrugTypeForm;
import com.pet.form.UpdatePetForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/drugtimePath" })
public class DrugTimeController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DrugTypeForm myform = new DrugTypeForm();
		this.myPetService.processPetDrugTime(myform);
		req.setAttribute("drug", 1);
		req.setAttribute("drugList", myform);
		RequestDispatcher rd = req.getRequestDispatcher("owner.jsp");
		rd.forward(req, resp);
	}

}
