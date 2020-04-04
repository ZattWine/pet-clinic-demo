package com.pet.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns = "/filePath")
@MultipartConfig(maxFileSize = 200000000, maxRequestSize = 2000000000, fileSizeThreshold = 1000000000)
public class FileInfoController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8174544464190508605L;

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		System.out.println("do Post method");
//		String strEmail = req.getParameter("frmEmail");
//		Part partFile = req.getPart("frmFile");
//
//		System.out.println("Check Email =" + strEmail);
//		System.out.println("Check Part =" + partFile.getSubmittedFileName());
//
//		String dirPath = (String) getServletContext().getAttribute("RootDirPath");
//		String fileName = strEmail.substring(0, strEmail.indexOf("@"));
//		String filePath = dirPath + File.separator + fileName;
//		File f = new File(filePath);
//		f.mkdir();
//		try {
//			// upload file into folder
//			InputStream inData = partFile.getInputStream();
//			FileOutputStream fos = new FileOutputStream(
//					new File(filePath + File.separator + partFile.getSubmittedFileName()));
//			long fileSize = partFile.getSize();
//			byte buf[] = new byte[(int) fileSize];
//			inData.read(buf);
//			fos.write(buf);
//			fos.close();
//			inData.close();
//		} catch (Exception e) {
//		}
//	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}

	/**
	 * Utility method to get file name from HTTP header content-disposition
	 */
	private String getFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		System.out.println("content-disposition header= " + contentDisp);
		String[] tokens = contentDisp.split(";");
		for (String token : tokens) {
			if (token.trim().startsWith("filename")) {
				return token.substring(token.indexOf("=") + 2, token.length() - 1);
			}
		}
		return "";
	}
}
