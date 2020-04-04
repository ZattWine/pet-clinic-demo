package com.pet.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.form.DrugTypeForm;
import com.pet.form.PetDrugForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/petdrugPath" })
public class PetDrugController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DrugTypeForm form1 = new DrugTypeForm();
		String strid = req.getParameter("drugid");
		String id = req.getParameter("id");
		String strduration = req.getParameter("duration");
		form1.setDrugId(Integer.parseInt(strid));
		form1.setDrugName(req.getParameter("name"));
		form1.setDrugDuration(Integer.parseInt(strduration));
		form1.setDrugdurationType(req.getParameter("drugduration"));
		PetDrugForm form2 = new PetDrugForm();
		form2.setPetId(req.getParameter("petid"));
		form2.setDrugId(Integer.parseInt(strid));
		form2.setDoctorId(req.getParameter("doctorid"));
		form2.setDrugDesc(req.getParameter("drugdescription"));
		form2.setPetdrugId(Integer.parseInt(id));

		Date date = null, next = null;
		try {
			date = new SimpleDateFormat("dd-MM-yyyy").parse(req.getParameter("drugdate"));
			next = new SimpleDateFormat("dd-MM-yyyy").parse(req.getParameter("drugnextdate"));

		} catch (ParseException e) {
			e.printStackTrace();
		}
		form2.setDrugDate(date);
		form2.setDrugNextDate(next);
		this.myPetService.processDrugType(form1);
		this.myPetService.processPetDrug(form2);

		RequestDispatcher rd = req.getRequestDispatcher("pettreatment.jsp");
		rd.forward(req, resp);
	}

}
