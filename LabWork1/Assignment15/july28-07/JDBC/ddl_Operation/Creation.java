package ddl_Operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Creation {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/project1";
		String driver = "com.mysql.cj.jdbc.Driver";
		String create = "CREATE TABLE `project1` (`emp_id` INT NOT NULL,`f_name` CHAR(45) NOT NULL,`l_name` CHAR(45) NOT NULL, `department` CHAR(45) NOT NULL,`salary` DECIMAL(12,2) NOT NULL,PRIMARY KEY(`emp_id`), UNIQUE INDEX `emp_id_UNIQUE` (`emp_id` ASC) VISIBLE);";
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
			stmt.execute(create);
			System.out.println("Table created");
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
