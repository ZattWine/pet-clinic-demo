package com.pet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/doctorPath")
public class DoctorFilter implements Filter {

	private ServletContext context;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.context = filterConfig.getServletContext();
		this.context.log("DoctorFilter initialized");
	}

	@Override
	public void destroy() {
		// close resource here.
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("do u filter");
		String strId = req.getParameter("id");
		String strName = req.getParameter("name");
		String strRank = req.getParameter("rank");

		String error = new String();

		if (strId == null || strId.isEmpty())
			error += "Id is Required<br>";
		if (strName == null || strName.isEmpty())
			error += "Name is Required<br>";
		if (strRank == null || strRank.isEmpty())
			error += "Rank is Required<br>";

		if (error == null || !error.isEmpty()) {
			// error not go servlet
			req.setAttribute("error", error);
			RequestDispatcher rd = req.getRequestDispatcher("adminlogin.jsp");
			rd.forward(req, resp);
		} else {

			chain.doFilter(req, resp);
		}

	}

}
