package com.pet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/ownerPath")
public class OwnerFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("do u filter");
		String strId = req.getParameter("id");
		String strName = req.getParameter("name");
		String strEmail = req.getParameter("email");
		String strPhone = req.getParameter("phone");
		String strAddress = req.getParameter("address");

		String error = new String();

		if (strId == null || strId.isEmpty())
			error += "Id is Required<br>";
		if (strName == null || strName.isEmpty())
			error += "Name is Required<br>";
		if (strEmail == null || strEmail.isEmpty())
			error += "Email is Required<br>";
		if (strAddress == null || strAddress.isEmpty())
			error += "Address is Required<br>";
		if (strPhone == null || strPhone.isEmpty())
			error += "Phone Number is Required<br>";
		if (error == null || !error.isEmpty()) {
			// error not go servlet
			req.setAttribute("error", error);
			RequestDispatcher rd = req.getRequestDispatcher("registerowner.jsp");
			rd.forward(req, resp);
		} else {

			chain.doFilter(req, resp);
		}

	}

}
