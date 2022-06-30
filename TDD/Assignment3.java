package TDDAssignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Assignment3 {
	
	public static boolean chekPassAndEmail(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mail");
		String email=sc.next();
		System.out.println("Enter your password");
		String pass= sc.next();
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			System.out.println("loding...");
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/employee","root","Vinod@1997"); 
			//here sonoo is database name, root is username and password  
			
			
			Statement stmt=con.createStatement();
		//	String s1l="insert into user(username,password) value('aakya','pakya')";
		//	stmt.executeUpdate(s1l);
			ResultSet rs=stmt.executeQuery("select * from user where username= '"+email+"' && password='"+pass+"'");  
			
			if(rs.next()==true) 
			{
				return true;
//				System.out.println("aahe");
			}
			  
			con.close();  
			}catch(Exception e){ System.out.println(e);
			
			}
		return false;  

	 
    }
}
