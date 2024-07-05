package com.mayank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyForm extends HttpServlet{
	public void doPost(HttpServletRequest req ,HttpServletResponse res)throws ServletException , IOException{
		
		/*
		//......................................redirect..................................................
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		pw.print("Form Submited Successfully.");
		res.sendRedirect("https://www.youtube.com/");
		String name= req.getParameter("studentname");
		String password="xyz";
		if(name=="abc" && password=="xyz") {
			RequestDispatcher rd= req.getRequestDispatcher("/updateform");

			rd.forward(req, res);
		}
		else {
			RequestDispatcher rd= req.getRequestDispatcher("/submitform.html");
			res.setContentType("text/html");
			pw.print("Message");
			rd.forward(req, res);

		}
		*/
		PrintWriter pw= res.getWriter();
		
		//connection established
		String url = "jdbc:mysql://localhost:3306/fdb";
		String username = "root";
		String password = "root";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(url,username,password);
			
			//form action
			res.setContentType("text/html");
			//PrintWriter pw= res.getWriter();
			pw.print("Form Submited Successfully.");
			
			//get data from form
			String name= req.getParameter("studentname");
			String fname= req.getParameter("fname");
			String mname= req.getParameter("mname");
			String gender= req.getParameter("gname");
			String city= req.getParameter("Zname");
			String course= req.getParameter("course");
			String dob= req.getParameter("dob");
			String contact= req.getParameter("contact");
			String age=req.getParameter("age");
			
			
			//print data on console
			System.out.println("Name of student : " + name);
			System.out.println("Father's name : " + fname);
			System.out.println("Mother's Name : " + mname);
			System.out.println("Gender : " + gender);
			System.out.println("City : " + city);
			System.out.println("Course : " + course);
			System.out.println("Date of Birth : " + dob);
			System.out.println("Contact : " + contact);
			System.out.println("Age : " + age);
			
			//print data on webpage
			pw.print("\nName of student : " + name);
			pw.print("\nFather's name : " + fname);
			pw.print("Mother's Name : " + mname);
			pw.print("Gender : " + gender);
			pw.print("City : " + city);
			pw.print("Course : " + course);
			pw.print("Date of Birth : " + dob);
			pw.print("Contact : " + contact);
			pw.print("Age : " + age);
			
			//print data in database
			String query = "insert into userstu values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement statement =c.prepareStatement(query);

			statement.setString(1,name);
			statement.setString(2,fname);
			statement.setString(3,mname);
			statement.setString(4,gender);
			statement.setString(5,city);
			statement.setString(6,course);
			statement.setString(7,dob);
			statement.setString(8,contact);
			statement.setString(9,age);
			statement.executeUpdate();
			System.out.println("Data Inserted.");
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
