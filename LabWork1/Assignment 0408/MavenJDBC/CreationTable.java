package MavenJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreationTable {

	void createtable() {
		
		String url = "jdbc:mysql://localhost:3306/lab";
		String driver = "com.mysql.cj.jdbc.Driver";
		String create = "CREATE TABLE `Laptop` (`lmodel_no` INT NOT NULL,`lname` CHAR(45) NOT NULL,`l_brand` CHAR(45) NOT NULL,`prices` INT(4) NOT NULL,PRIMARY KEY(`lmodel_no`), UNIQUE INDEX `lmodel_no_UNIQUE` (`lmodel_no` ASC) VISIBLE);";
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
