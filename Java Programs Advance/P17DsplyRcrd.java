import java.sql.*;

public class P17DsplyRcrd {

	public static void main(String[] args) {
		// Display Records using ResultSet

		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sameer","4545");
			
			Statement st = c.createStatement();
			
			ResultSet r1 = st.executeQuery("select * from student");
			
			while(r1.next()) {
				System.out.println(r1.getInt(1) + "\t" + r1.getString(2));
			}
			
			c.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
