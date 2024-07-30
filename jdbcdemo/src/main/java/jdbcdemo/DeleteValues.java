package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteValues 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		Statement st =con.createStatement();
//	st.execute("create table student(name varchar(25), age integer, address varchar(25))");
		st.execute("insert into student values ('tarun',23,'kadiri')");
//		st.execute("delete from student where name = tarun");
		
		System.out.println("delete values...");
		
}
}