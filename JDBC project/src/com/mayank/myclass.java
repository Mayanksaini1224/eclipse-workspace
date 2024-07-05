package com.mayank;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Scanner;

public class myclass {
	public static void main(String args[]) throws ClassNotFoundException
	{	
		String url = "jdbc:mysql://localhost:3306/fdb";
		String username = "root";
		String password = "root";
		Class.forName("com.mysql.cj.jdbc.Driver");
	    try {
			Connection connection = DriverManager.getConnection(url,username,password);
			
			//..............................................prepare statement with scanner................................
			
			
			Scanner sc=new Scanner(System.in);
			String name,city;
			int id;
			System.out.println("Enter the name: ");
			name=sc.next();
			System.out.println("Enter the city: ");
			city=sc.next();
			System.out.println("Enter the id: ");
			id=sc.nextInt();
			String query = "insert into student values(?, ?, ?)";
			PreparedStatement statement =connection.prepareStatement(query);
			statement.setInt(1, id);
			statement.setString(2,name);
			statement.setString(3,city);
			statement.executeUpdate();
			System.out.println("Data Inserted.");
			
			
			
			/*//..............................input by scanner class statement .......................................
			
			Statement statement =connection.createStatement();
			System.out.println("connection created");
			Scanner sc=new Scanner(System.in);
			String name,city;
			int id;
			System.out.println("Enter the name: ");
			name=sc.next();
			System.out.println("Enter the city: ");
			city=sc.next();
			
			System.out.println("Enter the id: ");
			id=sc.nextInt();
			
			String query = "insert into student values("+ id +",'"+ name + "','" + city+"')";
			int rowaffect = statement.executeUpdate(query);
			if(rowaffect>0)
				System.out.println("Data Inserted Successfully.");
			else
				System.out.println("Unsuccessful.");
				
				*/
			
			/*//..........................................to delete......................................................
			
			String query="delete from student where id =2";
			int i = statement.executeUpdate(query);
			if(i>0)
				System.out.println("Data deleted successfully.");
			else
				System.out.println("Data not deleted.");
			
			*/
			
			
			/*//.............................................to update data.................................................. 
			
			String query = "update student set city='Ajmer' where id =4";
			int i = statement.executeUpdate(query);
			if(i>0)
				System.out.println("Data updated successfully.");
			else
				System.out.println("Data not updated.");
				
			*/
			
			
			/*...............................................to insert data.....................................................
			
			String query = "insert into student values(4,'Love','Jaipur')";
			int rowaffect = statement.executeUpdate(query);
			if(rowaffect>0)
				System.out.println("Data Inserted Successfully.");
			else
				System.out.println("Unsuccessful.");
				
				
			*/
			
			
			/*//.......................................to print the table data.........................................................
			
			ResultSet resultset = statement.executeQuery("select * from student");
			while(resultset.next()) {
				int id = resultset.getInt("id");
				String name = resultset.getString("name");
				String city = resultset.getString("city");
				System.out.println(id + " "+name + " " + city);		
			}
			  
			 
			 */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
	}
}
