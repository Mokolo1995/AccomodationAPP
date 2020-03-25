package accomodate.Database;

import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import accomodate.Model.Rooms;
import accomodate.Model.User;

public class CRUDimplementation implements CRUD {

	private String JDBC_DRIVER;
	private String DB_URL;

	private String USER;
	private String PASS;
	private Connection connect;

	@Override
	public boolean Insert(User user) {
		
		try 
		{
		String query1 = "INSERT INTO `registration`(`FirstName`, `Surname`, `IDNo`, `PhoneNo`, `Username`, `Password`) VALUES ('"+user.getTxtFirstName()+"','"+user.getTxtSurName()+"','"+user.getTxtIdNo()+"','"+user.getTxtPhone()+"','"+user.getTxtUsername()+"','"+user.getTxtPasword()+"')";
        Statement statement = this.connect.createStatement() ; 
        statement.executeUpdate(query1);
        statement.close();
        
		return true;
		}
		catch(SQLException ex) 
		{
			return false;
		}
	}

	@Override
	public User getUser(String username, String password) {
		User user = null;

		try {
			String query = "SELECT * FROM  registration where username = '"+username+"' and password ='"+password+"'";
			PreparedStatement preStatement = this.connect.prepareStatement(query);
			ResultSet resultSet =preStatement.executeQuery();
			if(resultSet.next()) {
				
				user = new User();
				user.setTxtFirstName(resultSet.getString("FirstName"));
				user.setTxtSurName(resultSet.getString("Surname"));
				user.setTxtIdNo(resultSet.getString("IDNo"));
				user.setTxtPhone(resultSet.getString("PhoneNo"));
				user.setTxtUsername(resultSet.getString("Username"));
				user.setTxtPasword(resultSet.getString("Password"));
				
			}
			preStatement.close();
			resultSet.close();
			
	        
			return user;
			}
			catch(SQLException ex) {
				return null;
			}
	}
	public boolean saveUser(User user) 
	{
		String query1 = "INSERT INTO `user`(`Username`, `Password`) VALUES ('"+user.getTxtUsername()+"','"+user.getTxtPasword()+"')";
		try {
			Statement statement = this.connect.createStatement() ;
			statement.executeUpdate(query1);
			statement.close();
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		} 
		
		
		return true ;
		
	}
	
	@Override
	public boolean InsertRoom(Rooms room) {
		
		try 
		{
		String query4 = "INSERT INTO `rooms`(`RoomType`, `Price`, `Location`,`Description` , `Picture`) VALUES ('"+room.getTextType()+"','"+room.getTextPrice()+"','"+room.getTxtLocation()+"','"+room.getTxtDescription()+"','"+room.getLblimage()+"')";
        Statement statement1 = this.connect.createStatement() ; 
        statement1.executeUpdate(query4);
        statement1.close();
        
       // PreparedStatement pstmt = con.prepareStatement("INSERT INTO `rooms`(`RoomType`, `Price`, `Description`, `Location`, `Picture`, )");
        
		return true;
		}
		catch(SQLException ex) 
		{
			return false;
		}
	}
	

	public CRUDimplementation() {
		this.JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
		this.DB_URL = "jdbc:mysql://localhost:3307/accomodation_database";
		this.USER = "root";
		this.PASS = "";
		connect = null;
	}

	public void openConnection() {
		try {
			// Register JDBC driver
			Class.forName(JDBC_DRIVER);
			// Open a connection
			System.out.print("Connecting to a selected database... ");
			this.connect = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Success!");
		} catch (Exception e) {
			// Handle errors for JDBC
			e.printStackTrace();
		}
	}

	
	
	
	/*
	 * public void closeConnection() {
	 * 
	 * try { if (connect != null) connect.close(); } catch (SQLException se) {
	 * se.printStackTrace(); } System.out.println("Connection closed"); }
	 * 
	 */

	public Connection getConnection() {
		return connect;
	}

	
		  
		  
	
	}

	
	
	
	  
	 
	 
	 

	

