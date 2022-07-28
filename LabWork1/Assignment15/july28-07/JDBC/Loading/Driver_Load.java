package loading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver_Load {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try
		{
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			
			Connection cn = DriverManager.getConnection(url,"root","@pooja#9136");
			System.out.println("Connection Established Successfully..");
		}
		catch(ClassNotFoundException |SQLException e)
		{
			System.out.println("Problem while loading the driver ");
			e.printStackTrace();
		}

	}

}
