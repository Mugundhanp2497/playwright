package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class dbtest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con = DriverManager.getConnection("jdbc:sqlserver://10.10.1.200,1444:1444;user=amcs_user;password=@lph@mcs11;");
		Statement stmnt = con.createStatement();
		stmnt.executeQuery("");
		con.close();
	}
	
}
