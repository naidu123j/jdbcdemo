package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Esatablishconnetion 
{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		//load and register the driver
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//established connetion
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root","root");
		
		Statement st = con.createStatement();
		
		st.execute("create table"+"student(name varchar(25),age integer(0-9)"+"address varchar(25))");
		
		System.out.println(" table create.... ");
		
		con.close();
		
		System.out.println("hello");
		
	}
}
