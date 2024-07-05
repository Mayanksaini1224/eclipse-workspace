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

public class deleteform extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.print("Record Successfully Deleted.");
		String url = "jdbc:mysql://localhost:3306/fdb";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection c=DriverManager.getConnection(url,username,password);
			Statement statement=c.createStatement();
			
			String name= req.getParameter("name");
			String contact= req.getParameter("contact");
			String query="delete from userstu where Stu_name='"+name+"'and Contact_no='"+contact+"'";
			int i = statement.executeUpdate(query);
			if(i>0)
				System.out.println("Data deleted successfully.");
			else
				System.out.println("Data not deleted.");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
