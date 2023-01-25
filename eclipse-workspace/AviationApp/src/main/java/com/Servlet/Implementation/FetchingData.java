package com.Servlet.Implementation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Servlets.Model.AviationModel;


public class FetchingData extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FetchingData() {
		super();
		
	}
protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{

	response.setContentType("text/html");

	HttpSession session = request.getSession();
	Object obj =session.getAttribute("AviationModel");
	AviationModel avi = null;
	if(obj!=null) {
	avi = (AviationModel)obj;
	}
	RequestDispatcher rd =request.getRequestDispatcher("/DAO");
	session.setAttribute("AviationModel", rd);
	}
}
