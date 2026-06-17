import java.sql.*;

public class P15InsrtRcrd {

	public static void main(String[] args) {
		// Inserting Records in Table

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sameer","4545");
			
			Statement st = c.createStatement();
			
			String s1 = "insert into student values(101,'Sameer')";
			st.executeUpdate(s1);
			
			System.out.println("Record Inserted Successfully");
			
			c.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
