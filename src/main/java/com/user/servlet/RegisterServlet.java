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
import javax.servlet.http.HttpSession;



@WebServlet("/register")


public class RegisterServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
			
			HttpSession session = req.getSession();
			
			
			if(check != null) {

				UserDAOImpl dao = new UserDAOImpl(DBConnect.getConn());
				
				boolean f= dao.userRegister(us);
				if (f) {
				//	System.out.println("User register successfully....");
					session.setAttribute("SuccessMSg", "User register successfully...");
					resp.sendRedirect("register.jsp");
					
				}else {
					//System.out.println("Something went wrong on server!!");
					session.setAttribute("FailedMSg", "Something went wrong on server!!");
					resp.sendRedirect("register.jsp");
				}
			}else {
				//System.out.println("Please check Agree & Terms conditions");
				session.setAttribute("FailedMSg", "Please check, Agree Terms & conditions");
				resp.sendRedirect("register.jsp");
				
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	

}
