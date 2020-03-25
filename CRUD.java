package accomodate.Database;

import java.io.InputStream;
import java.sql.Blob;

import accomodate.Model.Rooms;
import accomodate.Model.User;

public interface CRUD {
	
	
	
	
 boolean Insert (User user); 
 
 
 
 User getUser(String username,String password);
 boolean saveUser(User user);
 
 boolean InsertRoom(Rooms room);
 //boolean getRooms(Rooms room);

 
 //Rooms getRoom(String Type,String Location,String Price,String Description,InputStream Picture);
}
