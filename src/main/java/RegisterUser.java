import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class RegisterUser {
	
	static int status=0;

	public static int register(String username,String password,String repassword,double amount,String adderess,double phone){

		Connection con= DBConnector.con;
	
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("Insert into NEWACCOUNT(USERNAME,PASSWORD,REPASSWORD,AMOUNT,ADDRESS,PHONE) values(?,?,?,?,?,?)");
		
			ps.setString(1,username);
			ps.setString(2,password);
			ps.setString(3,repassword);
			ps.setDouble(4,amount);
			ps.setString(5,adderess);
			ps.setDouble(6,phone);
			
			status=ps.executeUpdate();
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return status;
		
	}
}
