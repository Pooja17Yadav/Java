package MavenJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertionData {

		void insertdata()
	{
		
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/lab";
		String driver = "com.mysql.cj.jdbc.Driver";
		String insert = "INSERT INTO `Laptop` (`lmodel_no`,`lname`,`l_brand`,`prices`)VALUES(?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName(driver);
			System.out.println("Driver loaded successfully");
			con = DriverManager.getConnection(url,"root","@pooja#9136");
			System.out.println("Connection Established");
			pstmt = con.prepareStatement(insert);
			System.out.println("Platform created successfully");
			for(int i=0;i<=10;i++)
			{
				System.out.println("Enter Laptop model number :");
				int lm_no = s.nextInt();
				System.out.println("Enter Laptop name :");
				String ln = sc.nextLine();
				System.out.println("Enter Laptop brand:");
				String lb = sc.nextLine();
				System.out.println("Enter Laptop prices :");
				int lp = s.nextInt();
				pstmt.setInt(1,lm_no);
				pstmt.setString(2,ln);
				pstmt.setString(3,lb);
				pstmt.setInt(4,lp);
				pstmt.executeUpdate();
				System.out.println("Data Entered");
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		finally
		{
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			sc.close();
			s.close();
		}

	}

}
