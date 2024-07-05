package com.mayank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class update extends HttpServlet{
	public void doPost(HttpServletRequest req ,HttpServletResponse res) throws IOException,ServletException{
		String url = "jdbc:mysql://localhost:3306/fdb";
		String username = "root";
		String password = "root";
		
		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		pw.print("Form Updated Successfully.");
		
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c;
			try {
				c = DriverManager.getConnection(url,username,password);
				
				String name= req.getParameter("name");
				String fname= req.getParameter("fname");
				String mname= req.getParameter("mname");
				String gender= req.getParameter("gname");
				String city= req.getParameter("Zname");
				String course= req.getParameter("course");
				String dob= req.getParameter("dob");
				String contact= req.getParameter("contact");
				String age=req.getParameter("age");
				
				System.out.println("Name of student : " + name);
				System.out.println("Father's name : " + fname);
				
				Statement statement =c.createStatement();
				String query = "update userstu set Father_name= '"+fname +
						"',mother_name='"+mname+
						"',Contact_no='"+contact+
						" 'where Stu_name ='"+name+"'";
				int i = statement.executeUpdate(query);
				if(i>0)
					System.out.println("Data updated successfully.");
				else
					System.out.println("Data not updated.");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
