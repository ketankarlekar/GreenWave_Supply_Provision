package com.user.servlet;

import com.DAO.UserDAOImpl;
import com.DB.DBConnect;
import com.entity.User;

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
			
		//	System.out.println(fname+" "+lname+" "+ email + " "+password+" "+check );
			
			
			User us =  new User();
			us.setFname(fname);
			us.setLname(lname);
			us.setEmail(email);
			us.setPassword(password);
			
			UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
			
			boolean f= dao.userRegister(us);
			if (f) {
				System.out.println("User register successfully....");
				
			}else {
				System.out.println("Some thing went wrong on server!!");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	

}
