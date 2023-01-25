package com.Servlet.Implementation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Servlets.Model.AviationModel;


public class DAO extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAO() {
	super();	
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("form submitted on GET");
	String Id = request.getParameter("Id");
	
	
	String FirstName = request.getParameter("FirstName");
	String LastName =request.getParameter("LastName");
	String Address=request.getParameter("Address");
	
	
	AviationModel am = new AviationModel();
	am.setId(Id);
	am.setFirstName(FirstName);
	am.setLastName(LastName);
	am.setAddress(Address);
	

	Implementation i = new Implementation();
	int result = i.insertion(am);
	HttpSession session = request.getSession();
	session.setAttribute("AviationModel", am);

	RequestDispatcher empservlet = request.getRequestDispatcher("/FetchingData");
	RequestDispatcher failure = request.getRequestDispatcher("Fail.html");
	if(result>0) {
	empservlet.forward(request, response);
	} else {
	failure.forward(request, response);
	}


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("form submitted on POST");
		
		String Id = request.getParameter("Id");	
		
		
		
		AviationModel am = new AviationModel();
		am.setId(Id);
		

		Implementation e = new Implementation();
		int result = e.insertion(am);
		
		RequestDispatcher empservlet = request.getRequestDispatcher("/FetchingData");
		RequestDispatcher failure = request.getRequestDispatcher("Fail.html");
		if(result>0) {
		empservlet.forward(request, response);
		} else {
		failure.forward(request, response);
		}
	}
}
