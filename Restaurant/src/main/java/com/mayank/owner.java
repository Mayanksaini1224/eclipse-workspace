package com.mayank;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class owner extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		//String url = "jdbc:mysql://localhost:3306/fdb";
		//String username = "root";
		//String password = "root";
			//try {
			//	Class.forName("com.mysql.cj.jdbc.Driver");
			//	try {
					//Connection c=DriverManager.getConnection(url,username,password);
					res.setContentType("text/html");
					PrintWriter pw=res.getWriter();
					//pw.println("Connection Established.");
					String email= req.getParameter("email");
				//	System.out.println("Name of student : " + name);
					pw.println("\nName of customer : " + email);
					String pswd= req.getParameter("password");
					//System.out.println("Name of student : " + dish1);
					//pw.println("\nName of customer : " + pswd);
					if(email.equals("mayank@gmail.com") && pswd.equals("1234")) {
						//pw.println
						RequestDispatcher rd=req.getRequestDispatcher("info.html");
						rd.forward(req, res);
					}
					else {
						pw.println("password or username is incorrect.");
					}
			//	} catch (SQLException e) {
					// TODO Auto-generated catch block
				//	e.printStackTrace();
			//	}
			//} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			//}
			
		
	}

}

