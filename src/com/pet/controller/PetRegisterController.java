package com.pet.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.ibatis.session.SqlSessionFactory;

import com.pet.form.PetRegisterForm;
import com.pet.service.PetService;

@WebServlet(urlPatterns = { "/petregisterPath" })
@MultipartConfig(maxFileSize = 2097152, maxRequestSize = 2097152, fileSizeThreshold = 1097152)
public class PetRegisterController extends HttpServlet {
	private PetService myPetService;

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.myPetService = new PetService((SqlSessionFactory) config.getServletContext().getAttribute("SF"));
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();

		String petId = req.getParameter("id");
		String petName = req.getParameter("name");
		String gender = req.getParameter("gender");
		String birth = req.getParameter("birth");
		String death = req.getParameter("death");
		String species = req.getParameter("species");
		String id = species.substring(species.indexOf("-") + 1, species.length());
		int idno = Integer.parseInt(id);
		Date birthday = null, deathday = null;
		try {
			birthday = new SimpleDateFormat("dd-MM-yyyy").parse(birth);
			deathday = new SimpleDateFormat("dd-MM-yyyy").parse(death);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("id Number" + idno);
		PetRegisterForm myForm = new PetRegisterForm();
		myForm.setPetId(petId);
		myForm.setPetName(petName);
		myForm.setPetSex(gender);
		myForm.setPetBirth(birthday);
		myForm.setPetDeath(deathday);
		myForm.setSpeciesId(idno);
		myForm.setOwnerID((String) session.getAttribute("ownerid"));
		this.myPetService.registerPet(myForm);

		Part partFile = req.getPart("frmFile");

		System.out.println("Check Part =" + partFile.getSubmittedFileName());

		String dirPath = "D:\\J2EE\\TOMCAT\\apache-tomcat-9.0.22\\pet";

		String fileName = (String) session.getAttribute("ownerid");
		String filePath = dirPath + File.separator + fileName;
		File f = new File(filePath);
		f.mkdir();
		try {
			// upload file into folder
			InputStream inData = partFile.getInputStream();
			FileOutputStream fos = new FileOutputStream(new File(filePath + File.separator + petId));
			long fileSize = partFile.getSize();
			byte buf[] = new byte[(int) fileSize];
			inData.read(buf);
			fos.write(buf);
			fos.close();
			inData.close();
		} catch (Exception e) {
		}
		RequestDispatcher rd = req.getRequestDispatcher("adminsite.jsp");
		rd.forward(req, resp);

	}

}
