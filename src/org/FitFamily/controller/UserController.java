package org.FitFamily.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends HttpServlet {
	//TODO: Change following function to match context
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//request.setAttribute("images", filledImages("images"));
		request.getRequestDispatcher("/WEB-INF/views/profile.jsp").forward(request, response);
	}
	
	//TODO: Change doPost function to match context
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/views/profile.jsp").forward(request, response);
	}
}
