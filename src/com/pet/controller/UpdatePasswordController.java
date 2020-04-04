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

import com.pet.form.AdminPasswordForm;
import com.pet.form.RegisterDoctorForm;
import com.pet.model.AdminPassword;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/adminupdatepasswordPath", "/doctorupdatepasswordPath" })
public class UpdatePasswordController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		AdminPasswordForm form = new AdminPasswordForm();
		form.setAdminId(id);
		form.setAdminPassowrd(password);
		this.myPetService.processupdateAdmin(form);
		RequestDispatcher rd = req.getRequestDispatcher("petlogin.jsp");
		rd.forward(req, resp);
	}
}