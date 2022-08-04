package MavenJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	void deleteData()
	{
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/lab";
		String driver = "com.mysql.cj.jdbc.Driver";
		String Delete = "delete from Laptop where lmodel_no=?";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			con = DriverManager.getConnection(url,"root","@pooja#9136");
			System.out.println("Connection Established");
			
			System.out.println("Enter Laptop Model whose data you want to delete: ");
			int lmodel_no=sc.nextInt();
			pstmt.setInt(1, lmodel_no);
			pstmt.executeUpdate();
			System.out.println("Laptop data with lmodel_no"+lmodel_no+"has been deleted from database");
	}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		finally
		{
			try 
			{
				pstmt.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			try 
			{
				con.close();
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}
	}
}
