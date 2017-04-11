package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import admin.Admin;
import cms.LoginDetails;

public class AdminTest {
	LoginDetails loginDetails = new LoginDetails();
	 protected void setUp(){
		 loginDetails.setId("a123456");
		 loginDetails.setPassword("John12S$");
	   }
	
 @Test
 public void adminCredentialsTestTrue() throws ClassNotFoundException{
	 setUp();
	 String message = new Admin().adminCredentials(loginDetails);
	 System.out.println(message);
	 
	 assertTrue(message.equals("Welcpme John"));
	 
 }
 @Test
 public void adminCredentialsTestFalse() throws ClassNotFoundException{
	 LoginDetails loginDetails = new LoginDetails();
	 loginDetails.setId("a123456");
	 loginDetails.setPassword("John12$");
	 String message = new Admin().adminCredentials(loginDetails);
	 System.out.println(message);
	 
	 assertFalse("Welcpme John",false);
	 
 }
 
}
