package dml_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		String insert = "INSERT INTO `project1` (`emp_id`,`f_name`,`l_name`, `department`,`salary`)VALUES(?,?,?,?,?)";
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
			for(int i=0;i<4;i++)
			{
				System.out.println("Enter Employee Id :");
				int id = s.nextInt();
				System.out.println("Enter Employee First name :");
				String fname = sc.nextLine();
				System.out.println("Enter Employee Last name :");
				String lname = sc.nextLine();
				System.out.println("Enter Department:");
				String depart = sc.nextLine();
				System.out.println("Enter Salary :");
				int sal = s.nextInt();
				pstmt.setInt(1,id);
				pstmt.setString(2,fname);
				pstmt.setString(3,lname);
				pstmt.setString(4,depart);
				pstmt.setInt(5,sal);
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
