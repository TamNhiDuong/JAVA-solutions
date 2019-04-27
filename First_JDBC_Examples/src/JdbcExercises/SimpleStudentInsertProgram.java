package JdbcExercises;
import java.sql.*;
import java.util.Scanner;
public class SimpleStudentInsertProgram {
	

	/**
	 * A minimal example of executing an SQL INSERT statement
	 * 
	 * @author Kari
	 * @version 1.0
	 */
		
		public static void main(String[] args) {
			String username = ConnectionParameters.username;			 
			String password = ConnectionParameters.password;
			String databaseURL = ConnectionParameters.databaseURL;
			Connection dbConnection = null;	
	 
			System.out.println("Enter student data");
			Scanner input = new Scanner(System.in); 
			
			System.out.print("Id: ");
			int id = Integer.parseInt(input.nextLine());
			System.out.print("First name: ");
			String firstname = input.nextLine();
			System.out.print("Last name:");
			String lastname = input.nextLine(); 
			System.out.print("Street:");
			String street = input.nextLine(); 
			System.out.print("Postcode:");
			String postcode= input.nextLine(); 
			System.out.print("Post office:");
			String postoffice = input.nextLine(); 
					
			try {
				dbConnection = DriverManager.getConnection(databaseURL, username, password);
								
				String sqlText = "INSERT INTO Student (id, firstname, lastname, streetaddress, postcode, postoffice) VALUES (?, ?, ?, ?, ?, ?)";
				
				PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, firstname);
				preparedStatement.setString(3, lastname);
				preparedStatement.setString(4, street);
				preparedStatement.setString(5, postcode);
				preparedStatement.setString(6, postoffice);
				
				preparedStatement.executeUpdate();

				System.out.println("Student data saved successfully!");
				
			} catch (SQLException sqle) {
				
				// First, check if the problem is primary key violation (the error code is vendor-dependent)
				if (sqle.getErrorCode() == ConnectionParameters.PK_VIOLATION_ERROR) {
					System.out.println("Cannot insert the movie. " +
				        "The student id (" + id + ") is already in use.");
				} else {
					System.out.println("===== Database error =====\n" + sqle.getMessage());
				}
				
			} finally {
				if (dbConnection != null) {
					try {
						dbConnection.close();
					} catch (SQLException sqle) {
						System.out.println("\nClose connection failed. \n" + sqle.getMessage());
					}
				}
			}
			
		}
	}
	// End
