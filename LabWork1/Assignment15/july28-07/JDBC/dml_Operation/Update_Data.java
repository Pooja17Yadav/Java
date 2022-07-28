package dml_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_Data {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		String update = "Update project1 set l_name= \"Hello\";";
		Connection con = null;
		Statement stmt = null;
		
		try
		{
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			con = DriverManager.getConnection(url,"root","@pooja#9136");
			System.out.println("Connection Established Successfully..");
			stmt=con.createStatement();
			System.out.println("Platform created successfully ..");
			stmt.execute(update);
			System.out.println("Cloumn Updated");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		}

	}

}
