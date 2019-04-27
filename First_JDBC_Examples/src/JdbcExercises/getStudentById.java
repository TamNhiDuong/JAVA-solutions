package JdbcExercises;

import java.util.ArrayList;
import java.util.Scanner;

import MovieDB_examples.Movie;
public class getStudentById {

		/**
		 * Database access example using the DAO design pattern. NB! There is no
		 * JDBC-related code in this class!
		 * 
		 * @author Kari
		 * @version 1.0
		 */

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in); 

			try {
				// 1. Create a DAO object for accessing the data
				StudentDAO StudentDAO = new StudentDAO();

				// 2. Get a list of all movies
				ArrayList<Student> studentList = StudentDAO.getAllStudents();

				System.out.print("Enter student Id: ");
				int givenId = Integer.parseInt(input.nextLine());
				
				
				// 3. Get a list of movies for the given year only
				studentList = StudentDAO.getStudentForGivenId(givenId);
				
				for (Student student : studentList) {
					System.out.println(student.getFirstname() + " " + student.getLastname() + ", " + student.getStreetaddress() + ", " +student.getPostcode()+ " "+ student.getPostoffice());		
				}

			} catch (Exception ex) {
				System.out.println("The database is temporarily unavailable. Please try again later. \n");
				System.out.println("=== System error message (for the developer's eyes only) === \n" + ex.getMessage());
			}
		}
	}

