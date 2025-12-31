
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Program1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/CLG";
		String user = "root";
		String password= "admin123";
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con = DriverManager.getConnection(url, user, password);
			  System.out.println("Database Connected Successfully!");
   
			   con.close();
		}
		catch (ClassNotFoundException e) {

            System.out.println("JDBC Driver not found: " + e.getMessage());

        } 
        catch (SQLException e) {

      System.out.println("Database connection error: " + e.getMessage());

           
	}
		
	}

}
