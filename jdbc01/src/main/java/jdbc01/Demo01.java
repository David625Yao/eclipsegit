package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	
    	 
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3","root","");
		Statement stat = conn.createStatement();	
		stat.execute("create table person(id int,name varchar(10))");
		System.out.println("success");
	}
}
