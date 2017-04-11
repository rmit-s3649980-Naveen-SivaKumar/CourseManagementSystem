package admin;

import cms.LoginDetails;
import dao.AdminDao;

public class Admin {
 public void addCourseOffering(){
	 
 }
 public String adminCredentials(LoginDetails loginDetails) throws ClassNotFoundException{
	 return new AdminDao().displayUsers(loginDetails.getId(), loginDetails.getPassword());
 }
}
