import java.sql.*;

public class P14CrtTable {

	public static void main(String[] args) {
		// JDBC Create Table 

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");		// Loading Driver
			
			// Establish the Connection
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sameer","4545");
			
			Statement st = c.createStatement();		// Creating Statement
			
			String s1 = "create table student(id int, name varchar(10))";
			
			st.execute(s1);				// Executing Query
			
			System.out.println("Table Created Successfully");
			
			c.close();		// Closing Connection
		}
		
		catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
