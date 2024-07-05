package com.mayank;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyFormpractice extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
		res.setContentType("type/html");
		PrintWriter pw= res.getWriter();
		pw.print("Form submited.");
		String name=req.getParameter("name");
		String fname= req.getParameter("fathername");
		String email= req.getParameter("email");
		String gender= req.getParameter("gender");
		String city= req.getParameter("city");
		String course= req.getParameter("course");
		//String dob= req.getParameter("dob");
		String contact= req.getParameter("phone");
		//String age=req.getParameter("age");
		pw.println("Name of Student is :"+name);
		
		
		
		
	}
}
