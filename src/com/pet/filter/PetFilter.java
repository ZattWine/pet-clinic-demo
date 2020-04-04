package com.pet.filter;

import java.io.File;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/petregisterPath")
public class PetFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("do u filter");

		String petId = req.getParameter("id");
		String petName = req.getParameter("name");
		String gender = req.getParameter("gender");
		String birth = req.getParameter("birth");
		String death = req.getParameter("death");
		String species = req.getParameter("species");
		String error = new String();

		if (petId == null || petId.isEmpty())
			error += "Password is Required<br>";
		if (petName == null || petName.isEmpty())
			error += "Pet Name is Required <br>";
		if (gender == null || gender.isEmpty())
			error += "Pet Gender is Required <br>";
		if (birth == null || birth.isEmpty())
			error += "Pet Birthday is Required <br>";
		if (death == null || death.isEmpty())
			error += "Pet Deathday is Required <br>";
		if (species == null || species.isEmpty())
			error += "Pet Species is Required <br>";
		if (error == null || !error.isEmpty()) {
			// error not go servlet
			req.setAttribute("register", 0);
			req.setAttribute("error", error);
			RequestDispatcher rd = req.getRequestDispatcher("registerpet.jsp");
			rd.forward(req, resp);
		} else {

			chain.doFilter(req, resp);
		}

	}

}
