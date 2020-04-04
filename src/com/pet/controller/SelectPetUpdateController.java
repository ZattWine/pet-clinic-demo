package com.pet.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.form.PetRegisterForm;
import com.pet.form.UpdatePetForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/selectpetupdatePath" })
public class SelectPetUpdateController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PetRegisterForm form = new PetRegisterForm();
		HttpSession session = req.getSession();
		form.setPetId((String) session.getAttribute("petid"));
		form.setPetName(req.getParameter("name"));
		form.setPetSex(req.getParameter("sex"));

		this.myPetService.processupdatePet(form);
		RequestDispatcher rd = req.getRequestDispatcher("owner.jsp");
		rd.forward(req, resp);

	}
}
