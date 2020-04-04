package com.pet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/petloginPath")
public class AdminstratorFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("do u filter");

		String strId = req.getParameter("id");
		String strPassword = req.getParameter("password");

		String error = new String();

		if (strId == null || strId.isEmpty())
			error += "Id is Required<br>";
		if (strPassword == null || strPassword.isEmpty())
			error += "Password is Required<br>";
		if (!strId.equals("id01") && !strId.equals("oid0001") && !strId.equals("did001"))
			error += "don't Match Id Number";
		if (error == null || !error.isEmpty()) {
			// error not go servlet
			req.setAttribute("error", error);
			RequestDispatcher rd = req.getRequestDispatcher("petlogin.jsp");
			rd.forward(req, resp);
		} else {

			chain.doFilter(req, resp);
		}

	}

}
