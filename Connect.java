package Electricity;
import java.sql.*;

public class Connect {
	Statement s;

	Connect(){
		//Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c;
		//Statement s;
		try {
		c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","9807468678");
		s=c.createStatement();
		}catch(Exception e) {
			e.printStackTrace();		}
	}
	
public static void main(String args[]) {
	new Connect();
}
}
