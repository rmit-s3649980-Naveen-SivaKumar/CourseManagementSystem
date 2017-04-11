package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminDao {
	public void newCourse(String f, String s) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/cm", "root", "Navin1993S$");
			String queryString = "SELECT name, password FROM logindetails where id='"
					+ f + "'";
			Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery(queryString);
			System.out.println("results " + results);
			while (results.next()) {
				String password = results.getString("password");
				System.out.println(password);
				if (s.equals(password)) {

					System.out.println("Welcpme " + results.getString("name"));
				} else {

					// JOptionPane.showMessageDialog(null,
					// "Please Check Username and Password ");
				}
			}
		} catch (SQLException sql) {

			System.out.println(sql);

		}
	}

	public String displayUsers(String id, String password) throws ClassNotFoundException {
		String message = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/cm", "root", "Navin1993S$");
			String queryString = "SELECT name, password FROM logindetails where id='"
					+ id + "'";
			Statement stmt = con.createStatement();
			ResultSet results = stmt.executeQuery(queryString);
			while (results.next()) {
				String pwd = results.getString("password");
				System.out.println(password);
				if (password.equals(pwd)) {

					message = "Welcpme " + results.getString("name");
				} else {
					message = "The Id or password is incorrect";
					// JOptionPane.showMessageDialog(null,
					// "Please Check Username and Password ");
				}
			}
		} catch (SQLException sql) {

			System.out.println(sql);

		}
		return message;
	}
}
