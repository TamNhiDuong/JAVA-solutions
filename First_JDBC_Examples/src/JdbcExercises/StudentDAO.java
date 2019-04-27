package JdbcExercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import MovieDB_examples.Movie;

/**
 * DAO class for accessing movies. 
 * NB! There is no user input/output in this class!
 * 
 * @author Kari
 * @version 1.1 2017-10-22
 */
public class StudentDAO 
{
	private final String username;			 
	private final String password; 
	private final String databaseURL;

	public StudentDAO() throws Exception {
		username = ConnectionParameters.username;			 
		password = ConnectionParameters.password;
		databaseURL = ConnectionParameters.databaseURL;
		
		// In *Tomcat 8* the JDBC driver must be explicitly loaded as below
		try {
			Class.forName(ConnectionParameters.jdbcDriver);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		} 
    }
	
	/**
	 * Opens a new database connection 
	 * @throws SQLException
	 */
	private Connection openConnection() throws SQLException	{
		Connection dbConnection = DriverManager.getConnection(databaseURL, username, password);
		return dbConnection;
	}
	
	/**
	 * Closes an existing database connection 
	 * @throws SQLException
	 */
	private void closeConnection(Connection dbConnection) throws SQLException {
		if (dbConnection != null) {
			dbConnection.close();
		}
	}
		
	/**
	 * Retrieves all movies from the database. 
	 * @return ArrayList<Movie> - a List of Movies
	 * @throws SQLException
	 */
	public ArrayList<Student> getAllStudents() throws SQLException {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Connection dbConnection = null;
		
		try {
			dbConnection = openConnection();

			String sqlText = 
					"SELECT firstname, lastname, streetaddress, postoffice, postcode " +
					"FROM Student ORDER BY id";
			
			PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);
			
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String firstname = resultSet.getString("firstname");
				String lastname = resultSet.getString("lastname");
				String streetaddress = resultSet.getString("streetaddress");
				String postoffice = resultSet.getString("postoffice");
				String postcode = resultSet.getString("postcode");

				studentList.add(new Student(firstname, lastname, streetaddress, postoffice, postcode));
			}
			
			return studentList;
			
		} catch (SQLException sqle)	{
			throw sqle;	// Let the caller decide what to do with the exception
			
		} finally {
			closeConnection(dbConnection);
		}
	}
	/**
	 * Retrieves movies from the database for the given year 
	 * @return ArrayList<Movie> - a List of Movies
	 * @throws SQLException
	 */
	public ArrayList<Student> getStudentForGivenId(int givenId) throws SQLException {
		ArrayList<Student> studentList = new ArrayList<Student>();
		Connection dbConnection = null;
		
		try {
			dbConnection = openConnection();

			String sqlText = "SELECT * FROM Student WHERE id = ?";
			
			PreparedStatement preparedStatement = dbConnection.prepareStatement(sqlText);
			preparedStatement.setInt(1, givenId);
			
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				String firstname = resultSet.getString("firstname");
				String lastname = resultSet.getString("lastname");
				String streetaddress = resultSet.getString("streetaddress");
				String postoffice = resultSet.getString("postoffice");
				String postcode = resultSet.getString("postcode");

				studentList.add(new Student(firstname, lastname, streetaddress, postoffice, postcode));
			}
			
			return studentList;
			
		} catch (SQLException sqle)	{
			throw sqle;  // Let the caller decide what to do with the exception
			
		} finally {
			closeConnection(dbConnection);
		}
	}
}
// End