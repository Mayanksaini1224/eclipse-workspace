package com.Mayank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/fdb";;
		String user = "root";
		String passwd = "root";
		String Roll_no,Name,Branch;
		int Id;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection(url,user,passwd);
		Statement s = c.createStatement();
		System.out.println("Enter student Id : ");
		Id=sc.nextInt();
		System.out.println("Enter the Roll Number : ");
		Roll_no=sc.next();
		System.out.println("Enter the Name of Student : ");
		Name=sc.next();
		System.out.println("Enter the Branch of Student : ");
		Branch=sc.next(); 
		
		String query="insert into college values("+Id+",'"+Roll_no+"','"+Name+"','"+Branch+"')";
		int r= s.executeUpdate(query);
		if(r>0)
			System.out.println("Data Successfully Inserted.");
		else
			System.out.println("Data Not Inserted.");
		String record;
		String qoutput;
		System.out.println("Enter Roll Number to See Record (0 for all record): ");
		record=sc.next();
		if(record.equals("0"))
			qoutput="select * from college";
		else
			qoutput="select * from college where id="+record ;
			
		ResultSet result=s.executeQuery(qoutput);
		while(result.next()) {
			int id =result.getInt("id");
			String rollno = result.getString("Roll_no");
			String name=result.getString("Name");
			String branch=result.getString("branch");
			System.out.println(id + " "+ rollno + " " +name + " " + branch + " ");
		}
	}
}
