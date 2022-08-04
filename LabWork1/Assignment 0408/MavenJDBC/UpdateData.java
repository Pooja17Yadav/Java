package MavenJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {

		private Scanner s;

		void updateData()
		{
			Scanner sc=new Scanner(System.in);
			Scanner s=new Scanner(System.in);
			
			String url = "jdbc:mysql://localhost:3306/lab";
			String driver = "com.mysql.cj.jdbc.Driver";
			
			String update_lm_no="update laptop set Model=? where Laptop_lmodel=? ;";
			String update_ln="update laptop set L_Name=? where Laptop_lmodel=?;";
			String update_lb="update laptop set L_Brand=? where Laptop_lmodel=?;";
			String update_lp="update laptop set L_Prices =? where Laptop_lmodel=? ;";
			
			Connection con=null;
			PreparedStatement pstmt=null;
			
			try
			{
				Class.forName(driver);
				System.out.println("Driver loaded successfully");
				con = DriverManager.getConnection(url,"root","@pooja#9136");
				System.out.println("Connection Established");
				
				System.out.println("Enter Laptop Model whose data you want to update: ");
				int lmodel_no=s.nextInt();
				
				System.out.println("Enter the data you want to update: ");
				System.out.println("1: Laptop model number ");
				System.out.println("2: Laptop name ");
				System.out.println("3: Laptop brand ");
				System.out.println("4: Laptop prices ");
				int ch=s.nextInt();
				
				switch(ch)
				{
				case 1: pstmt = update_Laptop_Model_no(sc, update_lm_no, con, lmodel_no);
						break;
						
				case 2: pstmt = update_Laptop_Name(sc, update_ln, con, lmodel_no);
						break;
						
				case 3: pstmt = update_Laptop_Brand(sc, update_lb, con, lmodel_no);
						break;
						
				case 4: pstmt = update_Loptop_Prices(s, update_lp, con, lmodel_no);
						break;
						
				}
				
				System.out.println("Data Updated");
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

		private PreparedStatement update_Loptop_Prices(Scanner sc, String update_lp, Connection con, int lmodel_no)
		throws SQLException
		{
			PreparedStatement pstmt;
				System.out.println("Enter Laptop Prices: ");
						int lp=s.nextInt();
						pstmt=con.prepareStatement(update_lp);
						pstmt.setInt(2, lmodel_no);
						pstmt.setInt(1,lp);
						pstmt.executeUpdate();
				return pstmt;
		}

		private PreparedStatement update_Laptop_Brand(Scanner sc, String update_lb, Connection con, int lmodel_no) 
				throws SQLException
		{
			PreparedStatement pstmt;
			System.out.println("Enter Laptop Brand: ");
					String lb=sc.nextLine();
					pstmt=con.prepareStatement(update_lb);
					pstmt.setInt(2, lmodel_no);
					pstmt.setString(1,lb);
					pstmt.executeUpdate();
			return pstmt;
		}

		private PreparedStatement update_Laptop_Name(Scanner sc, String update_ln, Connection con, int lmodel_no) 
				throws SQLException
		{
			PreparedStatement pstmt;
			System.out.println("Enter Laptop Name: ");
					String ln=sc.nextLine();
					pstmt=con.prepareStatement(update_ln);
					pstmt.setInt(2, lmodel_no);
					pstmt.setString(1,ln);
					pstmt.executeUpdate();
			return pstmt;
		}

		private PreparedStatement update_Laptop_Model_no(Scanner sc, String update_lm_no, Connection con, int lmodel_no) 
				throws SQLException
		{	
			PreparedStatement pstmt;
			System.out.println("Enter Laptop Model number : ");
					int lm_no=sc.nextInt();
					pstmt=con.prepareStatement(update_lm_no);
					pstmt.setInt(2, lmodel_no);
					pstmt.setInt(1,lm_no);
					pstmt.executeUpdate();
			return pstmt;
		}
}
