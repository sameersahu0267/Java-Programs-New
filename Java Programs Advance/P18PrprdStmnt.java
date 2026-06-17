import java.sql.*;

public class P18PrprdStmnt {

	public static void main(String[] args) {
		// Prepared Statement in Java
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sameer","4545");
			
			String s1 = "insert into student values(?,?)";
			PreparedStatement pst = c.prepareStatement(s1);
			
			pst.setInt(1, 106);
			pst.setString(2, "Akash");
			
			pst.executeUpdate();
			
			System.out.println("Record Inserted Successfully");
			
			c.close();
		}
		
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
