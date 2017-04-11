package admin;

import course.CourseOfferedTO;
import cms.LoginDetails;
import dao.AdminDao;

public class Admin {
 public void addCourseOffering(CourseOfferedTO courseOfferedTo){
	
	 System.out.println("Enter the course code : ");
 }
 public void viewCourseOffered(){
	 
 }
 public String adminCredentials(LoginDetails loginDetails) throws ClassNotFoundException{
	 return new AdminDao().displayUsers(loginDetails.getId(), loginDetails.getPassword());
 }
}
