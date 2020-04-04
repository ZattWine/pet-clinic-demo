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

import com.pet.form.PetByIdForm;
import com.pet.form.PetRegisterForm;
import com.pet.form.UpdatePetForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/updatepetPath", "/petupdatePath" })
public class UpdatePetController extends HttpServlet {

	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		UpdatePetForm myform = new UpdatePetForm();
		this.myPetService.processPet(myform);
		System.out.println(myform.gettotalpetList());
		req.setAttribute("petList", myform);
		RequestDispatcher rd = req.getRequestDispatcher("petlist.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String petinfo = req.getParameter("pet");
		String id = petinfo.substring(petinfo.indexOf("-") + 1, petinfo.length());
		PetByIdForm form = new PetByIdForm();
		form.setPetId(id);
		session.setAttribute("petid", id);
		this.myPetService.processselectPetbyId(form);
		System.out.println(form.gettotalpetList());
		req.setAttribute("updatepetList", form);
		req.setAttribute("frmcontrol", 1);
		RequestDispatcher rd = req.getRequestDispatcher("petlist.jsp");

		rd.forward(req, resp);

	}

}
