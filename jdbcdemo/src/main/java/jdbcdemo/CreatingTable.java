package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreatingTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "root");
		
		PreparedStatement ps = con.prepareStatement("insert into book values(?,?,?,?)");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out.println("enter id...");
		String name  = sc.next();
		System.out.println("enter name...");
		int price = sc.nextInt();
		
		System.out.println("enter price..");
		String address = sc.next();
		
		ps.setInt(1, id);
		ps.setString(2,name);
		ps.setInt(3, price);
		ps.setString(4,address);
		
		
		ps.executeUpdate();
		
		System.out.println("done....");
	}

}
