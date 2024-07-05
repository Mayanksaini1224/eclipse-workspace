package com.mayank;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class getinfo extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/restro";
			String username = "root";
			String password = "root";
			Connection c=DriverManager.getConnection(url,username,password);
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			String year= req.getParameter("year");
			String month= req.getParameter("month");
			String date= req.getParameter("date");
			Statement statement=c.createStatement();
			ResultSet resultset = statement.executeQuery("select Order_Summary from restaurant where Order_date like '"+year+"-"+month+"-"+date+"'");
			while(resultset.next()) {
				String Order_Summary = resultset.getString("Order_Summary");
				System.out.println("Infomation of order on date : "+year+"-"+month+"-"+date);
				System.out.println(Order_Summary);
				pw.println("\nInfomation of order on date : "+year+"-"+month+"-"+date);
				pw.println("\n"+Order_Summary);
			}
			  
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
