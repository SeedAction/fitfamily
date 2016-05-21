package org.FitFamily.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.FitFamily.form.SubscriptionForm;
import org.FitFamily.model.User;

public class SignUpController extends HttpServlet {
	public static final String VIEW = "/WEB-INF/views/signUp.jsp";
	public static final String ATT_USER = "user";
	public static final String ATT_FORM = "form";	
	
	/* Displaying sign up page */
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        this.getServletContext().getRequestDispatcher( VIEW ).forward( request, response );
    }
    
	/* Adding a user to db and redirecting on his profile page */
    @Override
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    	/* Preparing the form */
    	SubscriptionForm form = new SubscriptionForm();
    	
    	/* Processing the request and creating a user via the form object */
    	User user = form.addUser(request);
    	
    	/* Storing the form and bean in the request object */
    	request.setAttribute(ATT_FORM, form);
    	request.setAttribute(ATT_USER, user);
    	
    	/* Forwarding the request/response pair to JSP */
    	this.getServletContext().getRequestDispatcher(VIEW).forward(request, response);
    }
}
