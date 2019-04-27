package JdbcExercises;

import java.util.ArrayList;

public class StudentListProgram {

	/**
	 * Database access example using the DAO design pattern. NB! There is no
	 * JDBC-related code in this class!
	 * 
	 * @author Kari
	 * @version 1.0
	 */

	public static void main(String[] args) {

		try {
			// 1. Create a DAO object for accessing the data
			StudentDAO StudentDAO = new StudentDAO();

			// 2. Get a list of all movies
			ArrayList<Student> studentList = StudentDAO.getAllStudents();

			for (Student student : studentList) {
				System.out.println(student.getFirstname() + " " + student.getLastname() + ", " + student.getStreetaddress() + ", " +student.getPostcode()+ ", "+ student.getPostoffice());
			}

		} catch (Exception ex) {
			System.out.println("The database is temporarily unavailable. Please try again later. \n");
			System.out.println("=== System error message (for the developer's eyes only) === \n" + ex.getMessage());
		}
	}
}
// End
