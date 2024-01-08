package jdbc;
import java.sql.*;
public class DatabaseManagement {
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/?user=root";
	   static final String USER = "root";
	   static final String PASS = "shrey2308";
	   
	   static final String QUERY = "SELECT ID, FirstName, LastName FROM Employees";
	   static final String DB_QUERY = "USE ISS";

	   public static void main(String[] args) {
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
	         Statement stmt = conn.createStatement();
	    	 stmt.execute(DB_QUERY);
	         ResultSet rs = stmt.executeQuery(QUERY); 
	         // Extract data from result set
	         while (rs.next()) {
	            // Retrieve by column name
	            System.out.print("ID: " + rs.getInt("ID"));
	            System.out.print(", FirstName: " + rs.getString("FirstName"));
	            System.out.println(", LastName: " + rs.getString("LastName"));
	         }
	      } 
	      catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
}
