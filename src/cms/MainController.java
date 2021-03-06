package cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import course.CourseOfferedTO;
import admin.Admin;

public class MainController {
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		CourseOfferedTO courseOfferedTo = new CourseOfferedTO();
		int userOption;
		System.out.println("Royal Institute Of Technology");
		System.out.println("1. Login as Admin.");
		System.out.println("2. Login as Program Coordinator");
		System.out.println("3. Login as Lecturer");
		System.out.println("4. Login as Student");
		System.out.println("Enter your Option: ");
		LoginDetails loginDetails = new LoginDetails();
		userOption=sc.nextInt();
		switch(userOption){
		case 1:{
			//Rewrite the syso after DB connection
			System.out.println("Welcome Admin");
			System.out.println("Enter your id: ");
			String id = sc.next();	
			loginDetails.setId(id);
			System.out.println("Enter your Password: ");
			String password=sc.next();
			loginDetails.setPassword(password);
			String message=new Admin().adminCredentials(loginDetails);
			System.out.println(message);
			System.out.println("Enter an Option: ");
			System.out.println("1. Add Course Offerings");
			switch(sc.nextInt()){
			case 1:
				System.out.println("Add Course");
				System.out.println("Enter the course code: ");
				courseOfferedTo.setCourseId(sc.next());
				System.out.println("Enter the course name : ");
				courseOfferedTo.setCourseName(sc.next());
				System.out.println("Enter the semester for which this course is offered : ");
				courseOfferedTo.setSemester(sc.nextInt());
				
			}
			break;
		}
		case 2:{
			//Rewrite the syso after DB connection
			System.out.println("Welcome Program Coordinator");
			break;
		}
		case 3:{
			//Rewrite the syso after DB connection
			System.out.println("Welcome Lecturer");
			break;
		}
		case 4:{
			//Rewrite the syso after DB connection
			System.out.println("Welcome Student");
			break;
		}
		default:{
			System.out.println("Invalid Entry");
			break;
		}
		}
		  
		}


}