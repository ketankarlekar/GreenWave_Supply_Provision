package com.user.servlet;

import java.io.IOException;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/register")


public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			String fname=req.getParameter("fname");
			String lname=req.getParameter("lname");
			String email=req.getParameter("email");
			String password =req.getParameter("password");
			String check =req.getParameter("check");
			
			System.out.println(fname+" "+lname+" "+ email + " "+password+" "+check );
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	

}
