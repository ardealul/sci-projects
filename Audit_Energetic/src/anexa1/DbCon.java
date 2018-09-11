package anexa1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbCon {
public static Connection con;
public void openConnection() {
	
	String connectionUrl= "jdbc:sqlserver://localhost:1433;databaseName=Anexa1;";
//			"jdbc:sqlserver://(LocalDb)/Radum;databasename=Anexa1;integratedSecurity=false;";

	try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM Person.Contact";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                //System.out.println(rs.getString("FirstName") + " " + rs.getString("LastName"));
            }
		}
	
	 catch(Exception e) {
		System.out.println(e);
	}
	}
}
	
