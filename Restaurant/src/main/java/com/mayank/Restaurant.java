package com.mayank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Restaurant extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		String url = "jdbc:mysql://localhost:3306/restro";
		String username = "root";
		String password = "root";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				try {
					Connection c=DriverManager.getConnection(url,username,password);
					res.setContentType("text/html");
					PrintWriter pw=res.getWriter();
					pw.println("Connection Established.");
					String name= req.getParameter("name");
					System.out.println("Name of student : " + name);
					pw.println("\n<br>Name of customer : " + name);
					String ordersummary= req.getParameter("orderSummaryText");
					System.out.println("Name of student : " + ordersummary);
					pw.println("\n<br>Name of customer : " + ordersummary);
					String city= req.getParameter("city");
					String email= req.getParameter("email");
					String phone= req.getParameter("phone");
					// Get the current date
			        LocalDate currentDate = LocalDate.now();
			        
			        // Define a date formatter (optional, but useful for custom formatting)
			        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			        
			        // Format the current date as a string
			        String date = currentDate.format(formatter);
			        
			        // Print the formatted date to the console
			        System.out.println("Current Date: " + date);
				
					String query = "insert into restaurant values('"+ name +"','" +city+"','"+email+"','"+phone+"','"+date+"','"+ordersummary+"')";
					
					Statement statement =c.createStatement();

					
					int rowaffect = statement.executeUpdate(query);
					if(rowaffect>0)
						System.out.println("Data Inserted Successfully.");
					else
						System.out.println("Unsuccessful.");
					
					
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
