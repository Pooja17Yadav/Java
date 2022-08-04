package MavenJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData {

		void fetchdata()
	 {
		
		String url = "jdbc:mysql://localhost:3306/lab";
		String driver = "com.mysql.cj.jdbc.Driver";
		String select = "select * from Laptop ";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			
			con = DriverManager.getConnection(url,"root","@pooja#9136");
			System.out.println("Connection Established");
			
			pstmt = con.prepareStatement(select);
			System.out.println("Platform created successfully ");
			ResultSet rs = pstmt.executeQuery(select);

			while(rs.next())
			{
				int lmodel_no = rs.getInt("lmodel_no");
				String lname = rs.getString("lname");
			
				String l_brand = rs.getString("l_brand");
				int prices = rs.getInt("prices");
				System.out.println(lmodel_no+" "+lname+" "+l_brand+" "+prices);
			}
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
