package com.mayank;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class signup extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
	
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter(); 
		pw.print("Form Submited Successfully.");
		//res.sendRedirect("https://www.youtube.com/");
		String name= req.getParameter("studentname");
		String password=req.getParameter("password");
		if(name.equals("abc") && password.equals("xyz")) {
			RequestDispatcher rd= req.getRequestDispatcher("update.html");

			rd.forward(req, res);
		}
		else {
			
			pw.println("Register first");
			RequestDispatcher rd= req.getRequestDispatcher("index.html");
			res.setContentType("text/html");
			pw.print("Message");
			rd.forward(req, res);
		}
	}
}
