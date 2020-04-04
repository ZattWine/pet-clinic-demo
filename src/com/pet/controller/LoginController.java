package com.pet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.form.PetLoginForm;
import com.pet.model.Login;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/petloginPath" })
public class LoginController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PetLoginForm myForm = new PetLoginForm();
		String id = req.getParameter("id");
		String pass = req.getParameter("password");

		this.myPetService.processLoad(myForm);
		List<Login> l = myForm.getLoginList();
		int i = 0;
		for (Login lo : l) {
			if (lo.getLoginId().equals("id01") && id.equals("id01")) {
				if (!lo.getLoginPassword().equals(pass)) {
					i = 11;
				} else {
					i = 1;
				}
			} else if (lo.getLoginId().equals("did001") && id.equals("did001")) {
				if (!lo.getLoginPassword().equals(pass)) {
					i = 12;
				} else {
					i = 2;
				}

			} else if (lo.getLoginId().equals("oid0001") && id.equals("oid0001"))
				if (!lo.getLoginPassword().equals(pass)) {
					i = 13;
				} else {
					i = 3;
				}
		}
		String error = "";
		if (i == 11 || i == 12 || i == 13) {
			error += "Your Password Is Incorrect";
		}
		if (error == null || !error.isEmpty()) {
			// error not go servlet
			req.setAttribute("error", error);
			RequestDispatcher rd = req.getRequestDispatcher("petlogin.jsp");
			rd.forward(req, resp);
		}
		if (i == 1) {
			req.setAttribute("register", 1);
			RequestDispatcher rd = req.getRequestDispatcher("adminsite.jsp");
			rd.forward(req, resp);

		}

		else if (i == 2) {

			RequestDispatcher rd = req.getRequestDispatcher("doctorlogin.jsp");
			rd.forward(req, resp);

		} else if (i == 3) {
			RequestDispatcher rd = req.getRequestDispatcher("owner.jsp");

			rd.forward(req, resp);
		} else {
			System.out.println("Wrong");
		}
	}
}