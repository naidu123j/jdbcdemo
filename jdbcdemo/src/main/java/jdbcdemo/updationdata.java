package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updationdata 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		Statement st =con.createStatement();
		st.execute("update student set address = 'kadapa' where age='23'");
		System.out.println("update data");
		con.close();
}
}