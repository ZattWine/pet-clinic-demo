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

import com.pet.form.PetDrugForm;
import com.pet.form.PetDrugForm2;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/pethistoryPath" })
public class PetHistoryController extends HttpServlet {

	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PetDrugForm2 myfom = new PetDrugForm2();
		this.myPetService.processPetDrugList(myfom);
		req.setAttribute("drug", 1);
		req.setAttribute("drugList", myfom);
		System.out.println(myfom.getDrugList());
		RequestDispatcher rd = req.getRequestDispatcher("pettreatment.jsp");
		rd.forward(req, resp);
	}

}
