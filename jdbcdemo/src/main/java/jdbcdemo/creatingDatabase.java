package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class creatingDatabase 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//step1: load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step2: established connection..
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
		
		//create statement
		Statement st = con.createStatement();
		
		
		//excute the query
		st.execute("create table"+"student(name varchar(25),age integer(0-9)"+"address varchar(25))");
		
		
		//close the connection
		con.close();
		
		System.out.println("helloworld");
		
		
	}
}
